package com.starry.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.starry.entity.Department;
import com.starry.service.IDepartmentService;

@Controller
@RequestMapping("/")
public class DepartmentController {
	@Autowired
	private IDepartmentService departmentService;

	public IDepartmentService getDepartmentService() {
		return departmentService;
	}

	public void setDepartmentService(IDepartmentService departmentService) {
		this.departmentService = departmentService;
	}

	@RequestMapping(value = "getDepart")
	public String getAll(Model model) {
		List<Department> departments = departmentService.getAll();
		model.addAttribute("department", departments);
		System.out.println("Controller" + departments);
		return "adv";
	}

	@RequestMapping(value = "getName")
	public String getName(Model model) {
		List<Department> departments = departmentService.getAll();
		model.addAttribute("department", departments);
		System.out.println("Controller" + departments);
		return "info";
	}

	@RequestMapping(value = "delByid")
	public String delById(String cNumber) {
		System.out.println(cNumber);
		departmentService.delById(cNumber);
		return "redirect:/getDepart";
	}

	@RequestMapping(value = "find")
	public String findName(Model model, String info, String chose) {
		// chose=1,按照科室搜索
		// 2姓名搜索
		System.out.println(info + chose);
		if (chose.equals("1")) {
			List<Department> departments = departmentService.findId(info);
			System.out.println(departments);
			model.addAttribute("department", departments);
			return "adv";
		}
		if (chose.equals("2")) {
			List<Department> department = departmentService.findName(info);
			model.addAttribute("department", department);
			return "adv";
		}
		return "404";
	}

	@RequestMapping("updateByid")
	public String updateByid(Model model, String cNumber) {
		List<Department> department = departmentService.findId(cNumber);
		model.addAttribute("department", department);
		return "updateDepartment";
	}

	@RequestMapping("update")
	public String update(@RequestParam("cNumber") String cNumber,
			@RequestParam("dName") String dName,
			@RequestParam("dDec") String dDec) {
		Department department = new Department(cNumber, dName, dDec);
		departmentService.update(department);
		return "redirect:/getDepart";
	}
}
