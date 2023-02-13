package com.modeny1;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

//ORM > Object Relationship Mapping:  Java(다른언어) Object > 테이블로 매핑해주는 기술
@Entity // User 클래스가  MySQL 에 테이블이 생성된다, 테이블생성쿼리를 쓸필요가없다??
// create설정일때?? 컬럼 이름 바꾸고 저장만해도 테이블 알아서 다시만들어준다, 이전테이블은 드랍되어버리니 조심할것!
public class User {
	
	/*
	 * private enum Role { ADMIN, MANAGER, USER }
	 */
	
	@Id // primary key
	@GeneratedValue(strategy=GenerationType.IDENTITY)// 프로젝트에서 연결된 디비의 넘버링 전략을 따라간다,  오라클- 시퀀스/ mysql-  오토인크리먼트
	private int id; //   시퀀스, outo_increment
	
	@Column(nullable=false, length= 30)// 컬럼 설정- not null, 길이: 30
	private String username; // ID
	
	@Column(nullable=false, length= 100) // 비밀번호가 해쉬로 암호화되면 길이가 길어질수있다 넉넉하게 주자
	private String password;
	
	@Column(nullable=false, length= 50)
	private String email;

	// Enum 을 쓰는게 좋다 / admin, user, manager
	//ADMIN, USER, MANAGER 구별하는거 
	//스트링이라 오타같은게 날수있다
	@ColumnDefault("'user'") // 문자라는걸 알려줘야함, " " 안에 ' '  필수!
	private String role;
	
	@CreationTimestamp // mysql time : now()
	private Timestamp createDate; // 타임스탬프
	
	

}
