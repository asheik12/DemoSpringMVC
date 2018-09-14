package test.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/")
	public String showMyPage() {
		return "Hello";
	}
	
	@RequestMapping("/login")
	public String showLoginPage() {
		return "Login_Page";
	}
	
	@RequestMapping("/getResult")
	public String showResultPage() {
		return "result";
	}
	
}
