/**
 * 饿汉模式
 * @Author: guoyuting
 * @Date: Created in 2019/3/15 11:19 AM
 */
public class HungrySingleton {

    private static final HungrySingleton instance = new HungrySingleton();
    private HungrySingleton() {
        System.out.println("HungrySingleton has been created!");
    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}