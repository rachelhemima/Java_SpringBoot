package com.jobiak.mvcforms.model;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
//JPA->standard specification for developing ORM framework

@Entity
@Table(name="userdata")
@Data
@Setter
@Getter
public class User{
	
	private Long userId;
	private String name;
	private String email;
	private String mobile;
		
	
}
