package com.lqj.study.mapper;

import com.lqj.study.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
	@Select("select * from users where id = #{id}")
	User getUser(@Param("id") Integer id);
}
