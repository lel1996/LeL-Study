package com.lierlin;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lierlin.mapper.UserMapper;
import com.lierlin.pojo.User;
import com.lierlin.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;


import javax.xml.soap.Text;
import java.util.List;


public class Test {
    static Logger logger = Logger.getLogger(Text.class);
    public static void main(String[] args) {
        // 如何获取接口

        // 1、 获取SqlSession， 执行sql使用的
        SqlSession session = MyBatisUtils.getSession();
        // 2、通过 session.getMapper(Class ) 获得接口
        UserMapper mapper = session.getMapper(UserMapper.class);
        PageHelper.startPage(1,5);
        List<User> userList = mapper.getUserList();

        PageInfo pageInfo =new PageInfo(userList,5);
        System.out.println("ssssss");
        logger.error("ssssss");
        logger.info("ssssss");
        logger.debug("ssssss");
        System.out.println(pageInfo);
        for (User user : userList) {
            System.out.println(user);
        }
        System.out.println("================================");
        User user = mapper.slectById(1);
        System.out.println("第一次查询"+user);
        //session.clearCache();
        System.out.println("================================");
        User user1 = mapper.slectById(2);
        System.out.println("第二次查询"+user1);
        User user2 = session.selectOne("com.lierlin.mapper.UserMapper.slectById",1);
        System.out.println(user2);
    }
}
