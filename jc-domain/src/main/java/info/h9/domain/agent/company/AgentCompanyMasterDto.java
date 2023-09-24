package info.h9.domain.agent.company;

import jakarta.validation.constraints.NotNull;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link AgentCompanyMaster}
 */
@Value
public class AgentCompanyMasterDto implements Serializable {
    Long id;
    @NotNull
    String agentName;
}