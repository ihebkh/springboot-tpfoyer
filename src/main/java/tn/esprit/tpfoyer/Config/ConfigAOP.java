package tn.esprit.tpfoyer.Config;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class ConfigAOP {
    @Before("execution(* tn.esprit.tpfoyer.Service.*.*(..))")
    public void logMethodEntry(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("In method " + name + " : ");
    }
    @After("execution(* tn.esprit.tpfoyer.Service.*.*(..))")
    public void logMethodEXIT(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("OUT method " + name + " : ");
    }
    @Before("execution(* tn.esprit.tpfoyer.Service.*.retrieve*())")
    public void logMethodEntryBonjour(JoinPoint joinPoint) {
            log.info("Bonjour ");
    }
    @Around("execution(* tn.esprit.tpfoyer.Service.*.*(..))")
    public Object profile(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.currentTimeMillis();
        Object obj = pjp.proceed();
        long elapsedTime = System.currentTimeMillis() - start;
        log.info("Method execution time: " + elapsedTime + " milliseconds.");
        return obj;
    }
}
