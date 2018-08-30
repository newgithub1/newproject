package com.skemty.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Student implements Serializable{
	private Long Sl_No;
	private String Name;
	private String Reg_No;
	private String Location;
	private Boolean Status;
	@Id
	@GeneratedValue
	public Long getSl_No() {
		return Sl_No;
	}
	public void setSl_No(Long sl_No) {
		Sl_No = sl_No;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getReg_No() {
		return Reg_No;
	}
	public void setReg_No(String reg_No) {
		Reg_No = reg_No;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public Boolean getStatus() {
		return Status;
	}
	public void setStatus(Boolean status) {
		Status = status;
	}
}