package cn.wangjq.myweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author wangjq
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("cn.wjq.myweb.mapper")
public class Consumer {

    public static void main(String[] args) {
        SpringApplication.run(Consumer.class, args);
    }
}
