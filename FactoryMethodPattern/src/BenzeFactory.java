/**
 * @Author: guoyuting
 * @Date: Created in 2019/3/21 3:06 PM
 */
public class BenzeFactory implements CarFactory {
    @Override
    public Car newCar() {
        System.out.println("您当前所在为奔驰工厂--->创建了一辆奔驰轿车");
        return new Benze();
    }
}
