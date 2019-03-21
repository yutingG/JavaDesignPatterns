# Singleton Pattern 单例模式
### 特点
1. 单例类只有一个实例对象
2. 该单例对象必须由单例类自行创建
3. 单例类对外提供一个访问该单例的全局访问点

### 两种实现形式
#### 1. 懒汉单例
*特点*: 类加载时没有生成单例，只有当第一次调用getInstance()方法时才去创建这个实例

```java
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
```
*非线程安全*：如果是多线程程序，关键字synchronized和volatile不要删除，这样子能保证线程安全，但是每次访问都要同步，会影响性能。

#### 2. 饿汉单例
*特点*：类一旦加载就创建一个单例，保证在调用getInstance方法之前单例就存在
```java
public class HungrySingleton {

    private static final HungrySingleton instance = new HungrySingleton();
    private HungrySingleton() {
        System.out.println("HungrySingleton has been created!");
    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}
```
*线程安全*：类创建的同时就提供一个静态对象供系统使用，以后不再改变，所以是线程安全的，可以直接用于多线程。

### 应用场景
- 在应用场景中，某类只要求生成一个对象的时候，如一个班中的班长、每个人的身份证号等。
- 当对象需要被共享的场合。由于单例模式只允许创建一个对象，共享该对象可以节省内存，并加快对象访问速度。如 Web 中的配置对象、数据库的连接池等。
- 当某类需要频繁实例化，而创建的对象又频繁被销毁的时候，如多线程的线程池、网络连接池等。