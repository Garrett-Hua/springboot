package cn.wqh.mapper;

import java.util.List;

import cn.wqh.model.User;

/**
 * Created by zl on 2015/8/27.
 */
public interface UserMapper {
    public List<User> findUserInfo();

    User selectById(Integer id);
}
