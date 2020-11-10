package con.asia;

/**
 * TODO
 *  目标对象
 * @author wangzongkai
 * @version 1.0
 * @date 2020/11/6 4:07 下午
 */
public class TargetObject {

    public String method1(String paramName){
        return paramName;
    }

    public int menthod2(int count){

        return count;
    }

    public int menthod3(int count){
        return count++;
    }

    @Override
    public String toString() {
        return "TargetObject{}" + getClass();
    }
}
