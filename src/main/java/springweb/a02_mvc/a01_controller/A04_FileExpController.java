package springweb.a02_mvc.a01_controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class A04_FileExpController {
	@GetMapping("/upload2.do")
	public String upload2Frm() {
		return "WEB-INF\\views\\a02_mvc\\a04_fileUploadFrm.jsp";
	}
	@PostMapping("/upload2.do")
	public String upload2( @RequestParam("title") String title,
							@RequestParam("report") MultipartFile report ) {
		System.out.println("제목:"+title);
		System.out.println("파일명:"+report.getOriginalFilename());
		
		
		return "WEB-INF\\views\\a02_mvc\\a04_fileUploadFrm.jsp";
	}
	
}
