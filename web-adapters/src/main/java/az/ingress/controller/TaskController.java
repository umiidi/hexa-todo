package az.ingress.controller;

import az.ingress.commands.CreateTaskCommand;
import az.ingress.commands.UpdateTaskCommand;
import az.ingress.ports.in.CreateTaskUseCase;
import az.ingress.ports.in.DeleteTaskUseCase;
import az.ingress.ports.in.GetTaskUseCase;
import az.ingress.ports.in.UpdateTaskUseCase;
import az.ingress.request.TaskRequest;
import az.ingress.response.TaskResponse;
import az.ingress.view.TaskView;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
@RequiredArgsConstructor
public class TaskController {

    private final GetTaskUseCase getTaskUseCase;
    private final CreateTaskUseCase createTaskUseCase;
    private final UpdateTaskUseCase updateTaskUseCase;
    private final DeleteTaskUseCase deleteTaskUseCase;

    private final ModelMapper modelMapper;

    @GetMapping("/{id}")
    public TaskResponse get(@PathVariable Long id) {
        TaskView taskView = getTaskUseCase.get(id);
        return modelMapper.map(taskView, TaskResponse.class);
    }

    @GetMapping
    public List<TaskResponse> getAll() {
        return getTaskUseCase.getAll().stream()
                .map(taskView -> modelMapper.map(taskView, TaskResponse.class))
                .toList();
    }

    @PostMapping
    public TaskResponse create(@Valid @RequestBody TaskRequest task) {
        CreateTaskCommand createTaskCommand = modelMapper.map(task, CreateTaskCommand.class);
        TaskView taskView = createTaskUseCase.createTask(createTaskCommand);
        return modelMapper.map(taskView, TaskResponse.class);
    }

    @PutMapping("/{id}")
    public TaskResponse update(@PathVariable Long id, @Valid @RequestBody TaskRequest task) {
        UpdateTaskCommand updateTaskCommand = modelMapper.map(task, UpdateTaskCommand.class);
        updateTaskCommand.setId(id);
        TaskView taskView = updateTaskUseCase.updateTask(updateTaskCommand);
        return modelMapper.map(taskView, TaskResponse.class);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        deleteTaskUseCase.deleteTask(id);
    }

}
