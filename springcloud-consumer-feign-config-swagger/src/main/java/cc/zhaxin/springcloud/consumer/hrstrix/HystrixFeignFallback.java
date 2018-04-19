package cc.zhaxin.springcloud.consumer.hrstrix;

import cc.zhaxin.springcloud.consumer.feign.MFeignClient;
import cc.zhaxin.springcloud.consumer.model.SysUsers;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 阁楼麻雀
 * @Email: netuser.orz@icloud.com
 * @Date: 2018/4/19 下午1:36
 * @Des: 熔断器回调类
 */
@Component
public class HystrixFeignFallback implements MFeignClient {

    /**
     * @Author: 阁楼麻雀
     * @Date: 2018/4/19 下午1:50
     * @Desc: 获取单个用户熔断处理
     */
    @Override
    public SysUsers getUser(String id) {
        SysUsers user = new SysUsers();
        return user;
    }

    /**
     * @Author: 阁楼麻雀
     * @Date: 2018/4/19 下午1:51
     * @Desc: 获取所有用户熔断处理
     */
    @Override
    public List<SysUsers> getUsers() {
        return new ArrayList<SysUsers>();
    }
}
