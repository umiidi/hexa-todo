package az.ingress.services;

import az.ingress.ports.out.SaveTaskPort;
import az.ingress.domain.Task;
import az.ingress.commands.CreateTaskCommand;
import az.ingress.ports.in.CreateTaskUseCase;
import az.ingress.view.TaskView;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateTaskService implements CreateTaskUseCase {

    private final SaveTaskPort saveTaskPort;
    private final ModelMapper modelMapper;

    @Override
    public TaskView createTask(CreateTaskCommand createTaskCommand) {
        Task task = saveTaskPort.save(createTaskCommand);
        return modelMapper.map(task, TaskView.class);
    }

}
