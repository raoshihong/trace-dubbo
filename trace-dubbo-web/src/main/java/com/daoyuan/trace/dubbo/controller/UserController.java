package com.daoyuan.trace.dubbo.controller;

import com.daoyuan.trace.business.dto.UserDto;
import com.daoyuan.trace.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/user/save")
    public void save(@RequestBody UserDto userDto){
        userService.save(userDto);
    }

    @PostMapping(value = "/user/update")
    public void update(@RequestBody UserDto userDto){
        userService.update(userDto);
    }

    @GetMapping(value = "/user/delete/{id}")
    public void delete(@PathVariable("id") Long id){
        userService.delete(id);
    }

}
