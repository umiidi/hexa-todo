package az.ingress.commands;

import lombok.Data;

@Data
public class UpdateTaskCommand {

    private Long id;
    private String name;
    private String description;
    private boolean completed;

}
