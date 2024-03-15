package com.ciq.BEAN;

import java.time.LocalDate;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.annotation.Validated;

public class User {
	
//	@Size(min=1,max=20)
	private String name;
	
	@Email(message="Email must follow the Formatter:****@****")
	@NotBlank(message="Email must be a value")
	private String email;
	
	@NotNull(message="birthday is required field")
	@DateTimeFormat(pattern="MM-dd-yyyy")
	private LocalDate birthday;
	
	@Min(value = 18, message = "must be greater than or equal to 18")
	@NotNull(message = "must be applied")
	private int age;
	
	@NotBlank(message = "Role must be have a value")
	private String role;
	
	@Valid
	private Address address;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String name, String email, LocalDate birthday, int age, String role, Address address) {
		super();
		this.name = name;
		this.email = email;
		this.birthday = birthday;
		this.age = age;
		this.role = role;
		this.address = address;
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

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", birthday=" + birthday + ", age=" + age + ", role=" + role
				+ "]";
	}
	
	
	

}
