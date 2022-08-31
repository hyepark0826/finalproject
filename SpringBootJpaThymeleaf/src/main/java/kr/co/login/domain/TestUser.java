package kr.co.login.domain;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="TEST_USER")		//오라클의 실제 테이블명
public class TestUser {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="USER_NO")		
	private Long userNo;
	@Column(name="USER_ID")		//실제 테이블의 컬럼명을 맵핑해준다. 실제 테이블의 컬럼은 대문자_대문자 형태임
	private String userId;
	@Column(name="USER_PW")
	private String userPw;
	@Column(name="USER_NM")
	private String userNm;
	@Column(name="USER_MAIL")	
	private String userMail;
	@Column(name="USER_REG_DT")	
	private String userRegDt;
	

}
