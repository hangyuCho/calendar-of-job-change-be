package info.h9.domain.repository.home;

import info.h9.domain.home.Home;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeRepository extends CrudRepository<Home, Long> {
}
