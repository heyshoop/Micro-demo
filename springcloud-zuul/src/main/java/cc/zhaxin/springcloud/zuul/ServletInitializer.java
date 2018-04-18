package cc.zhaxin.springcloud.zuul;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/** 
 * @Author: 阁楼麻雀 
 * @Date: 2018/4/18 下午4:53
 * @Desc: 
 */
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
					return application.sources(ZuulApplication.class);
	}

}
