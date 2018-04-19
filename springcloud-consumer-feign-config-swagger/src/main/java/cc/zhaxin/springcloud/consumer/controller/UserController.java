package cc.zhaxin.springcloud.consumer.controller;

import cc.zhaxin.springcloud.consumer.feign.MFeignClient;
import cc.zhaxin.springcloud.consumer.model.SysUsers;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 阁楼麻雀
 * @Email: netuser.orz@icloud.com
 * @Date: 2018/4/19 下午1:53
 * @Des: user Controller
 */
@Api("springcloud consumer user 控制器")
@RequestMapping("user")
@RestController
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private MFeignClient feignClient;


    /**
     * @Author: 阁楼麻雀
     * @Date: 2018/4/19 下午1:57
     * @Desc: 获取单个用户
     */
    @ApiOperation(value = "根据用户ID查询用户信息",httpMethod = "GET",produces = "application/json")
    @ApiResponse(code = 200,message = "success",response = SysUsers.class)
    @GetMapping("{id}")
    public SysUsers getuser(@ApiParam(name = "id",   required = true, value = "用户Id") @PathVariable String id){
        SysUsers users = feignClient.getUser(id);
        return users;
    }

    /**
     * @Author: 阁楼麻雀
     * @Date: 2018/4/19 下午2:26
     * @Desc: 获取所有用户
     */
    @GetMapping("list")
    public List<SysUsers> users(HttpServletRequest request){
        try {
            logger.info("calling from user provider");
            List<SysUsers> users = feignClient.getUsers();
            return users == null ? new ArrayList<SysUsers>() : users;
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
