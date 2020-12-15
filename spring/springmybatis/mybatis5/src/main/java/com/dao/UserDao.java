package com.dao;
import com.user.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;
//多个参数使用@Param()
public interface UserDao {
    @Select("select * from user")
    public List<User> selectUser();
    @Select("select * from user where id=#{id}")
    public List<User> selectUserById(@Param("id") int id);
    @Insert("insert into user(id,name,pwd) value(#{id},#{name},#{password})")
    public void addUser(User user);
    @Delete("delete * from user where id=#{id}")
    public void deleteUser(int id);
    @Update("update user set id=#{id},name=#{name},pwd=#{password} where id=#{id}")
    public void Update(User user);
    }