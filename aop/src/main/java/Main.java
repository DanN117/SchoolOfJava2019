import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(AppConfiguration.class)
public class Main {

    public void test() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfiguration.class);
        ctx.refresh();
        Student st = ctx.getBean(Student.class);

        //TODO exemples
        st.setName("Vasile");
        st.setFacultate("ETTI");
        st.display();
    }
    public static void main(String[] args) {
       new Main().test();;
    }
}
