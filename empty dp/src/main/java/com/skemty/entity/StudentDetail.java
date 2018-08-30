package com.skemty.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class StudentDetail implements Serializable{
private Long stddtlid;
private String stdyear;
private String stdaddress;
@Id
@GeneratedValue
public Long getStddtlid() {
	return stddtlid;
}
public void setStddtlid(Long stddtlid) {
	this.stddtlid = stddtlid;
}
public String getStdyear() {
	return stdyear;
}
public void setStdyear(String stdyear) {
	this.stdyear = stdyear;
}
public String getStdaddress() {
	return stdaddress;
}
public void setStdaddress(String stdaddress) {
	this.stdaddress = stdaddress;
}

}
