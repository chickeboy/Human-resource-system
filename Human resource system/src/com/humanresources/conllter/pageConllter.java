package com.humanresources.conllter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class pageConllter {
	@RequestMapping("/pagelogin")
	public String pagelogin() {
		return "page-login";
	}
	@RequestMapping("/pageregister")
	public String pageregister() {
		return "page_register";
	}@RequestMapping("/indextourists")
	public String indextourists() {
		return "index_tourists";
	}
	@RequestMapping("/get")
	public String sce() {
		return "newpage";
	}
	@RequestMapping("/indexadmin")
	public String indexadmin() {
		return "index_admin";
	}
	@RequestMapping("/addpage")
	public String addpage() {
		return "adddepartmentpage";
	}
	@RequestMapping("/addposition2")
	public String addposition() {
		return "addPosition";
	}
	@RequestMapping("/addrecruitment2")
	public String addrecruitment() {
		return "addrecruitment";
	}
	@RequestMapping("/addresume2")
	public String addresume() {
		return "addresume";
	}
}
