package con.asia.filter;

import net.sf.cglib.proxy.CallbackFilter;

import java.lang.reflect.Method;

/**
 * TODO
 *  回掉过滤器
 * @author wangzongkai
 * @version 1.0
 * @date 2020/11/6 4:22 下午
 */
public class  TargetMethodCallbackFilter implements CallbackFilter {

    public int accept(Method method) {

        if(method.getName().equals("method1")){
            System.out.println("filter method1 ==0");
            return 0;
        }
        if(method.getName().equals("method2")){
            System.out.println("filter method2 ==1");
            return 1;
        }
        if(method.getName().equals("method3")){
            System.out.println("filter method3 ==2");
            return 2;
        }

        return 0;
    }
}
