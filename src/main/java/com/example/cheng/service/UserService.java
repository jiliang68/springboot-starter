package com.example.cheng.service;

import java.util.List;

import com.example.cheng.pojo.SysUser;

/**
 * @author chengchenrui
 * @version Id: UserService.java, v 0.1 2019.1.17 16:42 chengchenrui Exp $$
 */
public interface UserService {

    void saveUser(SysUser user) throws Exception;

    void updateUser(SysUser user);

    void deleteUser(String userId);

    SysUser queryUserById(String userId);

    List<SysUser> queryUserList(SysUser user);

    List<SysUser> queryUserListPaged(SysUser user, Integer page, Integer pageSize);

    SysUser queryUserByIdCustom(String userId);

    void saveUserTransactional(SysUser user);
    
}
