/**
 * @Author: guoyuting
 * @Date: Created in 2019/3/21 3:05 PM
 */
public class AudiFactory implements CarFactory {
    @Override
    public Car newCar() {
        System.out.println("您当前所在为奥迪工厂---->创建了一辆奥迪轿车");
        return new Audi();
    }
}
