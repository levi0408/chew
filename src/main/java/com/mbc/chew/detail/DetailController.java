package com.mbc.chew.detail;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class DetailController {

	@RequestMapping(value = "/detail")
	public String dd1() {
		
		return "detailview";
	}
	
	
	
}
