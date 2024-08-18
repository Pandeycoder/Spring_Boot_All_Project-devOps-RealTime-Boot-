package com.portal.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="User_Master_Tbl")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer userId;
	
	@NotEmpty(message="name is mandatory")
	@Size(min=5 , max=20 , message="Min 5 and max 20 character allowed")
	private String name;
	
	@NotEmpty(message="Email is mandatory")
	@Email(message="Please enter valid email")
	private String email;
	
	@NotNull(message="password is mendatory")
	@Size(min=5 , max=8 , message="Min 5 and max 8 character allowed")
	private String password;
	
	@CreationTimestamp
	@Column(insertable=false)
	private LocalDateTime createTime;
	
	@UpdateTimestamp
	@Column(updatable=false)
	private LocalDateTime updateTime;
	
	
	private String role;
	


	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
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
		this.password =password;
	}

	public LocalDateTime getCreateTime() {
		return createTime;
	}

	public void setCreateTime(LocalDateTime createTime) {
		this.createTime = createTime;
	}

	public LocalDateTime getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(LocalDateTime updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", createTime=" + createTime + ", updateTime=" + updateTime + ", role=" + role + ", getUserId()="
				+ getUserId() + ", getName()=" + getName() + ", getEmail()=" + getEmail() + ", getPassword()="
				+ getPassword() + ", getCreateTime()=" + getCreateTime() + ", getUpdateTime()=" + getUpdateTime()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	
	
	

}
