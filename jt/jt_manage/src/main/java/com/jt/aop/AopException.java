package com.jt.aop;

import com.jt.vo.SysResult;
import org.aspectj.lang.annotation.AfterThrowing;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.io.IOException;

/**
 * @Author:Izaro
 * @Description:
 * @Date:Created in 10:19 2021/5/14
 * @Modified By:
 */
@RestControllerAdvice
public class AopException {
    @ExceptionHandler({RuntimeException.class})
    public Object exception(Exception e){
        e.printStackTrace();
        return SysResult.fail();
    }
}
