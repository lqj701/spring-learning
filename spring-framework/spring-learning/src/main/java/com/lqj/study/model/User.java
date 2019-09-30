package com.lqj.study.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class User {
	private Integer id;
	private String name;

}
