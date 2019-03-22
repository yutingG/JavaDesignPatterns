/**
 * @Author: guoyuting
 * @Date: Created in 2019/3/22 9:42 AM
 */
public class AbstractFactoryPatternTest {
    public static void main(String[] args) {
        AbstractFactory audiFactory = new AudiFactory();
        Vehicle audiCar = audiFactory.createCar();
        Vehicle audiBicycle = audiFactory.createBicycle();
        audiCar.show();
        audiBicycle.show();

        System.out.println("\n\n");

        AbstractFactory benzeFactory = new BenzeFactory();
        Vehicle benzeCar = benzeFactory.createCar();
        Vehicle benzeBicycle = benzeFactory.createBicycle();
        benzeCar.show();
        benzeBicycle.show();
    }
}
