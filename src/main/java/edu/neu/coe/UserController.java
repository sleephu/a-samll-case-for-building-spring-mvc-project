package edu.neu.coe;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import edu.neu.coe.api.model.User;
import edu.neu.coe.api.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private IUserService userService;
	
	@RequestMapping(value="test", method=RequestMethod.POST)
	public ModelAndView signup(@RequestParam("firstName") String firstname) {
		return new ModelAndView("user/dashboard", "firstName", firstname);
	}
	
	@RequestMapping(value="all", method=RequestMethod.GET)
	public @ResponseBody ArrayList<User> getALL() {
		return userService.allUser();
	}
	
}
