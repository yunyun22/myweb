package cn.wjq.myweb;

import cn.wjq.myweb.domain.SeataGood;
import cn.wjq.myweb.mapper.StockMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleTest {
    @Autowired
    private StockMapper stockMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        SeataGood seataGood = stockMapper.selectById(1);
        System.out.println(seataGood);
    }
}
