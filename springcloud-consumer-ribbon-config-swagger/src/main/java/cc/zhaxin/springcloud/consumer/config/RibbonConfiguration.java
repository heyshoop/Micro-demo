package cc.zhaxin.springcloud.consumer.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: 阁楼麻雀
 * @Email: netuser.orz@icloud.com
 * @Date: 2018/4/18 下午2:03
 * @Des: ribbon配置文件
 */
@Configuration
public class RibbonConfiguration {
    /**
     * 轮询
     * @return
     */
//    @Bean
//    public IPing ribbonPing() {
//        return new PingUrl();
//    }

    /**
     * 随机
     * @return
     */
    @Bean
    public IRule ribbonRule() {
        return new RandomRule();
    }

    /**
     * 随机
     * @return
     */
//    @Bean
//    public ILoadBalancer ribbonLoadBalancer() {
//        return new ILoadBalancer();
//    }
}
