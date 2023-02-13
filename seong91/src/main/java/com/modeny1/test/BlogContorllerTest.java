package com.modeny1.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // com.modeny1.blog
public class BlogContorllerTest {
	//http://localhost:8080/test/hello
//	@GetMapping("test/hello") 
//	public String  hello() {
//		return "<h1>hello Spring boot</h1>";
//	}

	private static final String TAG = "HttpControllerTest : ";
	
	@GetMapping("/http/lombok")
	public String lombokTest() {
		Member m = new Member( "ssar", "1234", "email");
		System.out.println(TAG+"getter : "+m.getId());
		m.setId(5000);
		System.out.println(TAG+"getter : "+m.getId());
		
		return "Test 완료"; 
	}
	
	
	
	public String getTest(Member m) {
	
//		System.out.println(TAG+"setter : "+m.setId(5000));
		return "get요청 : "+m.getId()+m.getUsername()+m.getPassword()+m.getEmail(); 
	}
	
}
