package com.javatpoint.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.javatpoint.model.Area;
import com.javatpoint.model.UserRating;
import com.javatpoint.repository.AreaRepository;
import com.javatpoint.repository.RatingRepository;

@Controller
public class AreaController extends HttpServlet {

		
	@Autowired
	AreaRepository areaRepository;
	
	@Autowired
	RatingRepository ratingRepository;

	@RequestMapping(value="/areas")
    public String getAllAreas(HttpServletRequest req,ModelMap model){
	
		String areaname = req.getParameter("areaname");
		System.out.println(areaname);

		Area a =new Area();
		a.setId(5);
		a.setAreas(areaname);
		areaRepository.save(a);
				
		List<Area> allAreas=areaRepository.findAll();
        model.put("areas",allAreas);
        return "ListAllAreas";
    }
	
	
	@RequestMapping(value = { "/index" }, method = RequestMethod.GET)
	public ModelAndView login() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index"); // resources/template/login.html
		return modelAndView;
	}
		
	@RequestMapping(value="/userRating",method=RequestMethod.POST)
	public String getUserRatingSuccess(HttpServletRequest req,ModelMap model) {
		List<String> listofRatings=new ArrayList<String>();
		List<Area> listofAreas=areaRepository.findAll();
		
		String userName = req.getUserPrincipal().getName();
		
		UserRating userRating=null;
		for(Area list: listofAreas) {
			userRating=new UserRating();
			list.getAreas();
			listofRatings.add(req.getParameter(list.getAreas()));
			userRating.setRating(req.getParameter(list.getAreas()));
			userRating.setArea(list.getAreas());
			userRating.setUsername(userName);
			ratingRepository.save(userRating);
			
		}
		
		model.addAttribute("UserRating", ratingRepository.findAll());
		return "userRating";
	}
	
	
}
