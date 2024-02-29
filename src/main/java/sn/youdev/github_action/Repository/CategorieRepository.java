package sn.youdev.github_action.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import sn.youdev.github_action.model.Categorie;

public interface CategorieRepository extends MongoRepository<Categorie,String> {
}
