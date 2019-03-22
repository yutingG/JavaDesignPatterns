/**
 * 抽象建造者：包含创建各个子部件的抽象方法
 * @Author: guoyuting
 * @Date: Created at 2019/3/22 10:53 AM
 */
abstract class Builder {

    // 创建产品对象
    protected Product product = new Product();

    public abstract void builderPartA();

    public abstract void builderPartB();

    public abstract void builderPartC();

    // 返回产品对象
    public Product getProduct() {
        return product;
    }
}
