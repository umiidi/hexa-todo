package az.ingress.ports.out;

import az.ingress.domain.Task;
import az.ingress.commands.CreateTaskCommand;

public interface SaveTaskPort {

    Task save(CreateTaskCommand taskRequest);

}
