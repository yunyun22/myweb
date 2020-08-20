package cn.wjq.myweb.domain;

/**
 * @author Administrator
 */
public class SeataGood {

    private int id;
    private String name;
    private int stock;
    private int money;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "SeataGood{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", stock=" + stock +
                ", money=" + money +
                '}';
    }
}
