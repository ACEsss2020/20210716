package spring.testboot.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component

public class LoggingAop {

    @Around("execution(public String spring.testboot.controller.sample2..*(..))")
    public Object executionAround(ProceedingJoinPoint joinPoint) throws Throwable{
        String name = joinPoint.getSignature().getName();
        try {
            System.out.println("コード（002）：execution-Around-Before-" + name);
            Object object = joinPoint.proceed();
            System.out.println("コード（003）：execution-Around-After-" + name);
            return object;
        } catch (Exception e) {
            System.out.println("コード（004）：execution-Around-Exception-" + name);
            e.printStackTrace();
            throw e;
        }
    }

}
