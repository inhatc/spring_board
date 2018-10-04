package com.inhatc.persistence;

import com.inhatc.domain.StudentInfoVO;

public interface StudentInfoDAO {
	
	
	public void insertMember(StudentInfoVO vo);

	public StudentInfoVO readStudentInfo(String hakbun)throws Exception;
  
	
}
