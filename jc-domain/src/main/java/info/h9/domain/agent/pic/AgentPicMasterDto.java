package info.h9.domain.agent.pic;

import jakarta.validation.constraints.NotNull;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link info.h9.domain.agent.pic.AgentPicMaster}
 */
@Value
public class AgentPicMasterDto implements Serializable {
    Long id;
    @NotNull
    String agentPicName;
    String phoneNumber;
}