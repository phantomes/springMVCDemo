package com.etmobile.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TabUser entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tabUser")
public class TabUser implements java.io.Serializable {

	// Fields

	private Long id;
	private String name;
	private String password;
	private String textKk;
	private Date createDate;

	// Constructors

	/** default constructor */
	public TabUser() {
	}

	/** minimal constructor */
	public TabUser(Long id) {
		this.id = id;
	}

	/** full constructor */
	public TabUser(Long id, String name, String password, String textKk, Date createDate) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.textKk = textKk;
		this.createDate = createDate;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	@Column(name = "Id", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "Name")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "Password")
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "TextKK")
	public String getTextKk() {
		return this.textKk;
	}

	public void setTextKk(String textKk) {
		this.textKk = textKk;
	}

	@Column(name = "CreateDate", length = 23)
	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

}