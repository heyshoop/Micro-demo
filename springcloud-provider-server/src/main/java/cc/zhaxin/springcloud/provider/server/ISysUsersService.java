package cc.zhaxin.springcloud.provider.server;

import cc.zhaxin.springcloud.provider.model.SysUsers;

import java.util.List;

/**
 * @Author: 阁楼麻雀
 * @Email: netuser.orz@icloud.com
 * @Date: 2018/4/17 下午2:39
 * @Des: user服务接口
 */
public interface ISysUsersService {

    /**
     * @Author: 阁楼麻雀
     * @Date: 2018/4/17 下午2:51
     * @Desc: 获取单个用户
     */
    SysUsers getUser(String userId);

    /**
     * @Author: 阁楼麻雀
     * @Date: 2018/4/17 下午2:51
     * @Desc: 获取所有用户
     */
    List<SysUsers> getUserList();

}
