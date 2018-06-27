package com.wecancodeit.julian.coursestopicstextbooksjpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Topic
{
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;

	protected Topic() {}
	public Topic(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}

	public String getName() {
		return name;
	}
}
