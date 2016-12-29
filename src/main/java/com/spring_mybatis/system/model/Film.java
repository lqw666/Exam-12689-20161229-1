package com.spring_mybatis.system.model;

import org.springframework.beans.factory.annotation.Required;

public class Film {
	
	private String title;
	private String description;
	private String language_id;
	
	public String getTitle() {
		return title;
	}
	@Required
	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}
	@Required
	public void setDescription(String description) {
		this.description = description;
	}

	

	public String getLanguage_id() {
		return language_id;
	}
	@Required
	public void setLanguage_id(String language_id) {
		this.language_id = language_id;
	}
	@Override
	public String toString() {
		return "Film [title=" + title + ", description=" + description + ", language=" + language_id + "]";
	}
	

}
