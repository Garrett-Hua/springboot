package cn.wqh.controller;

import cn.wqh.model.User;
import cn.wqh.service.UserService;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    private Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/getUserInfo")
    @ResponseBody
    public List<User> getUserInfo() {
    	List<User> user = userService.getUserInfo();
        if(user!=null){
            System.out.println("user.getName():"+user.get(0).getName());
            logger.info("user.getAge():"+user.get(1).getAge());
        }
        return user;
    }

    @RequestMapping(value = "/selectById",method = RequestMethod.GET)
    @ResponseBody
    public User selectById(Integer id){
        return  userService.selectById(id);
    }
}
