package springweb.a01_start.a02_service;

import org.springframework.stereotype.Service;

@Service
public class A01_StartService {
	public String call() {
		System.out.println("서비스 메서드 호출");
		return "서비스 메서드 호출";
	}
}
