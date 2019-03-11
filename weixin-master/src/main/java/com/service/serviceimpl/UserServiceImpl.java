package com.service.serviceimpl;

import com.mapper.UserMapper;
import com.model.User;
import com.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl  implements IUserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public User selectUser(long userId) {
        return this.userMapper.selectUser(userId);
    }
}
