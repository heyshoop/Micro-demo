package cc.zhaxin.springcloud.consumer.feign;

import cc.zhaxin.springcloud.consumer.config.MFeignConfig;
import cc.zhaxin.springcloud.consumer.hrstrix.HystrixFeignFallback;
import cc.zhaxin.springcloud.consumer.model.SysUsers;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @Author: 阁楼麻雀
 * @Email: netuser.orz@icloud.com
 * @Date: 2018/4/19 下午1:38
 * @Des: FeignClient
 */
@FeignClient(name = "springcloud-provider-server",fallback = HystrixFeignFallback.class,configuration = MFeignConfig.class)
public interface MFeignClient {

    /**
     * @Author: 阁楼麻雀
     * @Date: 2018/4/19 下午1:42
     * @Desc: 查询单个用户
     */
    @RequestMapping(method = RequestMethod.GET, value = "/user/{id}")
    SysUsers getUser(@PathVariable("id") String id);

    /**
     * @Author: 阁楼麻雀
     * @Date: 2018/4/19 下午1:42
     * @Desc: 查询所有用户
     */
    @GetMapping(value = "/user/list")
    List<SysUsers> getUsers();
}
