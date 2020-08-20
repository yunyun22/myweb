package cn.wjq.myweb.service;

import cn.wjq.myweb.domain.SeataGood;

/**
 * @author Administrator
 */
public interface StockService {

    /**
     * 获取seata
     *
     * @param id id
     * @return 通过id获取获取详情
     */
    SeataGood get(Integer id);

    /**
     * 测试
     */
    void test() throws Exception;

}
