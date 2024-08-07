package az.ingress.ports.out;

import az.ingress.domain.Task;

import java.util.List;

public interface RetrieveTaskPort {

    Task get(Long id);

    List<Task> getAll();

}
