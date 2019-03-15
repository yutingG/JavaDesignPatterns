/**
 * 原型模式
 * @Author: guoyuting
 * @Date: Created in 2019/3/15 3:09 PM
 */
public class RealizeType implements Cloneable {

    RealizeType() {
        System.out.println("原型创建成功");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("原型复制成功");
        return super.clone();
    }
}
