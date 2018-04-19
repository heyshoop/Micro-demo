package cc.zhaxin.springcloud.consumer.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: 阁楼麻雀
 * @Email: netuser.orz@icloud.com
 * @Date: 2018/4/18 下午3:27
 * @Des: 解决RestTemp无法注入问题
 */
@Configuration
public class RestTemplateConfig {
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
