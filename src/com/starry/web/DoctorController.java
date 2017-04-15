package com.starry.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.starry.entity.Doctor;
import com.starry.service.IDoctorService;

@Controller
@RequestMapping("/")
public class DoctorController {
	@Autowired
	private IDoctorService doctorService;

	public IDoctorService getDoctorService() {
		return doctorService;
	}

	public void setDoctorService(IDoctorService doctorService) {
		this.doctorService = doctorService;
	}
	@RequestMapping(value = "Djson", produces = "application/json")
	public @ResponseBody
	List<Doctor> getJson() {
		List<Doctor> list = doctorService.selectAll();
			System.out.println("DoctorController"+list);
		return list;
	}
	@RequestMapping(value="Ddelete" ,method=RequestMethod.POST)
	public String delete(@RequestParam("number") int number){
		doctorService.deleteById(number);
		return "success";
	}
	@RequestMapping(value = "addDoctor", method = RequestMethod.POST)
	public String register(@RequestParam("dNumber") String dNumber,
			@RequestParam("dName") String dName,
			@RequestParam("dPwd") String dPwd,
			@RequestParam("cNumber") String cNumber,
			@RequestParam("dInfo") String dInfo,
			@RequestParam("dResume") String dResume,
			@RequestParam("dTel") String dTel,
			@RequestParam("dEmail") String dEmail,
			Model model) {
		Doctor doctor = new Doctor(dNumber, dName, dPwd, cNumber, dInfo, dResume, dTel,dEmail);
		int a = doctorService.insert(doctor);
		System.out.println(""+a);
		if(a==1){
			return "success";
		}
		return  "register";
	}
	@RequestMapping(value="test")
	public String test(){
		System.out.println("test");
		return "success";
	}
	

}
