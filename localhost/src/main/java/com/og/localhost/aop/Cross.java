package com.og.localhost.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect    // 관심 객체로 등록한다.
	       // - 기존의 XML <aop:aspect> 역할을 한다.
@Component 
// XML에서 빈을 만드는 대신에 클래스명 앞에 @Component 어노테이션을 적어주면 해당 클래스는 bean으로 자동 등록된다. 
// 그리고 bean의 이름은 해당 클래스명(첫글자는 소문자)이 된다.
public class Cross {
	
	@Pointcut("execution(* com.og.localhost.*(..))")
	public void login() {
				
	}
	
	@Before("login()")
	public void before(JoinPoint joinPoint) {
		
		System.out.println("보조업무가 실행됩니다.");
		
	}
	
}
