package com.spring.mvc.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mvc.service.UserService;
import com.spring.mvc.user.User;


@Controller
public class UserController {

	public UserController() {
		System.out.println("UserController()");
	}

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/")
	public ModelAndView listUser(ModelAndView model) throws IOException {
		List<User> listUser = userService.getAllUsers();
		model.addObject("listUser", listUser);
		model.setViewName("home");
		return model;
	}

	@RequestMapping(value = "/newUser", method = RequestMethod.GET)
	public ModelAndView newContact(ModelAndView model) {
		User User = new User();
		model.addObject("User", User);
		model.setViewName("UserForm");
		return model;
	}

	@RequestMapping(value = "/saveUser", method = RequestMethod.POST)
	public ModelAndView saveUser(@ModelAttribute User User) {
		if (User.getUserId() == 0) { // if User id is 0 then creating the
			// User other updating the User
			userService.addUser(User);
		} else {
			userService.updateUser(User);
		}
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/deleteUser", method = RequestMethod.GET)
	public ModelAndView deleteUser(HttpServletRequest request) {
		int UserId = Integer.parseInt(request.getParameter("id"));
		userService.deleteUser(UserId);
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/editUser", method = RequestMethod.GET)
	public ModelAndView editContact(HttpServletRequest request) {
		int UserId = Integer.parseInt(request.getParameter("id"));
		User User = userService.getUser(UserId);
		ModelAndView model = new ModelAndView("UserForm");
		model.addObject("User", User);

		return model;
	}

}
