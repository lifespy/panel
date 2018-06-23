package com.not404.panel.config.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;

/**
 * 统一日志打印AOP
 */

@Aspect
@Component
public class LogAspect {

    private final static Logger logger = LoggerFactory.getLogger(LogAspect.class);

    @Autowired
    HttpServletRequest request;


    /**
     * 定义拦截规则：拦截com.xjj.web.controller包下面的所有类中，有@RequestMapping注解的方法。
     * ~第一个 *代表任意修饰符及任意返回值.
     * ~第二个 *任意包名
     * ~第三个 *代表任意方法.
     * ~第四个 *定义在web包或者子包
     * ~第五个 *任意方法
     * ~ ..匹配任意数量的参数.
    */
    @Pointcut("execution(* com.not404.panel..controller..*(..)) && @annotation(com.not404.panel.config.annotation.PrintLog)")
    public void controllerMethodPointcut() {
    }

    /**
     * 拦截器具体实现
     *
     * @param pjp
     */
    @Around("controllerMethodPointcut()") // 指定拦截器规则；也可以直接把“execution(* com.xjj………)”写进这里
    public Object Interceptor(ProceedingJoinPoint pjp) throws Throwable {
        MethodSignature signature = (MethodSignature) pjp.getSignature();
        Method method = signature.getMethod(); //获取被拦截的方法
        String methodName = method.getName(); //获取被拦截的方法名

        //打印请求内容
        logger.info("===============请求内容===============");
        logger.info("请求地址:" + request.getRequestURL().toString());
        logger.info("请求开始，方法：{}", methodName);
        logger.info("请求方式:" + request.getMethod());
        logger.info("请求类方法:" + pjp.getSignature());
        logger.info("请求类方法参数:" + request.getParameter("a"));
        logger.info("===============请求内容===============");

        return pjp.proceed();
    }


}
