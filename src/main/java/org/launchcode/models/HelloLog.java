package org.launchcode.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "hellolog")
public class HelloLog {
	
	private String name;
	private String language;
	private Date timestamp;
	private int uid;
	
	public HelloLog(String name, String language) {
		this.name = name;
		this.language = language;
		timestamp = new Date();
	}
	
	public HelloLog() {}
	
	@Id
	@GeneratedValue
	@NotNull
	@Column(name = "uid", unique=true)
	public int getUid() {
		return uid;
	}
	
	public void setUid(int uid) {
		this.uid = uid;
	}
	
	@Column(name = "name")
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name = "language")
	public String getLanguage() {
		return language;
	}
	
	public void setLanguage(String language) {
		this.language = language;
	}
	
	@NotNull
	@Column(name = "timestamp")
	public Date getTimestamp() {
		return timestamp;
	}
	
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	
}
