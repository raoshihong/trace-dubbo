package com.daoyuan.trace.dubbo.service;

import com.daoyuan.trace.business.dto.UserDto;

public interface UserService {
    void save(UserDto userDto);
    void update(UserDto userDto);
    void delete(Long id);
}
