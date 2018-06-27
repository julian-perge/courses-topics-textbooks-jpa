package com.wecancodeit.julian.coursestopicstextbooksjpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Course
{
	@Id
	@GeneratedValue
	private Long id;
	
	private List<Topic> topics;
	private String title;
	private String description;
	
	protected Course() {}
	public Course(String title, String description) {
		this.title = title;
		this.description = description;
	}
	
	@Override
	public String toString() {
		return title + " " + description + " " + topics.toString();
	}
	
	public String getTitle() {
		return title;
	}
	public String getDescription() {
		return description;
	}
	
	public Collection<Topic> getTopics() {
		return topics;
	}
}
