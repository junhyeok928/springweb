package springweb.a02_mvc.a01_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import springweb.a02_mvc.a02_service.A10_MailService;
import springweb.vo.Mail;

@Controller
public class A10_MailController {
	@Autowired
	private A10_MailService service;
	// http://localhost:7080/springweb/mailFrm.do
	@GetMapping("mailFrm.do")
	public String mailForm() {
		return "WEB-INF\\views\\a02_mvc\\a10_mailForm.jsp";
	}
	@PostMapping("mailsend.do")
	public String mailsend(Mail mail, Model d) {
		System.out.println(mail.getReciever());
		
		
		d.addAttribute("msg", service.sendMail(mail));
		return "WEB-INF\\views\\a02_mvc\\a10_mailForm.jsp";
	}
}
