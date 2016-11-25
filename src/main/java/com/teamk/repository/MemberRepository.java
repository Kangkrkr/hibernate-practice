package com.teamk.repository;

import java.util.List;

import com.teamk.domain.Member;

public interface MemberRepository {
	public Member save(Member member);
	public void delete(Member member);
	// ...
	public List<Member> findMemberCustomQuery();
	public Member findMemberByEmailAndName(String email, String name);
}
