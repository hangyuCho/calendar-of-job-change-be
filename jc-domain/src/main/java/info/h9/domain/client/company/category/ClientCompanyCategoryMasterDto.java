package info.h9.domain.client.company.category;

import jakarta.validation.constraints.NotNull;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link ClientCompanyCategoryMaster}
 */
@Value
public class ClientCompanyCategoryMasterDto implements Serializable {
    Long id;
    @NotNull
    String clientCompanyCategoryName;
}