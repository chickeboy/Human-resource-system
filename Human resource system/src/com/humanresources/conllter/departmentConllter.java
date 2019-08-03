package com.humanresources.conllter;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.humanresources.bean.Department;
import com.humanresources.mapper.DepartmentMapper;
import com.humanresources.util.TimeUtil;

@Controller
public class departmentConllter {
	@Resource 
	DepartmentMapper departmentMapper;
	@RequestMapping("/adddeparment")
	public String adddeparment(String name) {
		Department department = new Department();
		TimeUtil timeUtil = new TimeUtil();		
			department.setName(name);
			department.setCreationtime(timeUtil.getTime());
			departmentMapper.insert(department);
		return "admin";
	}
	@RequestMapping("/findallDepartment")
	public String findallDepartment(Model model) {
		List<Department> list = setAllDepartments();
		model.addAttribute("departmentlist",list);
		return "departmentlist";
	}
	@RequestMapping("/findallDepartment2")
	public String findallDepartment2(Model model) {
		List<Department> list = setAllDepartments();
		model.addAttribute("departmentlist",list);
		return "addPosition";
	}
	public List<Department> setAllDepartments() {
		return	departmentMapper.getAllDepartments();
	}
}
