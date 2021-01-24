package com.javatpoint.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javatpoint.model.Area;
import com.javatpoint.repository.AreaRepository;

@Controller
public class HomeController {
	
	@Autowired
	AreaRepository areaRepository;
	
	@GetMapping(value="/login")
	public String getLoginPage() {
		return "login";
	}

	@GetMapping(value="/")
	public String getHomePage() {
		return "index";
	}
	
	@RequestMapping(value="/userDashboard")
	public String userDashboard(HttpServletRequest req,ModelMap model) {
		//System.out.println("User Dashboard");
		return "userdashboard";
	}

	
	
	@RequestMapping(value="/userareas",method=RequestMethod.POST)
    public String getAllAreas(HttpServletRequest req,ModelMap model){
		List<Area> allAreas=areaRepository.findAll();
		//System.out.println(allAreas);
		model.put("userareas", allAreas);
		return "userareas";
    }
	
	@GetMapping("/adminDashboard")
	public String adminDashboard() {
		return "admindashboard";
	}
}
