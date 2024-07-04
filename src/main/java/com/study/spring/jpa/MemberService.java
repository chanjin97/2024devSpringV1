package com.study.spring.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

	@Autowired
	private MemberRepository memberRepository;
	
	public Member insert(Member member) {
		Member returnMember = memberRepository.save(member);
		return returnMember;
	}
	
	// list page
	public List<Member> selectAll() {
//		List<Member> memberAll = memberRepository.findAll();
//		return memberAll;
		return memberRepository.findAll();
	}
	
	// view 페이지  하나의 데이터
	public Optional<Member> select(Long id) {
		Optional<Member> member = memberRepository.findById(id);
		return member;
	}
	
	// 삭제
	public void delete(Long id) {
		memberRepository.deleteById(id);
	}
	
	// 업데이트후 세이브
	public Member update (Member member) {
		Member returnMember = memberRepository.save(member);
		return returnMember;
	}
	
}






