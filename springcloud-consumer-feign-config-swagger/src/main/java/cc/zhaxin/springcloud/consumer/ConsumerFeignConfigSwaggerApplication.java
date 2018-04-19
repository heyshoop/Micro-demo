package cc.zhaxin.springcloud.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @Author: 阁楼麻雀
 * @Date: 2018/4/19 下午1:35
 * @Desc: 启动类
 * @EnableEurekaClient 注册中心注册
 * @EnableFeignClients 指定服务使用的负载均衡类型
 * @EnableCircuitBreaker 熔断器依赖
 * @EnableHystrix 是支持hystrix打开断路器，在规定时间内失败参数超过一定参数，就会打开断路器，不会发起请求，而是直接进入到错误处理方法。
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableCircuitBreaker
@EnableHystrix
public class ConsumerFeignConfigSwaggerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeignConfigSwaggerApplication.class, args);
    }
}
