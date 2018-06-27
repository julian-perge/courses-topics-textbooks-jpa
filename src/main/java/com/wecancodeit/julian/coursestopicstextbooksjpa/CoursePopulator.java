package com.wecancodeit.julian.coursestopicstextbooksjpa;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class CoursePopulator 
{
	@Resource
	private CourseRepository courseRepo;
	@Resource
	private TopicRepository topicRepo;
	@Resource
	private TextbookRepository textRepo;

	public CoursePopulator()
	{
		Course introToJava = new Course();
		Course introToSpring = new Course();
		Course advancedSoftwareAndDesign = new Course();
		Course introToHTML_CSS_JS = new Course();
	}

}
