package info.h9.repository.event;

import info.h9.domain.event.Event;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends CrudRepository<Event, Long> {
    @NotNull List<Event> findAll();
}
