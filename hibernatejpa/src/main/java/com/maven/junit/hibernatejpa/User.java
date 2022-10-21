package com.maven.junit.hibernatejpa;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import javax.persistence.Entity;
@Entity
public class User {
    @Id
    @GeneratedValue
    private int id;
    @NotNull
    private String name;
    @NotNull
    @Pattern(regexp = "(\\d){3,3}-\\d{3,3}-\\d{4,4}",
            message = "The phone number must match 111-111-1111 format")
    private String phone;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

    
}