package cn.wjq.myweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author wjq
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("cn.wjq.myweb.mapper")
@EnableFeignClients(basePackages = "cn.wjq.myweb.feign")
public class Producer {

    public static void main(String[] args) {
        SpringApplication.run(Producer.class, args);
    }
}
