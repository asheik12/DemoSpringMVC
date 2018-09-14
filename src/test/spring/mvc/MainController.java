package test.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

	@RequestMapping("/")
	public String showMyPage() {
		return "Hello";
	}
	
	@RequestMapping("/login")
	public String showLoginPage(Model model) {
		model.addAttribute("modelAtt", new Employee());
		return "Login_Page";
	}
	
	@RequestMapping("/getResult")
	public String showResultPage(@ModelAttribute("modelAtt") Employee employee) {
		
		return "result";
	}
	
}
