package models;

import java.util.Objects;

public class MainModel {
	String Name;
	String profileName;
	String description;
	int likes;
	
	public MainModel(String name, String profileName, String description)
	{
		super();
		this.Name = name;
		this.profileName = profileName;
		this.description = description;
		this.likes = 0;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	public String getProfileName() {
		return profileName;
	}
	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	
}