package az.ingress.adapters;

import az.ingress.domain.Task;
import az.ingress.commands.CreateTaskCommand;
import az.ingress.entity.TaskEntity;
import az.ingress.ports.out.SaveTaskPort;
import az.ingress.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SaveTaskAdapter implements SaveTaskPort {

    private final ModelMapper modelMapper;
    private final TaskRepository taskRepository;

    @Override
    public Task save(CreateTaskCommand taskRequest) {
        TaskEntity taskEntity = modelMapper.map(taskRequest, TaskEntity.class);
        taskEntity = taskRepository.save(taskEntity);
        return modelMapper.map(taskEntity, Task.class);
    }

}
