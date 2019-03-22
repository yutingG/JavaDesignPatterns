/**
 * 真实主题类：实现了抽象主题中的具体业务，是代理对象所代表的真实对象，是最终要引用的对象。
 * @Author: guoyuting
 * @Date: Created at 2019/3/22 3:21 PM
 */
public class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("RealSubject.request()-------------");
    }
}
