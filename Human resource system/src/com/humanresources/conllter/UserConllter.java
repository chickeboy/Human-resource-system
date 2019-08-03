package com.humanresources.conllter;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.humanresources.bean.Users;
import com.humanresources.bean.Usertype;
import com.humanresources.mapper.UsersMapper;

@Controller
public class UserConllter {
	@Resource
	UsersMapper usersMapper;

	@RequestMapping("/login")
	public String getLogin(HttpSession session, Model model, String username, String password) {
		Users users = usersMapper.findUsersByUsername(username);
		if (users != null) {
			String password2 = users.getPassword();
			if (password2 != null && password.equals(password2)) {
				int a = users.getType();
				String type = gettype(a);
				session.setAttribute("loginuser", new Usertype(users.getId(),username, type));
				if (a == 3) {				
					return "index_admin";
				}
				if (a == 2) {
					return "index_employees";
				}			
				return "index_tourists";
			}
		}
		return "page-login";
	}

	@RequestMapping("/registeredusername")
	public @ResponseBody boolean getregistered(String username) {
		Users users = usersMapper.findUsersByUsername(username);
		if (users != null) {
			return false;
		}
		return true;
	}

	@RequestMapping("/registered")
	public String getregistered(HttpSession session, Users users) {
		if (users.getUsername() != null && users.getPassword() != null) {
			users.setType(1);
			usersMapper.insert(users);
			Users users2 = usersMapper.findUsersByUsername(users.getUsername());
			session.setAttribute("loginuser", new Usertype(users2.getId(),users.getUsername(), gettype(1)));
			return "index_tourists";
		}
		return "registered";
	}

	public String gettype(int a) {
		String type = null;
		switch (a) {
		case 1:
			type = "游客";
			break;
		case 2:
			type = "员工";
			break;
		case 3:
			type = "管理员";
			break;

		default:
			break;
		}
		return type;
	}

}
