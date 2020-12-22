package com.cigatee.test.model;

public class User {
	private static long count;
	private Long id;
	private String name;
	private String email;
	private String password;
	private String contact;
	
	public User(String name, String email, String password, String contact) {
		this.id = 1000 + count++;
		this.name = name;
		this.email = email;
		this.password = password;
		this.contact = contact;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}
}
