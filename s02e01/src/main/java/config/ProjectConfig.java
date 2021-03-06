package config;

import beans.TransactionRepository;
import org.omg.IOP.TransactionService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration

public class ProjectConfig {

    @Bean
    public TransactionRepository transactionRepositoryFactory() {
        TransactionRepository newTransactionRepository = new TransactionRepository();

        return newTransactionRepository;
    }


    @Bean
    @Primary
    public TransactionRepository transactionRepositoryFactory2() {
        TransactionRepository newTransactionRepository = new TransactionRepository();

        return newTransactionRepository;
    }


    @Bean // + singleton
    public TransactionService transactionServiceFactory() {
        TransactionService newTransactionServvice = new TransactionService();

        return newTransactionServvice;
    }
}
