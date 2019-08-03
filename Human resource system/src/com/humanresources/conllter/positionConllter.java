package com.humanresources.conllter;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.humanresources.bean.Department;
import com.humanresources.bean.Position;
import com.humanresources.bean.positionEx;
import com.humanresources.mapper.DepartmentMapper;
import com.humanresources.mapper.PositionMapper;
import com.humanresources.util.TimeUtil;

@Controller
public class positionConllter {
	@Resource
	DepartmentMapper departmentMapper;
	@Resource
	PositionMapper positionMapper;

	@RequestMapping("/goposition")
	public String goposition() {
		return null;
	}

	@RequestMapping("/addposition")
	public String addposition(Model model, String name, String dep) {
		TimeUtil timeUtil = new TimeUtil();
		List<Department> list = departmentMapper.getAllDepartments();
		model.addAttribute("list", list);
		if (name != null) {
				Position position = new Position();
				Department department = departmentMapper.findDepatmentById(dep);
				position.setDepartmentid(department.getId());
				position.setName(name);
				position.setCreationtime(timeUtil.getTime());
				positionMapper.insert(position);
		}
		return "index_admin";
	}
	@RequestMapping("/Positionlist")
	public String positionlist(Model model) {
		List<positionEx> list = positionMapper.findAllPosition();
		model.addAttribute("Positionlist",list);
		return "positionlist";
		
	}
}
