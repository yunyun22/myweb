package cn.wjq.myweb.service.impl;

import cn.wjq.myweb.domain.SeataGood;
import cn.wjq.myweb.feign.ConsumerFeign;
import cn.wjq.myweb.mapper.StockMapper;
import cn.wjq.myweb.service.StockService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 */
@Service
public class StockServiceImpl implements StockService {

    @Autowired
    private StockMapper stockMapper;

    @Autowired
    private ConsumerFeign comsumerFeign;

    @Override
    public SeataGood get(Integer id) {
        SeataGood seataGood = stockMapper.selectById(id);
        System.out.println(seataGood);
        return seataGood;
    }

    @Override
    @GlobalTransactional(name = "test")
    public void test() throws Exception {
        SeataGood seataGood = stockMapper.selectById(1);
        seataGood.setStock(seataGood.getStock()-1);
        stockMapper.updateById(seataGood);
        comsumerFeign.test();
    }
}
