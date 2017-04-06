package com.starry.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.starry.entity.User;
import com.starry.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private IUserService userService;
//	private IRegisterService registerService;

//	public IRegisterService getRegisterService() {
//		return registerService;
//	}
//
//	@Resource
//	public void setRegisterService(IRegisterService registerService) {
//		this.registerService = registerService;
//	}

	public IUserService getUserService() {
		return userService;
	}

	@Resource
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

	@RequestMapping(value = "/findAllUser", method = RequestMethod.GET)
	public String home(Model model) {
		List<User> users = userService.selectAll();
		model.addAttribute("users", users);
		System.out.println("Controller" + users);
		return "home";
	}

	@RequestMapping(value = "/json1", produces = "application/json")
	public @ResponseBody
	List<User> getJson() {
		List<User> list = userService.selectAll();
		System.out.println(list);
		return list;
	}
	@RequestMapping(value="/delete" ,method=RequestMethod.POST)
	public String delete(@RequestParam("id") int id){
		userService.deleteById(id);
		System.out.println(id);
		return "success";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(@RequestParam("name") String name,
			@RequestParam("pwd") String pwd,
			@RequestParam("tel") String tel,
			@RequestParam("info") String info, Model model) {
		 User user = new User(name, pwd, tel, info);
		 System.out.println(info);
		int a = userService.register(user);
		System.out.println(""+a);
		if(a==1){
			return "success";
		}
		return  "register";
	}
	
}
