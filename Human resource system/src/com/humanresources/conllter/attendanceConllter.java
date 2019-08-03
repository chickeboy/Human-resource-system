package com.humanresources.conllter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.humanresources.bean.Attendance;
import com.humanresources.bean.Usertype;
import com.humanresources.mapper.AttendanceMapper;
import com.humanresources.util.TimeUtil;

@Controller
public class attendanceConllter {
	@Resource
	AttendanceMapper attendanceMapper;
	TimeUtil timeUtil = new TimeUtil();

	@RequestMapping("/getattendancedays")
	public String getattendancedays(HttpSession session, Model model) {
		Usertype usertype = (Usertype) session.getAttribute("loginuser");
		model.addAttribute("days", attendanceMapper.findattdays(usertype.getUserid()));
		model.addAttribute("leavedays", attendanceMapper.findLeaveDays(usertype.getUserid()));
		model.addAttribute("overtime", attendanceMapper.findovertimeDays(usertype.getUserid()));
		return "attendancepage";
	}

	@RequestMapping("/getovertime")
	public String getovertime(HttpSession session, Model model) {
		Usertype usertype = (Usertype) session.getAttribute("loginuser");
		Attendance attendance = (Attendance) session.getAttribute("attendance");
		attendance.setAfterstateid(6);
		return getattendancedays(session, model);
	}

	@RequestMapping("/getleavebutton")
	public String getleavebutton(HttpSession session, Model model) {
		String time = timeUtil.getTimestr() + " 09:00:00";
		String time2 = timeUtil.getTimestr() + " 17:00:00";
		Usertype usertype = (Usertype) session.getAttribute("loginuser");
		Attendance attendance = new Attendance();
		try {
			Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(time);
			Date date2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(time2);
			attendance.setWorktime(date);
			attendance.setAfterworktime(date2);
			attendance.setWorkstateid(5);
			attendance.setAfterstateid(5);
			attendance.setUserid(usertype.getUserid());
			attendanceMapper.insert(attendance);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return getattendancedays(session, model);
	}

	@RequestMapping("/Signin")
	public String Signin(HttpSession session, Model model) {
		Object object = session.getAttribute("Sign");
		if (object == null) {
			session.setAttribute("Sign", 1);
			addattendance(session);
		} else {
			int state = (int) object;
			if (state == 1) {
				session.setAttribute("Sign", 2);
				if (session.getAttribute("attendance") != null) {
					Attendance attendance = (Attendance) session.getAttribute("attendance");
					afterWorkAttendance(session, attendance);
				}
			}
			if (state == 2) {
				session.setAttribute("Sign", 1);
				addattendance(session);
			}
		}

		return getattendancedays(session, model);
	}

	public void addattendance(HttpSession session) {
		Usertype usertype = (Usertype) session.getAttribute("loginuser");
		Date nowDate = timeUtil.nowTime();
		String time = timeUtil.getTimestr() + " 09:00:00";
		String time2 = timeUtil.getTimestr() + " 12:00:00";
		try {
			Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(time);
			Date date2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(time2);
			Attendance attendance = new Attendance();
			attendance.setWorktime(nowDate);
			attendance.setUserid(usertype.getUserid());
			if (date.compareTo(nowDate) == -1) {
				attendance.setWorkstateid(2);
				if (date2.compareTo(nowDate) == -1) {
					attendance.setWorkstateid(4);
				}
			} else {
				attendance.setWorkstateid(1);
			}
			attendanceMapper.insert(attendance);
			session.setAttribute("attendance", attendance);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void afterWorkAttendance(HttpSession session, Attendance attendance) {
		Usertype usertype = (Usertype) session.getAttribute("loginuser");
		Date nowDate = timeUtil.nowTime();
		String time = timeUtil.getTimestr() + " 17:00:00";
		try {
			Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(time);
			attendance.setUserid(usertype.getUserid());
			if ((attendance.getAfterstateid() == null)||(attendance.getAfterstateid() != 6)) {
				attendance.setAfterworktime(date);
				if (date.compareTo(nowDate) == 1) {
					attendance.setAfterstateid(3);
				} else {
					attendance.setAfterstateid(1);
				}
			} else {
				if (date.compareTo(nowDate) == -1) {
					attendance.setAfterworktime(nowDate);
				} else if (date.compareTo(nowDate) == 0) {
					attendance.setAfterworktime(date);
					attendance.setAfterstateid(1);
				} else {
					attendance.setAfterworktime(date);
					attendance.setAfterstateid(3);
				}
			}

			attendance.setId(attendanceMapper.findidByTime(attendance.getWorktime()));
			attendanceMapper.updateByPrimaryKeySelective(attendance);

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
