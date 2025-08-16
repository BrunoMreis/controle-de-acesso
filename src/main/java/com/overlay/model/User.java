package com.overlay.model;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.type.Alias;


@Alias("user")
public class User implements Serializable {


	private static final long serialVersionUID = 1L;

	private Long id;

	private String name;
	private String email;

	private String password;

	private Role role;

	private List<RequestStage> requestStages;

	public Long getId() {
		return id;
	}

	public void setId( Long id) {
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

	public void setPassword( String password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public List<RequestStage> getRequestStages() {
		return requestStages;
	}

	public void setRequestStages( List<RequestStage> requestStages) {
		this.requestStages = requestStages;
	}


}
