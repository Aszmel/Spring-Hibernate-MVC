package com.luv2code.springdemo.mvc;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import com.luv2code.springdemo.mvc.validation.CourseCode;

public class Customer {

	private String firstName;
	
	@NotNull(message = "Correct name is required")
	@Size(min=1, message="Last name is required")
	private String lastName;
	
	@NotNull(message = "is required")
	@Min(value=0, message = "must be equal or greater then 0")
	@Max(value=10, message = "must be equal 10 or less")
	private Integer freePass;
	
	@Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 chars/digits")
	private String postalCode;
	
	@CourseCode(value="LUV", message="must start with LUV")
	@NotNull(message="field is required")
	private String courseCode;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getFreePass() {
		return freePass;
	}
	public void setFreePass(Integer freePass) {
		this.freePass = freePass;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
}
