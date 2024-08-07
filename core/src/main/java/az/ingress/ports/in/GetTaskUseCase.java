package az.ingress.ports.in;

import az.ingress.view.TaskView;

import java.util.List;

public interface GetTaskUseCase {

    TaskView get(Long id);

    List<TaskView> getAll();

}
