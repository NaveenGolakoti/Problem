package com.problem.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.problem.dao.ProblemDao;
import com.problem.dto.ProblemDto;
import com.problem.service.ProblemService;

@Service
public class ProblemServiceImpl implements ProblemService {
    @Autowired
	private ProblemDao problemDao;
	public List<ProblemDto> getAllProblems() {
		List<ProblemDto> list = problemDao.fetchAllProblems();
		return list;
		// TODO Auto-generated method stub
	}

}
