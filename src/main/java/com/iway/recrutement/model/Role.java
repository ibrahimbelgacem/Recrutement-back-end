package com.iway.recrutement.model;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority{

	
	ROLE_RH,
	ROLE_RESPONSABLE_RECRUTEMENT,
	ROLE_RESPONSABLE_ENTRETIEN,
	ROLE_CANDIDAT,
	ROLE_MANAGER;
	
	public String getAuthority() {
		return name();
	}
}
