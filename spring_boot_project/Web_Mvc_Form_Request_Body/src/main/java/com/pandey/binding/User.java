package com.pandey.binding;

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
	
	@NotNull(message="phone Number is mendatory")
	private Long phno;
	
	@CreationTimestamp
	@Column(insertable=false)
	private LocalDateTime createTime;
	
	@UpdateTimestamp
	@Column(updatable=false)
	private LocalDateTime updateTime;
	


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

	public Long getPhno() {
		return phno;
	}

	public void setPhno(Long phno) {
		this.phno = phno;
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
		return "User [userId=" + userId + ", name=" + name + ", email=" + email + ", phno=" + phno + ", createTime="
				+ createTime + ", updateTime=" + updateTime + "]";
	}
	
	
	
	

}
