import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class MainAspect {
    @After("execution(* *(..))")
    public void entry(JoinPoint joinPoint) {
        System.out.println("Hello AspectJ!");
    }
}
