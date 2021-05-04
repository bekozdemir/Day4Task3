package Concrete;

import Abstract.MemberService;
import Entities.Member;

public class MemberManager implements MemberService {

	@Override
	public void add(Member member) {
		System.out.println("Member has added : "  +member.getFirstName());
		
	}

	@Override
	public void delete(Member member) {
		System.out.println("Member has deleted : " + member.getFirstName());
		
	}

	@Override
	public void update(Member member) {
		System.out.println("Member has modified : " + member.getFirstName());
		
	}
	
}
