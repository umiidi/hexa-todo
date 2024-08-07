package az.ingress.services;

import az.ingress.ports.out.DeleteTaskPort;
import az.ingress.ports.in.DeleteTaskUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeleteTaskService implements DeleteTaskUseCase {

    private final DeleteTaskPort deleteTaskPort;

    @Override
    public void deleteTask(Long id) {
        deleteTaskPort.deleteTask(id);
    }

}
