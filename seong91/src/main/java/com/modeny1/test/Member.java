package com.modeny1.test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// @Getter
// @Setter  
@Data
//@AllArgsConstructor // 생성자, final 쓰고 @req
@NoArgsConstructor
// @RequiredArgsConstructor  final만 찾아서 빈 등록
public class Member {
	private  int id;
	private  String username;
	private  String password;
	private  String email;
	
	//AllArgs생성자와 동일
	public Member(int id, String username, String password, String email) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
	}
	
	public Member(String username, String password, String email) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
	}
	
}
