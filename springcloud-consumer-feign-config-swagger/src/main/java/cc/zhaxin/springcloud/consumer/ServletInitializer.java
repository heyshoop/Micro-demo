package cc.zhaxin.springcloud.consumer;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/** 
 * @Author: 阁楼麻雀 
 * @Date: 2018/4/18 下午2:34
 * @Desc: SpringBootServletInitializer的执行过程，简单来说就是通过SpringApplicationBuilder构建并封装SpringApplication对象，并最终调用SpringApplication的run方法的过程
 */
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ConsumerFeignConfigSwaggerApplication.class);
	}

}
