package com.modeny1;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Board {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false, length = 100)
	private String title;
	
	@Lob //대용량 데이터
	private String content; //썸머노트 라이브러리 : <html> 태그가 섞여서 디자인됨
	
	@ColumnDefault("0")
	private int count; //조회수
	
	@ManyToOne //Many = Board, User = One/ 다대1 매칭_많은 보드 작성_하나의 유저가.
	@JoinColumn(name = "userid") //객체에담는다: ORM
	private User user; //DB는 오브젝트를 저장할수없어 왜래키를 사용한다, 자바는 오브젝트를 저장할수있다
	
	@CreationTimestamp
	private Timestamp createDate;
}
