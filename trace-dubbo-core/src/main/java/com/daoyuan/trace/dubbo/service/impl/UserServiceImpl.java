package com.daoyuan.trace.dubbo.service.impl;

import com.daoyuan.trace.business.dto.UserDto;
import com.daoyuan.trace.business.service.IUserFaced;
import com.daoyuan.trace.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private IUserFaced iUserFaced;

    public void save(UserDto userDto){
        iUserFaced.save(userDto);
    }

    @Override
    public void update(UserDto userDto) {
        iUserFaced.update(userDto);
    }

    @Override
    public void delete(Long id) {
        iUserFaced.delete(id);
    }
}
