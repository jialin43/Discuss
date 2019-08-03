package cn.skycer.controller;

import cn.skycer.mapper.UserMapper;
import cn.skycer.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Johnny on 2019/8/2.
 */
@Controller
public class IndexController {
    @Autowired
    UserMapper userMapper;
    @RequestMapping("/")
    public String index(){
        return "index";
    }
    @RequestMapping("/addUser")
    public String add(){
        User user = new User();
        user.setUsername("admin");
        user.setPassword("admin123");
        user.setNickname("管理员");
        userMapper.insert(user);
        return "index";
    }

}
