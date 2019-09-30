package com.lqj.study;

import com.alibaba.fastjson.JSON;
import com.lqj.study.config.Bootconfig;
import com.lqj.study.mapper.UserMapper;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		ac.register(Bootconfig.class);
		ac.refresh();
		UserMapper userMapper = ac.getBean(UserMapper.class);

		System.out.println(JSON.toJSONString(userMapper.getUser(1)));
	}
}
