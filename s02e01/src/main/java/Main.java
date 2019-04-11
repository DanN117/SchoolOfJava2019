import beans.TransactionRepository;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        // mai bine cu try with resources
        AnnotationConfigApplicationContext context =  new AnnotationConfigApplicationContext(ProjectConfig.class);

        // TransactionRepository transactionRepository = context.getBean(TransactionRepository.class);

        // System.out.println(transactionRepository);

        TransactionRepository transactionRepository = context.getBean(name: "transactionRepository", TransactionRepository.class);
        TransactionRepository transactionRepository2 = context.getBean(name: "transactionRepository", TransactionRepository.class);

        // de incercat cu prototype, cu singleton
        //
    }
}
