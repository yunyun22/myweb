package cn.wjq.myweb.service;

/**
 * @author Administrator
 */
public interface MoneyService {

    /**
     *
     * @param reduceMoney 需要减去的金额
     * @param id id
     */
    void reduceMoney(int reduceMoney,int id);
}
