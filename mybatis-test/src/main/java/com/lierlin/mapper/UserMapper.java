package com.lierlin.mapper;
import org.apache.ibatis.annotations.Param;
import com.lierlin.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> getUserList();
    User slectById (int id);


}