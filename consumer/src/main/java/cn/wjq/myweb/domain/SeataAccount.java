package cn.wjq.myweb.domain;

public class SeataAccount {
    private int id;
    private int money;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "SeataAccount{" +
                "id=" + id +
                ", money=" + money +
                '}';
    }
}
