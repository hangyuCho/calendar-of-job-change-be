package info.h9.domain.agent.company;

import jakarta.validation.constraints.NotNull;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link AgentCompanyAgentPicRelation}
 */
@Value
public class AgentCompanyAgentPicRelationDto implements Serializable {
    Long id;
    @NotNull
    Long agentCompanyId;
    @NotNull
    Long agentPicId;
}