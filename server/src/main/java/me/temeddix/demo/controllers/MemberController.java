package me.temeddix.demo.controllers;

import me.temeddix.demo.entities.Member;
import me.temeddix.demo.repositories.MemberRepository;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/members")
@RequiredArgsConstructor
public class MemberController {
    private final MemberRepository memberRepository;

    @GetMapping
    public List<Member> getAll() {
        return memberRepository.findAll();
    }

    @PostMapping
    public Member post(@RequestBody Member member) {
        return memberRepository.save(member);
    }

    @GetMapping("/{id}")
    public Member get(@PathVariable("id") Long id) {
        return memberRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Member put(@PathVariable("id") Long id, @RequestBody Member member) {
        member.setId(id);
        return memberRepository.save(member);
    }
}
