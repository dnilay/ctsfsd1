package comm.example.spring.config;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import comm.example.spring.model.User;

@Controller

public class HomeController {

	@RequestMapping("/")
	public String home(Model model)
	{
		model.addAttribute("user",new User());
		return "home";
	}
	@RequestMapping(method = RequestMethod.POST,path = "/processLogin")
	public String processLogin(@ModelAttribute("user") User user)
	{
		if((user.getEmail().equals("admin@email.com")) &&(user.getPassword().equals("admin"))) {
			return "success";
		}
		else
		{
			return "error";
		}
		
		
	}
}
