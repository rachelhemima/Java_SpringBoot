package ai.jobiak.boot.controller;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;


@Controller
public class TestController {
	
@RequestMapping(path="/test",method=RequestMethod.GET)
public String test(@RequestParam(name="loc",defaultValue="USA",required=false)String loc,
		@RequestParam(name="branch",defaultValue="Vizag",required=false)String branch,Model model)
{
	model.addAttribute("com","Jobiak");
	model.addAttribute("address","Ram Nagar, Visakhapatnam, Andhra Pradesh 530002");
	model.addAttribute("HO",loc);
	model.addAttribute("branch",branch);
	model.addAttribute("Ceo","Venkat Janapareddy");
return "success";	

}

}
