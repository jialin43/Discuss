package cn.skycer.mapper;

import cn.skycer.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by Johnny on 2019/8/2.
 */
@Mapper
public interface UserMapper {
    @Select("SELECT id,username,password,nickname FROM USER")
    User find();
    @Insert("INSERT INTO USER (USERNAME,PASSWORD,NICKNAME) VALUES(#{username},#{password},#{nickname})")
    void insert(User user);

}
