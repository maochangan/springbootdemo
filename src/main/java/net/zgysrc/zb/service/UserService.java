package net.zgysrc.zb.service;

import net.zgysrc.zb.bean.User;

import java.util.List;

public interface UserService {

    List<User> getAllUser();

    boolean checkUserName(String userName);

    boolean checkMobileNum(String mobileNum);

    boolean userRegister(User user);

    User getOwnerUser(User user);

    List<User> getAllUserPage(String userName);

    User getUserByNameWithPsd(User user);

    boolean getMobileCodeByMobile(String mobile);
}
