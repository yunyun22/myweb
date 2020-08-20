package cn.wjq.myweb.controller;

import cn.wjq.myweb.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 */
@RestController
@RequestMapping("/producer")
public class ProducerController {


    @Autowired
    private StockService stockService;

    @GetMapping()
    public String produce() throws Exception {
        stockService.test();
        return "ok";
    }

}
