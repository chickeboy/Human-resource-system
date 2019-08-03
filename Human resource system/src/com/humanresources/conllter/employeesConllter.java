package com.humanresources.conllter;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.humanresources.bean.Department;
import com.humanresources.bean.Employees;
import com.humanresources.bean.EmployeesEx;
import com.humanresources.bean.Position;
import com.humanresources.bean.Usertype;
import com.humanresources.bean.positionEx;
import com.humanresources.mapper.DepartmentMapper;
import com.humanresources.mapper.EmployeesMapper;
import com.humanresources.mapper.PositionMapper;
import com.humanresources.mapper.UsersMapper;
import com.humanresources.util.TimeUtil;

@Controller
public class employeesConllter {
	@Resource
	PositionMapper positionMapper;
	@Resource
	UsersMapper userMapper;
	@Resource
	EmployeesMapper employeesMapper;
	@Resource
	DepartmentMapper departmentMapper;

	@RequestMapping("/addEmploy")
	public String addEmploy(HttpSession session, Employees employees, String position, String department) {
		Usertype usertype = (Usertype) session.getAttribute("loginuser");
		TimeUtil timeUtil = new TimeUtil();
		positionEx position2 = new positionEx();
		position2.setName(position);
		position2.setDepartment(department);
		Position position3 = positionMapper.findPosition(position2);
		employees.setEntrytime(timeUtil.getTime());
		employees.setBasicsalary(6000.0);
		employees.setState(1);
		employees.setPositionid(position3.getId());
		employees.setDepartmentid(position3.getDepartmentid());
		employeesMapper.insert(employees);
		userMapper.updataUsertype(usertype);
		return "Myinterview";
	}

	@RequestMapping("/showAllEmploy")
	public String showAllEmploy(Model model) {
		List<EmployeesEx> list = employeesMapper.findAllEmployees();
		model.addAttribute("employees", list);
		return "showAllEmploy";
	}

	@RequestMapping("/changeempoloyees")
	public String changeempoloyees(Model model, EmployeesEx employeesEx) {
		List<Department> list = departmentMapper.getAllDepartments();
		model.addAttribute("departmentlist", list);
		model.addAttribute("employee", employeesMapper.findemployeeById(employeesEx.getId()));
		return "changeposition";
	}

	@RequestMapping("/changeemp")
	public String change(Model model,EmployeesEx employeesEx) {
		Employees employees = new Employees();
		employees.setId(employeesEx.getId());
		positionEx positionEx = new positionEx();
		positionEx.setName(employeesEx.getPosition());
		positionEx.setDepartment(employeesEx.getDepartment());
		Position position = positionMapper.findPosition(positionEx);
		employees.setPositionid(position.getId());
		employees.setDepartmentid(position.getDepartmentid());
		employeesMapper.updateByPrimaryKeySelective(employees);
		return showAllEmploy(model);
	}
}
