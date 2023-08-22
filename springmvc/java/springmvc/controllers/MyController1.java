package springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController1 {
	
	@RequestMapping("/greet")
	public ModelAndView processGreet()
	{
		ModelAndView mv=new ModelAndView();
		String model="Hello Everyone, Welcome to Incedo!!!";
		mv.addObject("modelNameForView", model);
		mv.setViewName("welcomePage");
		return mv;
	}

}
