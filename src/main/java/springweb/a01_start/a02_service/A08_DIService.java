package springweb.a01_start.a02_service;

import org.springframework.stereotype.Service;

@Service
public class A08_DIService {
	public String call08() {
		System.out.println("서비스 08 호출됨!!");
		
		return "안녕하세요!! autowiring 연습(출력)";
	}
}
