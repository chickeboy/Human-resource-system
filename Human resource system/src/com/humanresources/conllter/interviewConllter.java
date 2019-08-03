package com.humanresources.conllter;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.humanresources.bean.Interview;
import com.humanresources.bean.InterviewEx;
import com.humanresources.bean.Usertype;
import com.humanresources.mapper.InterviewMapper;

@Controller
public class interviewConllter {
	@Resource
	InterviewMapper interviewMapper;

	@RequestMapping("/setinterview")
	public  String setinterview(HttpSession session, int resumeid) {
		Integer recruitmentid = (Integer) session.getAttribute("recruitmentid");
		Interview interview = new Interview();
		interview.setRecruitmentid(recruitmentid);
		interview.setResumeid(resumeid);
		interviewMapper.insert(interview);
		return "Myinterview";
	}
	@RequestMapping("/allinterview")
	public String getAllInterview(Model model) {
		List<InterviewEx> list = interviewMapper.findAllInterviews();
		model.addAttribute("interviewlist",list);
		return "interviewlist";
	}
	@RequestMapping("/agreed")
	public String agreed(Model model,Date time,int id) {
		Interview interview  = new Interview();		
			interview.setInterviewtime(time);
			interview.setId(id);
			interview.setInterview(1);
			interviewMapper.updateByPrimaryKeySelective(interview);
			return getAllInterview(model);
	}
	@RequestMapping("/disagreed")
	public String agreed(int id) {
		interviewMapper.deleteByPrimaryKey(id);
		return "getAllInterview";
	}
	@RequestMapping("/getMyInterview")
	public String getMyInterview(HttpSession session,Model model) {
		Usertype usertype = (Usertype) session.getAttribute("loginuser");
		List<InterviewEx> list = interviewMapper.findmyInterviews(usertype.getUserid());
		model.addAttribute("myInterviewList",list);
		return "Myinterview";
	}
}
