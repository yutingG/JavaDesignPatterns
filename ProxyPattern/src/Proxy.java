/**
 * 代理类：提供了与真实主题相同的接口，其内部含有对真实主题的引用，它可以访问、控制或扩展真实主题的功能。
 * @Author: guoyuting
 * @Date: Created at 2019/3/22 3:23 PM
 */
public class Proxy implements Subject{

    private RealSubject realSubject;

    public void preRequest() {
        System.out.println("Proxy.preRequest()------------------");
    }

    @Override
    public void request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        preRequest();
        realSubject.request();
        postRequest();
    }

    public void postRequest() {
        System.out.println("Proxy.postRequest()-----------------");
    }
}
