package com.wecancodeit.julian.coursestopicstextbooksjpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CourseController
{
	@Autowired
	TopicRepository topicRepo;
	@Autowired
	TextbookRepository textRepo;
	@Autowired
	CourseRepository courseRepo;
	
	// localhost:8080/
	@RequestMapping("/")
	public String getCourses(Model model) {
		model.addAttribute("courses", courseRepo.findAll());
		return "courses";
	}
}
