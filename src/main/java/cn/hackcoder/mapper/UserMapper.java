package cn.hackcoder.mapper;

import cn.hackcoder.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by hackcoder on 15-11-27.
 */
public interface UserMapper {
    @Insert("insert into user(name,password) values(#{name},#{password})")
    @Options(useGeneratedKeys=true, keyProperty="id")
    void add(User user);

    @Select("update user set name = #{name},password = #{password} where id = #{id}")
    void update(User user);

    @Select("delete from user where id = #{id}")
    void delete(long uid);

    @Select("select * from user where id = #{0}")
    User findById(long uid);

    @Select("select * from user")
    List<User> findAll();

}
