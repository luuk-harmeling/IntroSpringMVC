package com.pluralsight.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Activity;
import model.Exercise;



@Controller
public class MinutesController {
	
	@RequestMapping(value = "/addMinutes")
	public String addMinutes(@ModelAttribute("exercise") Exercise exercise ) {
		
		System.out.println("exercise" + exercise.getMinutes());
		return "addMinutes";
	}
	
	
//	@RequestMapping(value = "/activities", method = RequestMethod.GET)
//	public @ResponseBody List<Activity>findAllActivities() {
//		List<Activity> activities = new ArrayList<Activity>();
//		
//		Activity runActivity = new Activity();
//		runActivity.setDesc("Run!");
//		activities.add(runActivity);
//		
//		Activity bikeActivity = new Activity();
//		bikeActivity.setDesc("Bike!");
//		activities.add(bikeActivity);
//		
//		Activity swimActivity = new Activity();
//		swimActivity.setDesc("Swim!");
//		activities.add(swimActivity);
//		
//		return activities;
//	}
}
