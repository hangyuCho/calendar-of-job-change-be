package info.h9.domain.repository.event;

import info.h9.domain.event.Event;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EventRepository extends CrudRepository<Event, Long> {
    @NotNull List<Event> findAll();
}
