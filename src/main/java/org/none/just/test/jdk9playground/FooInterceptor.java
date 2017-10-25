package org.none.just.test.jdk9playground;

import javax.annotation.Priority;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Priority(10)
@FooBinding
@Interceptor
public class FooInterceptor {

    @AroundInvoke
    public Object aroundInvoke(InvocationContext ctx) throws Exception {
        System.out.println("Intercepted!");
        return ctx.proceed();
    }

}
