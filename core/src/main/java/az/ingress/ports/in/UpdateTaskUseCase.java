package az.ingress.ports.in;

import az.ingress.commands.UpdateTaskCommand;
import az.ingress.view.TaskView;

public interface UpdateTaskUseCase {

    TaskView updateTask(UpdateTaskCommand updateTaskCommand);

}
