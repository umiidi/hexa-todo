package az.ingress.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class TaskRequest {

    @NotBlank
    private String name;

    @NotBlank
    private String description;

    private boolean completed;

}