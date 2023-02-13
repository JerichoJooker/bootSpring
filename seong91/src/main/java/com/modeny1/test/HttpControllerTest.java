package com.modeny1.test;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
// 요청-> 응답( Html파일)
//@COntroller

//  사용자요청 -> 응답()Data)
@RestController
public class HttpControllerTest {

	//http://localhost:8080/http/get
	//값만가져올떄, 보안 개나줬다 중요한정보담지마라
	@GetMapping("/http/get")
	public String getTest(Member m) {
		return "get id,name: ";
	}
	
	// 인터넷브라워요청은 get밖에 할수없다
	//http://localhost:8080/http/post(insert)
	// 값 등록할때, 보안성이좋다
	@PostMapping("/http/post")
	public String postTest() {
		return "post req";
	}
	// update
	@PutMapping("/http/put")
	public String putTest() {
		return "put req";
	}
	//delete
	@DeleteMapping("/http/delete")
	public String deleteTest() {
		return "delete req";
	}
}
