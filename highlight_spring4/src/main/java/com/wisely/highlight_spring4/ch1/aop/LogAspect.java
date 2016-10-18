package com.wisely.highlight_spring4.ch1.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;


@Aspect //1
@Component //2
public class LogAspect {
	
	@Pointcut("@annotation(com.wisely.highlight_spring4.ch1.aop.Action)") //3
	public void annotationPointCut(){};
	
	  @After("annotationPointCut()") //4
	    public void after(JoinPoint joinPoint) {
	        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
	        Method method = signature.getMethod();
	        Action action = method.getAnnotation(Action.class); 
	        System.out.println("注解式拦截 " + action.name()); //5
	    }
	  
	   @Before("execution(* com.wisely.highlight_spring4.ch1.aop.DemoMethodService.*(..))") //6
	    public void before(JoinPoint joinPoint){
	        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
	        Method method = signature.getMethod();
	        System.out.println("方法规则式拦截,"+method.getName());

	    }
	   
	  
	
}
