
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class AOPExemple {
    @Pointcut("execution (* Student.display())")
    public void studentDisplay() {}

    @Pointcut("execution (* Student.*(..))")
    public void studentMethod() {}



    @Before("studentDisplay()")
    void display(JoinPoint jp) {
        System.out.println(jp.getSignature().getName());
    }

    @After("studentMethod()")
    void display2(JoinPoint jp) {
        System.out.println("method: " + jp.getSignature().getName());
    }

    @Around("studentMethod()")
    void display3(ProceedingJoinPoint pjp) {
        System.out.println("method: " + pjp.getSignature().getName());
    }

}
