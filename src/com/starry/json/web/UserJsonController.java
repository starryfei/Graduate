package com.starry.json.web;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.starry.entity.Department;
import com.starry.entity.DoctorInfo;
import com.starry.entity.DoctorInfoJson;
import com.starry.entity.Feedback;
import com.starry.entity.Jsondoctor;
import com.starry.entity.Order;
import com.starry.entity.OrderInfo;
import com.starry.entity.User;
import com.starry.service.IDepartmentService;
import com.starry.service.IDoctorService;
import com.starry.service.IUserService;

@Controller
@RequestMapping("/json")
public class UserJsonController {
	@Autowired
private IDoctorService doctorService;
	@Autowired
	private IUserService userService;
	@Autowired
	private IDepartmentService departmentService;

	public IDepartmentService getDepartmentService() {
		return departmentService;
	}

	public void setDepartmentService(IDepartmentService departmentService) {
		this.departmentService = departmentService;
	}
	
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
	public IUserService getUserService() {
		return userService;
	}
	
	public IDoctorService getDoctorService() {
		return doctorService;
	}

	public void setDoctorService(IDoctorService doctorService) {
		this.doctorService = doctorService;
	}
	
	
	
	@RequestMapping(value = "Djson", produces = "application/json;charset=UTF-8")
	public @ResponseBody List<DoctorInfoJson> getJson(@RequestParam("dNumber") String dNumber,@RequestParam("cNumber") String cNumber) {
		List<DoctorInfoJson> list = doctorService.JsonDoctor(dNumber,cNumber);
		System.out.println("DoctorController" + list);
		return list;
	}
	@RequestMapping(value = "getAllDoctor", produces = "application/json;charset=UTF-8")
	public @ResponseBody List<Jsondoctor> getAllDoctor(@RequestParam("cNumber") String cNumber) {
		List<Jsondoctor> list = doctorService.getAllJsonDoctor(cNumber);
//		System.out.println("DoctorController" + list);
		return list;
	}
	@RequestMapping(value = "getJsonByName", produces = "application/json;charset=UTF-8")
	public @ResponseBody List<Jsondoctor> getJsonByName(@RequestParam("name") String name) {
		List<Jsondoctor> list = doctorService.JsonDoctorByName(name);
		return list;
	}
	
	@RequestMapping(value = "userlogin", produces = "application/json;charset=UTF-8")
	public @ResponseBody List<User> userLogin(@RequestParam("name") String name,@RequestParam("pwd") String pwd) {
		List<User> result = userService.checkLogin(name, pwd);
			return result;
	}
	@RequestMapping(value = "userRegister", produces = "application/json;charset=UTF-8")
	public @ResponseBody void register(@RequestParam("uname") String uname,@RequestParam("pwd") String pwd,
													@RequestParam("tel") String tel,@RequestParam("info") String  info) {
		User user = new User(uname, pwd, tel, info);
		userService.register(user);
		
	}
	@RequestMapping(value = "getJsonDepart", produces = "application/json;charset=UTF-8")
	public @ResponseBody List<Department> getAllDepart() {
		List<Department> list = departmentService.getAll();
		return list;
	}
	@RequestMapping(value = "insertOrder", produces = "application/json;charset=UTF-8")
	//sNumber,id,oTime,price,status
	public @ResponseBody void insertOrder(@RequestParam("sNumber") String sNumber,@RequestParam("id") Integer id,@RequestParam("oTime") String oTime,
													@RequestParam("price") String price,@RequestParam("status") Integer status) {
		Order order =new Order(sNumber, id, oTime, price,status);
		 userService.insertOrder(order);
	}
	@RequestMapping(value = "getOrderById", produces = "application/json;charset=UTF-8")
	public @ResponseBody List<OrderInfo> getOrderById(@RequestParam("id") Integer id) {
		List<OrderInfo> list = userService.getOrderById(id);
		return list;
	}
	@RequestMapping(value = "updateUser", produces = "application/json;charset=UTF-8")
	public @ResponseBody String updateUser(@RequestParam("id") Integer id,@RequestParam("uname") String uname,@RequestParam("pwd") String pwd,
			@RequestParam("tel") String tel,@RequestParam("info") String  info) {
		User user = new User(uname, pwd, id, tel, info);
		userService.updateUser(user);
		return "success";
	}
	
	//fname,ftime,message
	@RequestMapping(value = "insertFeedback", produces = "application/json;charset=UTF-8")
	public @ResponseBody void insertFeedback(@RequestParam("fname") String fname,@RequestParam("ftime") String ftime,@RequestParam("message") String message) {
		Feedback feedback = new Feedback(fname, ftime, message);
		userService.insertFeedback(feedback);
	}
	
	@RequestMapping(value="deleteOrderById",produces="application/json;charset=UTF-8")
	public @ResponseBody void deleteOrder(@RequestParam("oNumber") Integer oNumber){
		userService.deleteOrderById(oNumber);
	}
}
