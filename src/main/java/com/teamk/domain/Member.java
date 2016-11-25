package com.teamk.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Table
@Data @NoArgsConstructor
public class Member {
	@Id @GeneratedValue
	private Long member_id;
	
	@Column(nullable=false, columnDefinition="varchar(20)")
	private String name;
	
	@Column(nullable=false, columnDefinition="varchar(255)")
	private String email;
	
	@Column(nullable=false, columnDefinition="varchar(30)")
	private String phone;
	
	@Column
	private int age;
}
