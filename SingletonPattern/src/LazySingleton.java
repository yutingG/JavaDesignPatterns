/**
 * 懒汉单例模式
 * @Author: guoyuting
 * @Date: Created in 2019/3/15 11:13 AM
 */
public class LazySingleton {

    private static volatile LazySingleton instance = null; // 使用volatile，保证在instance在所有线程中同步

    private LazySingleton() {
        System.out.println("LazySingleton has been created!");
    }

    public static synchronized LazySingleton getInstance() {
        // 使用同步锁
        if (instance ==  null) {
            instance =  new LazySingleton();
        } else {
            System.out.println("instance exist!");
        }
        return instance;
    }
}
