/**
 * jhonye Indi.
 * Copyright (c) 2009-2019 All Rights Reserved.
 */
package indi.jhonye.template.biz.aop;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author jhonye
 * @version $Id: TestAop.java, v 0.1 2019-01-06 11:37 AM jhonye Exp $$
 */
@Aspect
@Component
public class TimeUsedAspect {

    @Pointcut("execution(*com.test.service.CacheDemoService.find*(..))")
    public void pointCut(){

    }

    @Before("execution(* findById*(..)) &&\" + \"args(id,..)")
    public void beforeDo() {

    }

    @Around("excudeService()")
    public void around() {

    }

    //@AfterReturning(pointcut=com.test.service.CacheDemoService.findById(..))",)
    public void afterDo() {

    }

}