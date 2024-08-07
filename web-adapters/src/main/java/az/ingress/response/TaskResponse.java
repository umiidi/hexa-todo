package az.ingress.response;

import lombok.Data;

@Data
public class TaskResponse {

    private Long id;
    private String name;
    private String description;
    private boolean completed;

}