package cc.zhaxin.springcloud.provider.server.impl;

import cc.zhaxin.springcloud.provider.dao.SysUsersMapper;
import cc.zhaxin.springcloud.provider.model.SysUsers;
import cc.zhaxin.springcloud.provider.server.ISysUsersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: 阁楼麻雀
 * @Email: netuser.orz@icloud.com
 * @Date: 2018/4/17 下午2:42
 * @Des: user服务实现类
 */
@Service
public class SysUsersServiceImpl implements ISysUsersService {
    @Resource
    private SysUsersMapper sysUsersMapper;

    /**
     * @Author: 阁楼麻雀
     * @Date: 2018/4/17 下午2:45
     * @Desc: 根据ID查询用户信息
     */
    public SysUsers getUser(String userId){
        return sysUsersMapper.selectById(userId);
    }

    public List<SysUsers> getUserList(){
        return sysUsersMapper.getUserList();
    }
}
