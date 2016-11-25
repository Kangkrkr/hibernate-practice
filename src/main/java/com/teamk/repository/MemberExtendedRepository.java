package com.teamk.repository;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.teamk.domain.Member;

@Transactional
@Repository
public class MemberExtendedRepository implements MemberRepository {

	@Autowired
	private MemberBasicRepository crud;
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public Member save(Member member) {
		return crud.save(member);
	}

	@Override
	public void delete(Member member) {
		crud.delete(member);
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly=true)
	@Override
	public List<Member> findMemberCustomQuery() {
		Criteria cr = getSession().createCriteria(Member.class);
		cr.add(Restrictions.between("age", 20, 25));
		
		return cr.list();
	}

	@Override
	public Member findMemberByEmailAndName(String email, String name) {
		Criteria cr = getSession().createCriteria(Member.class);
		
		Member member = (Member)cr.add(Restrictions.eq("email", email))
		  .add(Restrictions.eq("name", name))
		  .uniqueResult();
		
		return member;
	}
	
	private Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
}
