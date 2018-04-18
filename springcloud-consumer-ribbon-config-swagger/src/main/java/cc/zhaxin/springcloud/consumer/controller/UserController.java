package cc.zhaxin.springcloud.consumer.controller;

import cc.zhaxin.springcloud.consumer.model.SysUsers;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: 阁楼麻雀
 * @Email: netuser.orz@icloud.com
 * @Date: 2018/4/18 下午2:36
 * @Des: user controller
 */
@Api("pringcloud consumer user 控制器")
@RequestMapping("user")
@RestController
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    /**
     * @Author: 阁楼麻雀
     * @Date: 2018/4/18 下午2:42
     * @Desc: 根据ID查询人员信息
     */
    @ApiOperation(value = "根据用户id查询用户信息", httpMethod = "GET", produces = "application/json")
    @ApiResponse(code = 200, message = "success", response = SysUsers.class)
    @GetMapping("{id}")
    @HystrixCommand(fallbackMethod="userFallbackMethod")
    public SysUsers getUser(@ApiParam(name = "id",   required = true, value = "用户Id") @PathVariable String id) {
        return this.restTemplate.getForObject("http://springcloud-provider-server/user/" + id, SysUsers.class);
    }
    /**
     * @Author: 阁楼麻雀
     * @Date: 2018/4/18 下午3:40
     * @Desc: 请求失败熔断器调用的方法
     */
    public SysUsers userFallbackMethod(String id){
        return null;
    }


    /**
     * @Author: 阁楼麻雀
     * @Date: 2018/4/18 下午2:43
     * @Desc: 查询所有人员信息
     * 这块ribbon不支持复杂数据类型list，所以要用数组接受，然后转list
     */
    @GetMapping("list")
    @HystrixCommand(fallbackMethod = "userList")
    public List<SysUsers> users(HttpServletRequest request) {
        try {
            SysUsers[] forObject = this.restTemplate.getForObject("http://springcloud-provider-server/user/list", SysUsers[].class);
            List<SysUsers> users = Arrays.asList(forObject);
            return users == null ? new ArrayList<SysUsers>() : users;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * @Author: 阁楼麻雀
     * @Date: 2018/4/18 下午3:41
     * @Desc: 请求失败熔断器调用的方法
     */
    public List<SysUsers> userList(HttpServletRequest request) {
        return null;
    }

    /**
     * @Author: 阁楼麻雀
     * @Date: 2018/4/18 下午2:43
     * @Desc: 通过服务id获取服务的地址
     */
    @GetMapping("ribbon")
    public String ribbon(){
        ServiceInstance serviceInstance = loadBalancerClient.choose("springcloud-provider-server");
        return serviceInstance.getUri().toString();
    }

}
