package cn.wangjq.myweb.controller;

import cn.wangjq.myweb.service.MoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {
    @Autowired
    private MoneyService moneyService;
    public void test(){

    }
}
