package com.humanresources.conllter;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.humanresources.bean.Department;
import com.humanresources.bean.Position;
import com.humanresources.bean.Recruitment;
import com.humanresources.bean.RecruitmentEx;
import com.humanresources.mapper.DepartmentMapper;
import com.humanresources.mapper.PositionMapper;
import com.humanresources.mapper.RecruitmentMapper;
import com.humanresources.util.TimeUtil;

@Controller
public class RecruitmentConllter {
	@Resource
	RecruitmentMapper recruitmentMapper;
	@Resource
	DepartmentMapper departmentMapper;
	@Resource
	PositionMapper positionMapper;

	@RequestMapping("/addrecruitment")
	public String addRecruitment(Model model, String department, String position) {
		TimeUtil timeUtil = new TimeUtil();
		Recruitment recruitment = new Recruitment();
		List<Department> list = departmentMapper.getAllDepartments();
		model.addAttribute("departmentlist", list);
		if (department != null) {
			List<Position> list2 = positionMapper.findPositions(getDepartmentId(department));
			for (Position position2 : list2) {
				if (position2.getName().equals(position)) {
					recruitment.setTime(timeUtil.getTime());
					recruitment.setPositionid(position2.getId());
				}
			}
			if (recruitment.getPositionid() != null) {
				recruitmentMapper.insert(recruitment);
			}
			return getAllList(model);
		}
		return "addrecruitment";
	}

	@RequestMapping("/getR")
	public @ResponseBody List<Position> getAllPosition(Model model, String department) {
		return positionMapper.findPositions(getDepartmentId(department));
	}

	public int getDepartmentId(String name) {
		return departmentMapper.findDepatmentById(name).getId();
	}
	@RequestMapping("/getrecruitment")
	public String getAllList(Model model) {
		List<RecruitmentEx> list = recruitmentMapper.getAllList();
		model.addAttribute("recruitmentlist",list);
		return "recruitment";
	}
	@RequestMapping("/getAllrecruitment2")
	public String getAllrecruitment2(Model model) {
		List<RecruitmentEx> list = recruitmentMapper.getAllList();
		model.addAttribute("list",list);
		return "recruitmentlist";
	}
}
