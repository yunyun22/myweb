package cn.wjq.myweb.controller;

import cn.wjq.myweb.service.MoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {
    @Autowired()
    private MoneyService moneyService;

    @GetMapping("/test")
    public void test() {
        moneyService.reduceMoney(5000, 1);

    }
}
