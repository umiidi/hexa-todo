package az.ingress.view;

import lombok.Data;

@Data
public class TaskView {

    private Long id;
    private String name;
    private String description;
    private boolean completed;

}
