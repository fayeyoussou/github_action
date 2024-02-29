package sn.youdev.github_action.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "categories")
@AllArgsConstructor @NoArgsConstructor @Getter @Setter
public class Categorie {
    @Id
    private String id;
    private String name;
}
