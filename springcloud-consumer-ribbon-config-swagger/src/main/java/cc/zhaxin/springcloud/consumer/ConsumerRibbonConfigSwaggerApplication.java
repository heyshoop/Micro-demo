package cc.zhaxin.springcloud.consumer;

import cc.zhaxin.springcloud.consumer.annotion.ExtendRibbon;
import cc.zhaxin.springcloud.consumer.config.RibbonConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

/**
 * @Author: 阁楼麻雀
 * @Date: 2018/4/18 下午1:43
 * @Desc: 消费者启动类
 * @RibbonClient 指定服务使用的负载均衡类型，name不指定服务则为所有的服务打开负载均衡，也可以在用yml中进行配置。
 * @ComponentScan扫描到该类
 * @EnableHystrix 是支持hystrix打开断路器，在规定时间内失败参数超过一定参数，就会打开断路器，不会发起请求，而是直接进入到错误处理方法。
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "springcloud-provider-service", configuration = RibbonConfiguration.class)
@ComponentScan(excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = ExtendRibbon.class)})
@EnableHystrix
public class ConsumerRibbonConfigSwaggerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerRibbonConfigSwaggerApplication.class, args);
    }
}
