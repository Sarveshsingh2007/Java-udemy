package com.sarvesh.spring_boot_rest.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
@Aspect   // aspect
public class LoggingAspect {
    public static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);
//    @Before("execution(* com.sarvesh.spring_boot_rest.service.JobService.*(..))") // advice
//    public void logMethodCall() {
//        logger.info("Method Called");
//    }
    @Before("execution(* com.sarvesh.spring_boot_rest.service.JobService.getJob(..))")
    public void logMethodCall(JoinPoint jp){
        logger.info("Method called " + jp.getSignature().getName());
    }

    @After("execution(* com.sarvesh.spring_boot_rest.service.JobService.getJob(..))")
    public void logMethodExecuted(JoinPoint jp){
        logger.info("Method executed " + jp.getSignature().getName());
    }

    @AfterThrowing("execution(* com.sarvesh.spring_boot_rest.service.JobService.getJob(..))")
    public void logMethodCrash(JoinPoint jp){
        logger.info("Method Crashed " + jp.getSignature().getName());
    }

    @AfterReturning("execution(* com.sarvesh.spring_boot_rest.service.JobService.getJob(..))")
    public void logMehtodExecutedSuccess(JoinPoint jp){
        logger.info("Method Executed Successfully " + jp.getSignature().getName());
    }
}
