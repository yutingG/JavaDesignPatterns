/**
 * 产品角色：包含多个组成部件的复杂对象
 * @Author: guoyuting
 * @Date: Created at 2019/3/22 10:47 AM
 */
public class Product {
    private String partA;

    private String partB;

    private String partC;

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }

    public String getPartA() {
        return partA;
    }

    public String getPartB() {
        return partB;
    }

    public String getPartC() {
        return partC;
    }

    public void show() {
        System.out.println("Product show() --------");
        System.out.println("Product: " + getPartA() + "\n"
            + getPartB() + "\n"
            + getPartC());
    }
}
