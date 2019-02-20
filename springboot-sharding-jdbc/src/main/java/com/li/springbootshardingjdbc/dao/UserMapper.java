package com.li.springbootshardingjdbc.dao;/**
 * @author lihaodong
 * @create 2018-11-15 14:22
 * @desc
 **/

import com.li.springbootshardingjdbc.model.UserVo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**

 * @author lihaodong

 * @create 2018-11-15 14:22

 * @desc
 * @mail lihaodong@bantus.cn

 **/
@Repository
@Mapper
public interface UserMapper {

    @Select("select * from user")
    List<UserVo> selectUser();

    @Insert("insert into user(id,age,name) values(#{id},#{age},#{name})")
    boolean insertUser(UserVo userVo);
}
