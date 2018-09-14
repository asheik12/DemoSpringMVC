package test.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	public String showResultPage(@RequestParam("getUserName") String uName, @RequestParam("getPassword") String password, Model model) {
		model.addAttribute("userName", uName);
		model.addAttribute("password", password);
		return "result";
	}
	
}
