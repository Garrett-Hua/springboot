package cn.wqh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.wqh.mapper.UserMapper;
import cn.wqh.model.User;

/**
 * Created by zl on 2015/8/27.
 */

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> getUserInfo(){
        List<User> user=userMapper.findUserInfo();
        //User user=null;
        return user;
    }

    public User selectById(Integer id) {
        return userMapper.selectById(id);
    }
}
