/**
 * @Author: guoyuting
 * @Date: Created at 2019/3/22 11:04 AM
 */
public class BuilderPatternTest {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product product = director.construct();
        product.show();
    }
}
