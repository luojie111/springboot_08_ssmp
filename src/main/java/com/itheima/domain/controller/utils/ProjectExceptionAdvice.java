package com.itheima.domain.controller.utils;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//作为springmvc的异常处理器
//@ControllerAdvice
@RestControllerAdvice
public class ProjectExceptionAdvice {
    //拦截所有的异常信息
    @ExceptionHandler
   public R doException(Exception ex){
        ex.printStackTrace();
        return new R("服务器故障");
   }

}
