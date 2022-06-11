package com.iway.recrutement.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "USER")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private long createdBy;
	private Date creationDate;
	private String firstName;
	private String lastName;
	private Long iconId;
	private String iconName;
	private String iconPath;
	private String jobTitle;
	private Date lastConnection;
	private Date lastUpdate;
	private long managerUserId;
	private String managerUseName;
	private String password;
	private String title;
	private String userName;
	private String email;
	private boolean enabled;
	@ElementCollection(fetch=FetchType.EAGER)
	List<Role> roles;
	

}
