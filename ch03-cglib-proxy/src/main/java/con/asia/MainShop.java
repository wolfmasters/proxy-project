package con.asia;

import con.asia.interceptor.TargetInterceptor;
import net.sf.cglib.proxy.Enhancer;


/**
 * TODO
 *
 * @author wangzongkai
 * @version 1.0
 * @date 2020/11/6 4:10 下午
 */
public class MainShop {

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(TargetObject.class);
        enhancer.setCallback(new TargetInterceptor());
        TargetObject targetObject  = (TargetObject) enhancer.create();
        targetObject.menthod2(1);
    }
}
