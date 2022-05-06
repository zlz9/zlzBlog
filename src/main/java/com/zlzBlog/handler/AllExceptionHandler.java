package com.zlzBlog.handler;

import com.zlzBlog.util.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

//对加了@Controller注解的方法进行拦截处理AOP的实现
@ControllerAdvice
public class AllExceptionHandler {
//    进行异常处理，处理Exception.class的异常
    @ExceptionHandler(Exception.class)
    public Result doException( Exception ex){
        ex.printStackTrace();
        return Result.fail(-999,"系统异常");
    }
}
