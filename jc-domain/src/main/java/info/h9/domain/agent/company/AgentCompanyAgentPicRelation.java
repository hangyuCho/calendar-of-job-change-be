package info.h9.domain.agent.company;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "agent_company_agent_pic_relation")
public class AgentCompanyAgentPicRelation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "agent_company_id", nullable = false)
    private Long agentCompanyId;

    @NotNull
    @Column(name = "agent_pic_id", nullable = false)
    private Long agentPicId;

}