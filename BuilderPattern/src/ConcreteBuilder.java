/**
 * 具体创建者：实现了抽象建造者接口
 * @Author: guoyuting
 * @Date: Created at 2019/3/22 10:57 AM
 */
public class ConcreteBuilder extends Builder {

    @Override
    public void builderPartA() {
        product.setPartA("建造了A");
    }

    @Override
    public void builderPartB() {
        product.setPartB("建造了B");
    }

    @Override
    public void builderPartC() {
        product.setPartC("建造了C");
    }
}
