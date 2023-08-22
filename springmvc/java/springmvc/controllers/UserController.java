package springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import springmvc.controllers.beans.Employee;

@Controller
public class UserController {
	@RequestMapping("/")
	public ModelAndView processBlank()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("home");
		return mv;
	}
	@RequestMapping("/home")
	public ModelAndView processHome()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("home");
		return mv;
	}
	@RequestMapping("/LoginPage")
	public ModelAndView processLoginPage()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("Login");
		return mv;
	}
	@RequestMapping(path="/submit",method=RequestMethod.POST)
	public ModelAndView processLogin(@RequestParam("user") String userName,@RequestParam("pwd") String password)
	{
		ModelAndView mv=new ModelAndView();
		if(userName.equals("lata") && password.equals("12345"))
		{
			mv.setViewName("Success");
			mv.addObject("responseMsg", "Hello "+userName+", You have successfully Logged In.");
		}
		else
		{
			mv.setViewName("Failure");
			mv.addObject("responseMsg", "Hello "+userName+", Your Credentials are wrong");
		}
		return mv;
	}
	@RequestMapping(path="/registration",method=RequestMethod.POST)
	public ModelAndView processRegistration(@ModelAttribute("emp") Employee emp)
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("RegnAcknowlegement");
		return mv;
	}
	@RequestMapping("/register")
	public ModelAndView processRegisterationPage()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("RegistrationForm");
		return mv;
	}
}
