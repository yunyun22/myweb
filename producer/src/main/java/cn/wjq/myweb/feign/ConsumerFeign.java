package cn.wjq.myweb.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Administrator
 */
@FeignClient(name = "consumer")
public interface ConsumerFeign {

    /**
     * 获取所有学生列表
     * @return
     */
    @GetMapping(value = "/consumer/test")
    void test();

}
