package com.qyb.cinema.entity;

import java.io.Serializable;

public class FilmBean implements Serializable{
	private static final long serialVersionUID = 103266248444404870L;
	
	 private String filmname;
	 private String typeid;
	 private String actor;
	 private String director;
	 private String minprice;
	 private String maxprice;
	 
	public String getFilmname() {
		return filmname;
	}
	public void setFilmname(String filmname) {
		this.filmname = filmname;
	}
	public String getTypeid() {
		return typeid;
	}
	public void setTypeid(String typeid) {
		this.typeid = typeid;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getMinprice() {
		return minprice;
	}
	public void setMinprice(String minprice) {
		this.minprice = minprice;
	}
	public String getMaxprice() {
		return maxprice;
	}
	public void setMaxprice(String maxprice) {
		this.maxprice = maxprice;
	}
	public FilmBean(String filmname, String typeid, String actor,
			String director, String minprice, String maxprice) {
		super();
		this.filmname = filmname;
		this.typeid = typeid;
		this.actor = actor;
		this.director = director;
		this.minprice = minprice;
		this.maxprice = maxprice;
	}
	public FilmBean() {
		super();
	}
	@Override
	public String toString() {
		return "FilmBean [filmname=" + filmname + ", typeid=" + typeid
				+ ", actor=" + actor + ", director=" + director + ", minprice="
				+ minprice + ", maxprice=" + maxprice + "]";
	}
	
	 
}
