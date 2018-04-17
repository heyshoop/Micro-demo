package cc.zhaxin.springcloud.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: 阁楼麻雀
 * @Date: 2018/4/17 下午1:57
 * @Desc: provider启动类
 */
@SpringBootApplication
@EnableEurekaClient
public class ProviderServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderServerApplication.class, args);
    }
}
