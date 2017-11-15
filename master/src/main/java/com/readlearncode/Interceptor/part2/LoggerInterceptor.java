package com.readlearncode.Interceptor.part2;

import javax.annotation.Priority;
import javax.inject.Inject;
import javax.interceptor.AroundConstruct;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
@Interceptor
@Loggable
@Priority(10)
public class LoggerInterceptor {

    @Inject
    private Logger logger;

    @AroundInvoke
    private Object doMethodLogging(InvocationContext ic) throws Exception {
        List<String> params = Stream.of(ic.getParameters()).map(Object::toString).collect(Collectors.toList());
        logger.info("Method: " + ic.getMethod().getName() + " called with parameters: " + params);
        return ic.proceed();
    }

    @AroundConstruct
    private Object doClassLogging(InvocationContext ic) throws Exception {
        logger.info("Constructor: " + ic.getConstructor() + " on class: " + ic.getTarget());
        return ic.proceed();
    }
}