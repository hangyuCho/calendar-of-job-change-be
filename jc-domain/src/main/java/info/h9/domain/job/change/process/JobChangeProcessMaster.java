package info.h9.domain.job.change.process;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "job_change_process_master")
public class JobChangeProcessMaster {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "job_change_process_name", nullable = false, length = Integer.MAX_VALUE)
    private String jobChangeProcessName;

}