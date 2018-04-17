package cc.zhaxin.springcloud.provider.dao;

import cc.zhaxin.springcloud.provider.model.SysUsers;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.List;

/**
 * @Author: 阁楼麻雀
 * @Email: netuser.orz@icloud.com
 * @Date: 2018/4/17 下午2:29
 * @Des: 用户Mapper
 */
public interface SysUsersMapper extends BaseMapper<SysUsers> {

    List<SysUsers> getUserList();
}
