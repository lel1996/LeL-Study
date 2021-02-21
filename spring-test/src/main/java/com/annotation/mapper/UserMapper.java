package com.annotation.mapper;

import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    @Select("select userByid")
    String selectById();
}
