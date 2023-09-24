package info.h9.domain.client.company;

import jakarta.validation.constraints.NotNull;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link info.h9.domain.client.company.ClientCompanyMaster}
 */
@Value
public class ClientCompanyMasterDto implements Serializable {
    Long id;
    @NotNull
    String clientCompanyName;
}