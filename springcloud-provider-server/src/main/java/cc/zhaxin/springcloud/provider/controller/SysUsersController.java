package cc.zhaxin.springcloud.provider.controller;

import cc.zhaxin.springcloud.provider.model.SysUsers;
import cc.zhaxin.springcloud.provider.server.ISysUsersService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: 阁楼麻雀
 * @Email: netuser.orz@icloud.com
 * @Date: 2018/4/17 下午2:05
 * @Des: 用户controller
 */
@RequestMapping("user")
@RestController
public class SysUsersController {

    @Resource
    private ISysUsersService usersService;

    /**
     * @Author: 阁楼麻雀
     * @Date: 2018/4/17 下午2:55
     * @Desc: 获取单个用户信息
     */
    @RequestMapping("{id}")
    public SysUsers getuser(@PathVariable String id){
        SysUsers user = null;
        try {
            System.out.println("传入参数为："+id);
            user = usersService.getUser(id);
        }catch (Exception e){
            e.printStackTrace();
        }
        return user;
    }

    /**
     * @Author: 阁楼麻雀
     * @Date: 2018/4/17 下午2:59
     * @Desc: 获取所有用户
     */
    @RequestMapping("list")
    public List<SysUsers> users(){
        try {
            List<SysUsers> users = usersService.getUserList();
            if (users != null && users.size() > 0){
                return users;
            }
            return null;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

}
