package net.zgysrc.zb.service.impl;

import net.zgysrc.zb.bean.User;
import net.zgysrc.zb.bean.UserExample;
import net.zgysrc.zb.dao.UserMapper;
import net.zgysrc.zb.service.UserService;
import net.zgysrc.zb.util.JDBCLikeStringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAllUser() {
        List<User> list = userMapper.selectByExample(null);
        if (list.size() == 0) {
            return null;
        } else {
            return list;
        }
    }

    @Override
    public boolean checkUserName(String userName) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUserNameEqualTo(userName);
        List<User> list = userMapper.selectByExample(example);
        return list.size() == 0;
    }

    @Override
    public boolean checkMobileNum(String mobileNum) {
        return false;
    }

    @Override
    public boolean userRegister(User user) {
        if (checkUserName(user.getUserName())) {
            int state = userMapper.insert(user);
            return state == 0;
        } else {
            return false;
        }
    }

    @Override
    public User getOwnerUser(User user) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUserNameEqualTo(user.getUserName());
        criteria.andPasswordEqualTo(user.getPassword());
        List<User> users = userMapper.selectByExample(example);
        if (users.size() != 1) {
            return null;
        } else {
            return users.get(0);
        }
    }

    @Override
    public List<User> getAllUserPage(String userName) {
        UserExample example = new UserExample();
        example.setOrderByClause("id desc");
        UserExample.Criteria criteria = example.createCriteria();
        if (userName == null) {
            List<User> list = userMapper.selectByExample(example);
            if (list.size() == 0) {
                return null;
            } else {
                return list;
            }
        } else {
            criteria.andUserNameLike(JDBCLikeStringUtil.JDBCLikeUtil(userName));
            List<User> list = userMapper.selectByExample(example);
            if (list.size() == 0) {
                return null;
            } else {
                return list;
            }
        }
    }
}
