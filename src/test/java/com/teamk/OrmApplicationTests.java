package com.teamk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import com.teamk.service.MemberService;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class OrmApplicationTests {

	@Autowired
	private MemberService memberService;
	
	@Test
	public void test1(){
		System.out.println(memberService.getYoungBoy());
	}
	
	@Test
	public void test2(){
		System.out.println(memberService.getMemberByEmailAndName("kangkrkr@naver.com", "강승윤"));
	}
}
