package com.problem.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.problem.dto.ProblemDto;
import com.problem.service.ProblemService;


@Controller
public class ProblemController {
	
	@Autowired
	private ProblemService problemService;

	@RequestMapping(value = "/getAllProblems", method = RequestMethod.GET)
	public ModelAndView generateAssignmentPdf(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		List<ProblemDto> list = problemService.getAllProblems();
		request.setCharacterEncoding("UTF-8");
		
		return new ModelAndView("home", "list", list);
	}
	
	@RequestMapping(value = "getAllProblems/selectedList", method = RequestMethod.POST)
	public ModelAndView saveProblems(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		request.setCharacterEncoding("UTF-8");
		List<ProblemDto> list = new ArrayList<ProblemDto>();
		
	     String[] chkSms=request.getParameterValues("problem");
		System.out.println("inside saveProblems controller");
		for(String a:chkSms){
			ProblemDto problemDto = new ProblemDto();
			String[] b= a.split(",",2);
			problemDto.setPid(Integer.parseInt(b[0].substring(16,b[0].length())));
			problemDto.setContent(b[1].substring(9,b[1].length()));
			System.out.println("check1:::"+b[0].substring(16,b[0].length()));
			System.out.println("check1:::"+b[1].substring(9,b[1].length()));
			list.add(problemDto);
		}
		return new ModelAndView("selectedList", "list", list);
	}

	
	

}
