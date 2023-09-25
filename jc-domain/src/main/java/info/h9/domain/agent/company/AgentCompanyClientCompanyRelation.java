package info.h9.domain.agent.company;

import info.h9.domain.client.company.ClientCompanyMaster;
import info.h9.domain.event.Event;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

import static java.util.Collections.emptySet;

@Getter
@Setter
@Entity
@Table(name = "agent_company_client_company_relation")
public class AgentCompanyClientCompanyRelation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToOne
    @JoinColumn(name = "agent_company_id", nullable = false)
    private AgentCompanyMaster agentCompanyMaster;

    @OneToOne
    @JoinColumn(name = "client_company_id", nullable = false)
    private ClientCompanyMaster clientCompanyMaster;

}