package az.ingress.services;

import az.ingress.commands.UpdateTaskCommand;
import az.ingress.ports.out.UpdateTaskPort;
import az.ingress.domain.Task;
import az.ingress.ports.in.UpdateTaskUseCase;
import az.ingress.view.TaskView;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UpdateTaskService implements UpdateTaskUseCase {

    private final UpdateTaskPort updateTaskPort;
    private final ModelMapper modelMapper;

    @Override
    public TaskView updateTask(UpdateTaskCommand updateTaskCommand) {
        Task task = updateTaskPort.updateTask(updateTaskCommand);
        return modelMapper.map(task, TaskView.class);
    }

}
