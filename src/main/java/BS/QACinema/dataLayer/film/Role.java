package com.QAC.BlueTeam;

import javax.validation.constraints.*;

public class Role {

	@NotNull
	private String role;

	public Role(String role) {
		this.role = role;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
