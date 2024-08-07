package az.ingress.domain;

import lombok.Data;

@Data
public class Task {

    private Long id;
    private String name;
    private String description;
    private boolean completed;

}
