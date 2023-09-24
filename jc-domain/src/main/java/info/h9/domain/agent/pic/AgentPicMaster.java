package info.h9.domain.agent.pic;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "agent_pic_master")
public class AgentPicMaster {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "agent_pic_name", nullable = false, length = Integer.MAX_VALUE)
    private String agentPicName;

    @Column(name = "phone_number", length = Integer.MAX_VALUE)
    private String phoneNumber;

}