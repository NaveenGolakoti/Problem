package com.problem.dao;

import java.util.List;

import com.problem.dto.ProblemDto;


public interface ProblemDao {
	
	public List<ProblemDto> fetchAllProblems();

}
