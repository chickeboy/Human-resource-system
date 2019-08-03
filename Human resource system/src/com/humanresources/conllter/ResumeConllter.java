package com.humanresources.conllter;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.humanresources.bean.Resume;
import com.humanresources.bean.Usertype;
import com.humanresources.mapper.ResumeMapper;

@Controller
public class ResumeConllter {
	@Resource
	ResumeMapper resumeMapper;

	@RequestMapping("/goResume")
	public String goResume() {
		return "resumepage";
	}

	@RequestMapping("/setResume2")
	public String setResume() {
		return "setResume";
	}

	@RequestMapping("/addresume")
	public String setResume(Model model,HttpSession session, Resume resume) {
		Usertype usertype = (Usertype) session.getAttribute("loginuser");
		int id = usertype.getUserid();
		resume.setUserid(id);
		resumeMapper.insert(resume);
		return getAllResume(model,session);
	}

	@RequestMapping("/getAllResume")
	public String getAllResume(Model model,HttpSession session) {
		Usertype usertype = (Usertype) session.getAttribute("loginuser");
		List<Resume> list = resumeMapper.findResumeByUserName(usertype.getUsername());
		model.addAttribute("resumelist", list);
		return "resumelist";
	}

	@RequestMapping("/getAllResume2")
	public  String getAllResume2(HttpSession session, Integer recruitmentid) {
		Usertype usertype = (Usertype) session.getAttribute("loginuser");
		session.setAttribute("recruitmentid", recruitmentid);
		List<Resume> list = resumeMapper.findResumeByUserName(usertype.getUsername());
		session.setAttribute("resumelist", list);
		return "myresumeset";
	}
}
