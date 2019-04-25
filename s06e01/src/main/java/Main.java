import databaseConfig.DatabaseConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import repository.PersonRepository;
import entities.Person;

public class Main {
    public static void main() {
        try(AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DatabaseConfig.class)) {
            PersonRepository personRepository = context.getBean(PersonRepository.class);
            personRepository.getPeople().forEach(System.out::println);

        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
