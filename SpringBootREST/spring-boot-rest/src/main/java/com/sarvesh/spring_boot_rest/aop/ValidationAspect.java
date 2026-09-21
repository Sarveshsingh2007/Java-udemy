package com.sarvesh.spring_boot_rest.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ValidationAspect {

    public static final Logger logger =
            LoggerFactory.getLogger(ValidationAspect.class);

    @Around(
            value = "execution(* com.sarvesh.spring_boot_rest.service.JobService.getJob(..)) && args(postId)",
            argNames = "jp,postId"
    )
    public Object validateAndUpdate(
            ProceedingJoinPoint jp, int postId) throws Throwable {

        if (postId < 0) {
            logger.info("Post ID is negative, Updating it...");
            postId = -postId;
            logger.info("New Value: " + postId);
        }

        return jp.proceed(new Object[]{postId});
    }
}