package cc.zhaxin.springcloud.consumer.config;

import feign.Logger;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: 阁楼麻雀
 * @Email: netuser.orz@icloud.com
 * @Date: 2018/4/19 下午1:38
 * @Des: Feign配置类
 */
@Configuration
public class MFeignConfig {

    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}