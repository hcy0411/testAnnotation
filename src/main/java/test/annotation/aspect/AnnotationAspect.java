package test.annotation.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import test.annotation.annotation.TestAnnotation;

import java.lang.reflect.Method;

/**
 * Created by hanchunyang on 2017/7/7.
 */
@Aspect
@Component
public class AnnotationAspect {

    public AnnotationAspect() {
    }
    @Around("@annotation(test.annotation.annotation.TestAnnotation)")
    public Object checkValue(ProceedingJoinPoint pjp) throws Exception {

        MethodSignature ms = (MethodSignature) pjp.getSignature();
        Method method = ms.getMethod();
        if (method.getDeclaringClass().isInterface()) {
            method = pjp.getTarget().getClass().getDeclaredMethod(ms.getName(), method.getParameterTypes());
        }

        TestAnnotation testAnnotation = method.getAnnotation(TestAnnotation.class);

        String checkValue = testAnnotation.checkValue();

        Object result = new Object();

        if ("true".equals(checkValue)) {
            try {
                result = pjp.proceed();
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        } else {
            System.out.println("check false");
        }

        return result;
    }
}
