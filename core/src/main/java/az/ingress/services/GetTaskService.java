package az.ingress.services;

import az.ingress.ports.out.RetrieveTaskPort;
import az.ingress.domain.Task;
import az.ingress.ports.in.GetTaskUseCase;
import az.ingress.view.TaskView;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GetTaskService implements GetTaskUseCase {

    private final RetrieveTaskPort retrieveTaskPort;
    private final ModelMapper modelMapper;

    @Override
    public TaskView get(Long id) {
        Task task = retrieveTaskPort.get(id);
        return modelMapper.map(task, TaskView.class);
    }

    @Override
    public List<TaskView> getAll() {
        List<Task> tasks = retrieveTaskPort.getAll();
        return tasks.stream()
                .map(task -> modelMapper.map(task, TaskView.class))
                .toList();
    }

}
