package com.bigdeal.entity;
// Generated Sep 19, 2020 3:34:09 PM by Hibernate Tools 5.4.18.Final

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Contact generated by hbm2java
 */
@Entity
@Table(name = "contact")
public class Contact implements java.io.Serializable {
	@Id
	@Column(name = "id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "name", length = 255)
	private String name;
	@Column(name = "email", length = 255)
	private String email;
	@Column(name = "phone_number", length = 255)
	private String phoneNumber;
	@Column(name = "subject", length = 255)
	private String subject;
	@Column(name = "message", length = 255)
	private String message;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_at")
	private Date createdAt;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_at")
	private Date updatedAt;

	public Contact() {
	}

	public Contact(String name, String email, String phoneNumber, String subject, String message) {
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.subject = subject;
		this.message = message;
	}

	public Contact(String name, String email, String phoneNumber, String subject, String message, Date createdAt,
			Date updatedAt) {
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.subject = subject;
		this.message = message;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

}