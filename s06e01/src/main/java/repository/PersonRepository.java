package repository;

import entities.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class PersonRepository {

    @PersistenceContext
    EntityManager entityManager;

    public List<Person> getPeople() {
        String query = "SELECT p FROM Person p";   // == SELECT * FROM Person
        List<Person> resultList = entityManager.createQuery(query).getResultList();

        return resultList;
    }

}
