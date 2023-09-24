package info.h9.domain.client.company.category;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "client_company_category_master")
public class ClientCompanyCategoryMaster {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "client_company_category_name", nullable = false, length = Integer.MAX_VALUE)
    private String clientCompanyCategoryName;

}