/**
 * @Author: guoyuting
 * @Date: Created in 2019/3/22 9:13 AM
 */
public class BenzeFactory implements AbstractFactory {

    @Override
    public Car createCar() {
        System.out.println("------进入BenzeFactory: createCar() ------");
        return new Car();
    }

    @Override
    public Bicycle createBicycle() {
        System.out.println("------进入BenzeFactory: createBicycle() -------");
        return new Bicycle();
    }
}
