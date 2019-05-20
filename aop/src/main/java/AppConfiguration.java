import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AppConfiguration {
    @Bean
    public Student student() {
        return new Student();
    }

    @Bean
    public AOPExemple aopExemple() {
        return new AOPExemple();
    }
}
