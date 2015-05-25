package com.db.bean;

import java.util.Date;

/**
 * --------Device Table-----------
 * idx					int
 * ipAddress		varchar(100)
 * macAddress	varchar(100)
 * shopCode		int
 * enrollTime		datetime
 * confirmTime	datetime
 * status				int
 */
public class DeviceBean {
	private int idx;
	private String ipAddress;
	private String macAddress;
	private int shopCode;
	private Date enrollTime;
	private Date confirmTime;
	private int status;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public String getMacAddress() {
		return macAddress;
	}
	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}
	public int getShopCode() {
		return shopCode;
	}
	public void setShopCode(int shopCode) {
		this.shopCode = shopCode;
	}
	public Date getEnrollTime() {
		return enrollTime;
	}
	public void setEnrollTime(Date enrollTime) {
		this.enrollTime = enrollTime;
	}
	public Date getConfirmTime() {
		return confirmTime;
	}
	public void setConfirmTime(Date confirmTime) {
		this.confirmTime = confirmTime;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
}
