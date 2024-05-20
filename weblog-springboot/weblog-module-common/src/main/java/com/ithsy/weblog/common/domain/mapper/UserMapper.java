package com.ithsy.weblog.common.domain.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ithsy.weblog.common.domain.dos.UserDO;

/**
 * Description:
 * Author:sevenui
 * Date:2024-05-18
 * Time:19:26
 */
public interface UserMapper extends BaseMapper<UserDO> {
//    UserDO findByUsername(String username);
    default UserDO findByUsername(String username) {
        LambdaQueryWrapper<UserDO> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(UserDO::getUsername, username);
        return selectOne(wrapper);
    }
}
