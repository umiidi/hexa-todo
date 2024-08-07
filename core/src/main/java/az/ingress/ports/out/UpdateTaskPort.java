package az.ingress.ports.out;

import az.ingress.commands.UpdateTaskCommand;
import az.ingress.domain.Task;

public interface UpdateTaskPort {

    Task updateTask(UpdateTaskCommand updateTaskCommand);

}
