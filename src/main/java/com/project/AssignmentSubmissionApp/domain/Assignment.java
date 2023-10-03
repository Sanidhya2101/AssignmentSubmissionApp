package com.project.AssignmentSubmissionApp.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Assignment {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String status;
	private String githubURL;
	private String branch;
	private String videoURL;
	
	@ManyToOne(optional = false)
	private User user;
	//TODO create private User assignedTo;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getGithubURL() {
		return githubURL;
	}
	public void setGithubURL(String githubURL) {
		this.githubURL = githubURL;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getVideoURL() {
		return videoURL;
	}
	public void setVideoURL(String videoURL) {
		this.videoURL = videoURL;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
	
}
