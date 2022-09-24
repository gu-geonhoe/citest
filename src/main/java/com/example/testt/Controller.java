package com.example.testt;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class Controller {

    private final MemberRepository memberRepository;
    @GetMapping
    public String hellow(){
        return "hellow332333";
    }

    @PostMapping("/test")
    public ResponseEntity test(@RequestBody Member member){
        memberRepository.save(member);
return new ResponseEntity<>("등록완료", HttpStatus.OK);
    }

}
