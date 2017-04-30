package com.starry.web;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageInfo;
import com.starry.entity.Administor;
import com.starry.entity.Count;
import com.starry.entity.Department;
import com.starry.entity.Feedback;
import com.starry.entity.New;
import com.starry.entity.OrderInfo;
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
//method = RequestMethod.POST)
	@RequestMapping(value = "index")
	public String login(@RequestParam("name") String name,
			@RequestParam("pwd") String pwd, Model model) {
//		System.out.println(name+pwd);
		boolean result = administorService.checkLogin(name, pwd);
		System.out.println("login " + result);
		if (result) {
			model.addAttribute("name", name);
			model.addAttribute("pwd", pwd);
			return "index";
		}
		return "login";
	}
	
	@RequestMapping(value="addDepart", method = RequestMethod.POST)
	public String adDepart(@RequestParam(value="cNumber") String cNumber,@RequestParam(value="dName") String dName,@RequestParam(value="dDec") String dDec){
		Department department = new Department(cNumber,dName,dDec);
		System.out.println(department);
		int result = administorService.addDepart(department);
		System.out.println(result);
		return "redirect:/getDepart?pageNum=1&pageSize=2";
	}
	/*@RequestMapping(value="addDoctor", method = RequestMethod.POST)
	public String adDoctor(@RequestParam(value="cNumber") String cNumber,@RequestParam(value="dName") String dName,@RequestParam(value="dDec") String dDec){
		Department department = new Department(cNumber,dName,dDec);
		System.out.println(department);
		int result = administorService.addDepart(department);
		System.out.println(result);
//		if(result==1){
			return "redirect:/getDepart";
//		}
//		return "404";
	}*/
	@RequestMapping(value="updatePwd")
	public String updatePwd(@RequestParam(value="Pwd") String Pwd,@RequestParam(value="aNumber") String aNumber,@RequestParam(value="Name") String name){
		Administor administor = new Administor(aNumber, name, Pwd);
		administorService.updatePwd(administor);
		return "login";
	}
	/**
	 * 
	 */
	@RequestMapping("getAllOreder")
	public String getAllOrder(@RequestParam("pageNum") int pageNum,@RequestParam("pageSize") int pageSize,Model model){
		List<OrderInfo> orderinfo = administorService.getAll(pageNum,pageSize);
		PageInfo<OrderInfo> list = new PageInfo<OrderInfo>(orderinfo);
		model.addAttribute("PageInfo",list);
		return "allOreder";
	}
	@RequestMapping("getCount")
	public String getCount(Model model){
		List<Count> list = administorService.getCount();
		model.addAttribute("Count", list);
		return "count";
	}
	@RequestMapping("getFeedBack")
	public String getFeedback(@RequestParam("pageNum") int pageNum,@RequestParam("pageSize") int pageSize,Model model){
		List<Feedback> feddback = administorService.getFeedBack(pageNum,pageSize);
		PageInfo<Feedback> list = new PageInfo<Feedback>(feddback);
		model.addAttribute("PageInfo",list);
		return "feedback";
	}
	@RequestMapping("addNew")
	public String addNew(@RequestParam(value="title") String title,@RequestParam(value="content") String content,@RequestParam("time") String time){
		New news = new New( title, content, time);
		administorService.addNew(news);
		return "redirect:/getAllNew";
	}
	
	@RequestMapping("getAllNew")
	public String getAllNew(Model model){
		List<New> news = administorService.getAllNew();
		model.addAttribute("allNew", news);
		return "welcome";
	}
}
