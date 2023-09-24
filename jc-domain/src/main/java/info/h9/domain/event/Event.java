package info.h9.domain.event;

import info.h9.domain.client.company.ClientCompanyMaster;
import info.h9.domain.job.change.process.JobChangeProcessMaster;
import info.h9.domain.meeting.category.MeetingCategoryType;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

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

    @OneToOne
    @JoinColumn(name = "client_company_id")
    private ClientCompanyMaster clientCompany;

    @OneToOne
    @JoinColumn(name = "job_change_process_id")
    private JobChangeProcessMaster jobChangeProcess;

    @Column(name = "meeting_link", length = Integer.MAX_VALUE)
    private String meetingLink;

    @Column(name = "meeting_category_type")
    @Enumerated(EnumType.STRING)
    private MeetingCategoryType meetingCategoryType;
}