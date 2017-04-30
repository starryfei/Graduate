package com.starry.web;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageInfo;
import com.starry.entity.Department;
import com.starry.entity.Doctor;
import com.starry.entity.DoctorInfo;
import com.starry.service.IDepartmentService;
import com.starry.service.IDoctorService;

@Controller
@RequestMapping("/")
public class DoctorController {
	@Autowired
	private IDoctorService doctorService;
	private IDepartmentService departmentService;
	
	public IDoctorService getDoctorService() {
		return doctorService;
	}

	public void setDoctorService(IDoctorService doctorService) {
		this.doctorService = doctorService;
	}
	
	public void setDepartmentService(IDepartmentService departmentService) {
		this.departmentService = departmentService;
	}
	
	public IDepartmentService getDepartmentService() {
		return departmentService;
	}
	/*@RequestMapping(value = "Djson", produces = "application/json")
	public @ResponseBody List<DoctorInfo> getJson() {
		List<DoctorInfo> list = doctorService.selectAll();
		System.out.println("DoctorController" + list);
		return list;
	}*/
	@RequestMapping(value = "getAllDoctor")
	public  String selectAll(@RequestParam("pageNum") int pageNum,@RequestParam("pageSize") int pageSize,Model model) {
		List<DoctorInfo> alldoctor = doctorService.selectAll(pageNum,pageSize);
		PageInfo<DoctorInfo> list = new PageInfo<DoctorInfo>(alldoctor);
		model.addAttribute("PageInfo",list);
		System.out.println("分页显示"+list);
		return "allDoctor";
	}
	
	@RequestMapping(value="getById")
	public String getById(String dNumber,Model model){
		List<Doctor> doctors = doctorService.getById(dNumber);
		model.addAttribute("doctor", doctors);
		System.out.println("doctor的信息"+doctors);
		return "updateDoctor";
	}
	
//, method = RequestMethod.POST
	@RequestMapping(value = "Ddelete")
	public String delete( String dNumber) {
		doctorService.deleteById(dNumber);
		return "redirect:/getAllDoctor?pageNum=1&pageSize=2";
	} 
	
//, method = RequestMethod.POST
	@RequestMapping(value = "addDoctor",method = RequestMethod.POST)
	public String register(@RequestParam("image") MultipartFile image,
			 HttpServletRequest request,
			@RequestParam("dNumber") String dNumber,
			@RequestParam("name") String name,
			@RequestParam("dPwd") String dPwd,
			@RequestParam("cNumber") String cNumber,
			@RequestParam("dInfo") String dInfo,
			@RequestParam("dResume") String dResume,
			@RequestParam("dTel") String dTel,
			@RequestParam("dEmail") String dEmail,
			Model model) {
		// 获取项目的根路径，将上传图片的路径与我们的资源路径在一起，才能显示
		HttpSession session = request.getSession();
		String path = session.getServletContext().getRealPath("/");
		System.out.println("getRealPath('/'):" + path);
		int end = path.indexOf("t", 19);
		String prePath = path.substring(0, end);
		String realPath = "d:\\temp";
		System.out.println("DEBUG:" + realPath);
		String picName = new Date().getTime() + ".jpg";
		if (!image.isEmpty()) {
			try {
				FileUtils.copyInputStreamToFile(image.getInputStream(),
						new File(realPath, picName));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
		
		Doctor doctor = new Doctor(dNumber, name, dPwd, cNumber, dInfo,
				dResume, dTel, dEmail, "\\" + picName);
		System.out.println(doctor);
		int a = doctorService.insert(doctor);
		System.out.println("" + a);
		if (a == 1) {
			return "redirect:/getAllDoctor?pageNum=1&pageSize=2";
		}
		return "404";
	}
	@RequestMapping(value = "updateDoctor",method = RequestMethod.POST)
	public String update(@RequestParam("dNumber") String dNumber,
			@RequestParam("name") String name,
			@RequestParam("cNumber") String cNumber,
			@RequestParam("dInfo") String dInfo,
			@RequestParam("dResume") String dResume,
			@RequestParam("dTel") String dTel,
			@RequestParam("dEmail") String dEmail) {
		Doctor doctor = new Doctor(dNumber, name, cNumber, dInfo, dResume, dTel, dEmail);
		System.out.println("修改的医生信息："+doctor);
		doctorService.update(doctor);
		return "redirect:/getAllDoctor";
	}
			
	@RequestMapping(value = "findDoctor")
	public String findDoctor(@RequestParam("pageNum") int pageNum,@RequestParam("pageSize") int pageSize,Model model, String info, String chose) {
		// chose=1,按照科室搜索
		// 2姓名搜索
		System.out.println(info + chose);
		if (chose.equals("1")) {
			List<DoctorInfo> dInfos = doctorService.findId(info,pageNum,pageSize);
			PageInfo<DoctorInfo> list = new PageInfo<DoctorInfo>(dInfos);
			model.addAttribute("PageInfo",list);
			return "allDoctor";
		}
		if (chose.equals("2")) {
			List<DoctorInfo> dInfos = doctorService.findName(info,pageNum,pageSize);
			PageInfo<DoctorInfo> list = new PageInfo<DoctorInfo>(dInfos);
			model.addAttribute("PageInfo",list);
			return "allDoctor";
		}
		if(chose.equals("3")){
			List<DoctorInfo> dInfos = doctorService.findDepartName(info,pageNum,pageSize);
			PageInfo<DoctorInfo> list = new PageInfo<DoctorInfo>(dInfos);
			model.addAttribute("PageInfo",list);
			return "allDoctor";
		}
		return "404";
	}
}
