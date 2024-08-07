package az.ingress.adapters;

import az.ingress.ports.out.DeleteTaskPort;
import az.ingress.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DeleteTaskAdapter implements DeleteTaskPort {

    private final TaskRepository taskRepository;

    @Override
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }

}
