package com.example.cheng.mapper;

import java.util.List;

import com.example.cheng.pojo.SysUser;

public interface SysUserMapperCustom {

    List<SysUser> queryUserSimplyInfoById(String id);
}