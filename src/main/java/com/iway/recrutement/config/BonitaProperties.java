package com.iway.recrutement.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//import com.iway.recrutement.bonita.SessionFactory;

public class BonitaProperties {
	//private static final Logger LOG = LoggerFactory.getLogger(SessionFactory.class);
	public static final int TIME_J = 200;
	public static final String API_CASE_URI = "/API/bpm/case";
	public static final String API_ARCHIVEDCASE_URI = "/API/bpm/archivedCase";
	public static final String API_ACTORMEMBER_URI = "/API/bpm/actorMember";
	public static final String API_PROFILMEMBER_URI = "/API/portal/profileMember";
	public static final String API_PROCESS_URI = "/API/bpm/process";
	public static final String API_ACTOR_URI = "/API/bpm/actor";
	public static final String API_USERIDENTITY_URI = "/API/identity/user";
	public static final String API_HUMAINTASK_URI = "/API/bpm/humanTask";
	public static final String API_ACTIVITY_URI = "/API/bpm/activity";
	public static final String API_ROLEIDENTITY_URI = "/API/identity/role";
	public static final String API_MEMBERSHIPIDENTITY_URI = "/API/identity/membership";
	public static final String API_CASEVAR_URI = "/API/bpm/caseVariable";
	public static final String API_LOGIN_URI = "/loginservice";
	public static final String API_LOGOUT_URI = "/logoutservice";
	public static final String API_CURRENTSESSION_URI = "/API/system/session/unusedid";
	public static final String SERVER_DISPONIBLE = "DISPONIBLE";
	public static final String SERVER_HORS_SERVICE = "HORS SERVICE";
	public static final String API_EXPORT_ORGANIZATION_URI = "/portal/exportOrganization";
	public static final String API_UPLOAD_ORGANIZATION_URI = "/portal/organizationUpload";
	public static final String API_IMPORTSERVICE_ORGANIZATION_URI = "/services/organization/import";
	public static final String API_ACTIVITY_VARIABLE_URI = "/API/bpm/activityVariable/";
	public static final String API_GROUPIDENTITY_URI = "/API/identity/group";
	public static final int HTTP_STATUS_OK = 200;
	public static final int HTTP_STATUS_CREATED = 201;
	private String bonitaConfig;
	public String getBonitaConfig() {
		// TODO Auto-generated method stub
		return null;
	}

}
