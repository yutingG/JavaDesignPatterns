/**
 * 指挥者：调用建造者的方法完成对复杂对象的创建
 * @Author: guoyuting
 * @Date: Created at 2019/3/22 10:59 AM
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    // 产品构建与组装方法
    public Product construct() {
        builder.builderPartA();
        builder.builderPartB();
        builder.builderPartC();
        return builder.getProduct();
    }
}
