package info.h9.repository.client;

import info.h9.domain.client.company.ClientCompanyMaster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientCompanyMasterRepository extends JpaRepository<ClientCompanyMaster, Long> {
}