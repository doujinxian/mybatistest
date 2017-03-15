package sy.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import sy.model.User;
import sy.service.UserServiceI;

@Controller
@RequestMapping("/userController")
public class UserController {
	@Autowired
	private UserServiceI userService;
	
	@RequestMapping("/showUser/{id}")
	@ResponseBody
	public User showUser(@PathVariable String id, HttpServletRequest request) {
		// User u=userService.getUserById(Integer.valueOf(id));
		User u = userService.getUserById(1);
		return u;
	}

}
