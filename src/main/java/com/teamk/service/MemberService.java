package com.teamk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teamk.domain.Member;
import com.teamk.repository.MemberRepository;

@Service
public class MemberService {

	@Autowired
	private MemberRepository memberRepository;
	
	public Member signUp(Member member){
		return memberRepository.save(member);
	}
	
	public void signOut(Member member){
		memberRepository.delete(member);
	}
	
	public List<Member> getYoungBoy(){
		return memberRepository.findMemberCustomQuery();
	}
	
	public Member getMemberByEmailAndName(String email, String name){
		return memberRepository.findMemberByEmailAndName(email, name);
	}
}
