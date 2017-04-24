package com.hsyd.controller;

/**
 * @author : sunwei
 *         Date : 2017/4/19
 *         Time : 10:13
 */
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.springframework.stereotype.Controller;

/**
     * @author sunwei
     * Date : 2017/4/19
 * Time : 11:13
 */
@Controller
public class LogController {

    private static final Logger logger = Logger.getLogger(LoginController.class);



    //方法开始
    public void methodStart(JoinPoint joinPoint) throws Exception{

        System.out.println();
        Signature signature = joinPoint.getSignature();
        String methodName = signature.getName();
        logger.debug(methodName + "方法开始");
    }

    //方法结束
    public void methodEnd(JoinPoint joinPoint){
        Signature signature = joinPoint.getSignature();
        String methodName = signature.getName();
        logger.debug(methodName + "方法结束");

    }

    //方法异常
    public void methodError(JoinPoint joinPoint){
        Signature signature = joinPoint.getSignature();
        String methodName = signature.getName();
        logger.error(methodName + "方法异常");
    }
}
