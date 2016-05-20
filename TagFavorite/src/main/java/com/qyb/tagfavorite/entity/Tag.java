package com.qyb.tagfavorite.entity;

import java.io.Serializable;

public class Tag implements Serializable{
	private static final long serialVersionUID = -4446872688381419707L;
	private int  t_id; 
	private String t_name; 
	private int t_count;

	public int getT_id() {
		return t_id;
	}
	public void setT_id(int t_id) {
		this.t_id = t_id;
	}
	public String getT_name() {
		return t_name;
	}
	public void setT_name(String t_name) {
		this.t_name = t_name;
	}
	public int getT_count() {
		return t_count;
	}
	public void setT_count(int t_count) {
		this.t_count = t_count;
	}
	public Tag(int t_id, String t_name, int t_count) {
		super();
		this.t_id = t_id;
		this.t_name = t_name;
		this.t_count = t_count;
	}
	public Tag() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Tag [t_id=" + t_id + ", t_name=" + t_name + ", t_count="
				+ t_count + "]";
	}

}
