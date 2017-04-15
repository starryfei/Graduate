package com.starry.web;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.starry.service.IAdministorService;

@Controller
@RequestMapping("/")
public class AdministorController {
	@Autowired
	
	private IAdministorService administorService;

	public IAdministorService getAdministorService() {
		return administorService;
	}
	@Resource
	public void setAdministorService(IAdministorService administorService) {
		this.administorService = administorService;
	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String login(@RequestParam("name") String name,
			@RequestParam("pwd") String pwd, Model model) {
		System.out.println(name+pwd);
		boolean result = administorService.checkLogin(name, pwd);
		System.out.println("login " + result);
		if (result) {
			model.addAttribute("name", name);
			model.addAttribute("pwd", pwd);
			return "index";
		}
		return "login";
	}
}
