package com.inhatc.persistence;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import com.inhatc.domain.StudentInfoVO;

@Repository
public class StudentInfoDAOImpl implements StudentInfoDAO {
	
	@Inject
	private SqlSession sqlSession;

	private static final String namespace =
			"com.inhatc.mapper.StudentInfoMapper";

	
	@Override
	public void insertMember(StudentInfoVO vo) {
		sqlSession.insert(namespace+".insertStudentInfo", vo);
	}


	@Override
	public StudentInfoVO readStudentInfo(String hakbun) throws Exception {
		return (StudentInfoVO) 
				sqlSession.selectOne(namespace+".selectStudentInfo", hakbun);
	}


	

}


