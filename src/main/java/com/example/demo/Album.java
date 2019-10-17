package com.example.demo;

import java.io.Serializable;
import java.util.Comparator;

public class Album implements Serializable{
	String userId;
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	String id;
	String title;
	
	public static Comparator<Album> getCompByName()
	{

	    Comparator<Album> comp = new Comparator<Album>(){

	        @Override
	        public int compare(Album s1, Album s2)
	        {
	           return s1.title.compareTo(s2.title);
	        }

	    };

	    return comp;
	}

}
