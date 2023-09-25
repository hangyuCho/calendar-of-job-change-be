package info.h9.domain.event;

import info.h9.domain.agent.company.AgentCompanyClientCompanyRelation;
import info.h9.domain.client.company.ClientCompanyMaster;
import info.h9.domain.job.change.process.JobChangeProcessMaster;
import info.h9.domain.meeting.category.MeetingCategoryType;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "event")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "schedule_start_at", nullable = false)
    private Instant scheduleStartAt;

    @Column(name = "schedule_end_at")
    private Instant scheduleEndAt;

    //@Column(name = "client_company_id")
    //private Long clientCompanyId;
    //@OneToOne
    //@JoinColumn(name = "client_company_id")
    //private privateClientCompanyMaster clientCompany;

    @OneToOne
    @JoinColumn(name = "job_change_process_id")
    private JobChangeProcessMaster jobChangeProcess;

    @OneToOne
    @JoinColumn(name = "client_company_id")
    private AgentCompanyClientCompanyRelation agentCompanyClientCompanyRelation;

    @Column(name = "meeting_link", length = Integer.MAX_VALUE)
    private String meetingLink;

    @Column(name = "meeting_category_type")
    @Enumerated(EnumType.STRING)
    private MeetingCategoryType meetingCategoryType;
}