package az.ingress.adapters;

import az.ingress.domain.Task;
import az.ingress.ports.out.RetrieveTaskPort;
import az.ingress.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class RetrieveTaskAdapter implements RetrieveTaskPort {

    private final ModelMapper modelMapper;
    private final TaskRepository taskRepository;

    @Override
    public Task get(Long id) {
        return taskRepository.findById(id)
                .map(taskEntity -> modelMapper.map(taskEntity, Task.class))
                .orElseThrow(() -> new RuntimeException("task not found with id: " + id));
    }

    @Override
    public List<Task> getAll() {
        return taskRepository.findAll().stream()
                .map(taskEntity -> modelMapper.map(taskEntity, Task.class))
                .toList();
    }

}
