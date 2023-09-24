package info.h9.repository.agent;

import info.h9.domain.agent.company.AgentCompanyMaster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgentCompanyMasterRepository extends JpaRepository<AgentCompanyMaster, Long> {
}