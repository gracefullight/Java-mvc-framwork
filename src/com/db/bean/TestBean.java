package com.db.bean;

/**
 * ---------USER TABLE------------
 * idx int PK AutoIncrease
 * userid varchar(45)
 * passwd varchar(100)
 */
public class TestBean {
	
	private int idx;
	private String userid;
	private String passwd;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
	
}
