/**
 * @Author: guoyuting
 * @Date: Created in 2019/3/22 9:16 AM
 */
public class AudiFactory implements AbstractFactory {
    @Override
    public Car createCar() {
        System.out.println("-------进入AudiFactory: createCar() -------");
        return new Car();
    }

    @Override
    public Bicycle createBicycle() {
        System.out.println("-------进入AudiFactory: createBicycle() -------");
        return new Bicycle();
    }
}
