package com.example.testt;

import org.springframework.stereotype.Service;

@Service
public class MemberService {

private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

public void memberCreate(Member member){
        memberRepository.save(member);
}
}
