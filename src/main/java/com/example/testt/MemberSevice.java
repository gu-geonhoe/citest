package com.example.testt;


import org.springframework.stereotype.Service;

@Service
public class MemberSevice {

    private final MemberRepository memberRepository;

    public MemberSevice(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public void createMember(Member member){
        memberRepository.save(member);
    }
}
