package com.wecancodeit.julian.coursestopicstextbooksjpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Textbook
{
	@Id
	@GeneratedValue
	private Long id;
	
	private List<Course> courses;
	private String title;

	protected Textbook() {}
	public Textbook(String title, Course ...courses) {
		this.title = title;
		this.courses = new ArrayList<>(Arrays.asList(courses));
	}
	
	@Override
	public String toString() {
		return title + " " + courses.toString();
	}
	
	public String getTitle() {
		return title;
	}
	
	public Collection<Course> getCourses() {
		return courses;
	}
}
