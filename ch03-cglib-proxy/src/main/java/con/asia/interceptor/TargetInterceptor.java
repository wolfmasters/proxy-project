package con.asia.interceptor;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * TODO
 *
 * @author wangzongkai
 * @version 1.0
 * @date 2020/11/6 4:10 下午
 */
public class TargetInterceptor implements MethodInterceptor {

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("调用钱");
        Object result = methodProxy.invokeSuper(o,objects);
        System.out.println("调用后");
        return result;
    }
}
