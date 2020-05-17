package com.problem.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.problem.dao.ProblemDao;
import com.problem.dto.ProblemDto;
import com.problem.entity.ProblemEntity;
import com.problem.util.HibernateUtil;
@Repository
public class ProblemDaoImpl extends HibernateUtil implements ProblemDao {

	public List<ProblemDto> fetchAllProblems() {
		// TODO Auto-generated method stub
		String hql = "";
		Session session = this.getSession();
		
			hql = "FROM ProblemEntity ORDER BY pid DESC";
		Query query = session.createQuery(hql);
		List<ProblemEntity> list = query.list();
		List<ProblemDto> list1 = new ArrayList<ProblemDto>();
		for(ProblemEntity q : list){
			System.out.println(q.toString());
			ProblemDto problemDto = new ProblemDto();
			problemDto.setPid(q.getPid());
			problemDto.setContent(q.getContent());
			list1.add(problemDto);
		}
		return list1;
	}
}
