package config;


import main.objects.Cat;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    public Cat cat() {
        Cat c = new Cat();
        c.name = "Tom";
        return c;

    }

}
