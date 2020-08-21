package cn.wjq.myweb;

import cn.wjq.myweb.service.MoneyService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleTest {
    @Autowired
    private MoneyService moneyService;

    @Test
    public void testSelect() {
        moneyService.reduceMoney(5000,1);
    }
}
