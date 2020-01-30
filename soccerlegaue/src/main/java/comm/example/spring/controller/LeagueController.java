package comm.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import comm.example.spring.model.League;

@Controller
@RequestMapping("/league")
public class LeagueController {
	
	@RequestMapping(method = RequestMethod.GET,path = "/showForm")
	public String showFormForAdd()
	{
		return "add-league";
	}
	@RequestMapping("/processForm")
	public String processForm(@RequestParam("title") String title,
			@RequestParam("season") String season,
			@RequestParam("year") String year,Model theModel)
	{
		
		League league=new League(title, year, season);
		theModel.addAttribute("league",league);
		
		return "success";
	}

}
