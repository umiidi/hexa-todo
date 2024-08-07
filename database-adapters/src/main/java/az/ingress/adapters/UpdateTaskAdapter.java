package az.ingress.adapters;

import az.ingress.commands.UpdateTaskCommand;
import az.ingress.domain.Task;
import az.ingress.entity.TaskEntity;
import az.ingress.ports.out.UpdateTaskPort;
import az.ingress.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UpdateTaskAdapter implements UpdateTaskPort {

    private final ModelMapper modelMapper;
    private final TaskRepository taskRepository;

    @Override
    public Task updateTask(UpdateTaskCommand updateTaskCommand) {
        TaskEntity taskEntity = modelMapper.map(updateTaskCommand, TaskEntity.class);
        taskEntity = taskRepository.save(taskEntity);
        return modelMapper.map(taskEntity, Task.class);
    }

}
