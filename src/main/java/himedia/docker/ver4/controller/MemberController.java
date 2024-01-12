package himedia.docker.ver4.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import himedia.docker.ver4.dto.Member;
import himedia.docker.ver4.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;

@RestController // @ResponseBody + @Controller
@RequestMapping("/members")
@RequiredArgsConstructor
public class MemberController {
	
	private final MemberMapper mapper;
	
	@GetMapping("/all")
	public List<Member> all() {
		return mapper.findAll();
	}
	
	@GetMapping("/name")
	public List<Member> findName(@RequestParam String name) {
		return mapper.findByName(name);
	}
	
	@GetMapping("/id")
	public Member findId(@RequestParam Long id) {
		return mapper.findById(id).get();		
	}
}








