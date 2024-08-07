package az.ingress.ports.in;

import az.ingress.commands.CreateTaskCommand;
import az.ingress.view.TaskView;

public interface CreateTaskUseCase {

    TaskView createTask(CreateTaskCommand createTaskCommand);

}
