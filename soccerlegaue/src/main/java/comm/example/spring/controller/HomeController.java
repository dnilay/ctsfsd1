package comm.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(method = RequestMethod.GET,path = "/")
	public String home()
	{
		return "main-menu";
	}

}
