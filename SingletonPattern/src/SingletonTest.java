/**
 * @Author: guoyuting
 * @Date: Created in 2019/3/15 3:05 PM
 */
public class SingletonTest {
    public static void main(String[] args) {
        // 使用懒汉单例模式
        System.out.println("-----------------------LazySinleton-----------------------");
        LazySingleton l1 = LazySingleton.getInstance();
        LazySingleton l2 = LazySingleton.getInstance();


        // 使用饿汉单例模式
        System.out.println("-----------------------HungrySingleton--------------------");
        HungrySingleton h1 = HungrySingleton.getInstance();
        HungrySingleton h2 = HungrySingleton.getInstance();
    }
}
