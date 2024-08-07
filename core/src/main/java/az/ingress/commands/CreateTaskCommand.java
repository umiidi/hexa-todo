package az.ingress.commands;

import lombok.Data;

@Data
public class CreateTaskCommand {

    private String name;
    private String description;
    private boolean completed;

}
