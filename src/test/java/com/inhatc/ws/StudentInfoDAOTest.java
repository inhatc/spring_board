package com.inhatc.ws;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.inhatc.domain.StudentInfoVO;
import com.inhatc.persistence.StudentInfoDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
	locations ={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class StudentInfoDAOTest {

	@Inject
	private StudentInfoDAO dao;
	
	
	@Test
	public void testInsertMember()throws Exception{
		
		StudentInfoVO vo = new StudentInfoVO();
		vo.setHakbun("201744008");
		vo.setName("홍길동");
		vo.setAddress("인천 남구 인하로 100");
		vo.setHp("010-000-0001");
		vo.setEmail("user00@aaa.com");
		
		dao.insertMember(vo);
		
	}	

}


