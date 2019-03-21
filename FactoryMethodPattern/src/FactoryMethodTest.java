/**
 * @Author: guoyuting
 * @Date: Created in 2019/3/21 3:11 PM
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        CarFactory audiFactory = new AudiFactory();
        Car car_audi = audiFactory.newCar();
        car_audi.show();

        CarFactory benzeFactory = new BenzeFactory();
        Car car_benze = benzeFactory.newCar();
        car_benze.show();
    }
}
