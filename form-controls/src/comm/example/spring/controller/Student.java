package comm.example.spring.controller;

import java.util.LinkedHashMap;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

public class Student {

	@NotNull
	@Size(min = 5,max = 20,message = "first name required")
	private String firstName;
	@NotNull
	@Size(min = 5,max = 20,message = "last name required")
	private String lastName;
	
	private String country;
	@Email(message = "provide valid email")
	private String email;
	@NotNull
	@Range(min =18,max = 55,message = "")
	private int age;

	private String zipCode;
	private LinkedHashMap<String, String> countryOptions;
	
	private String favoriteLanguage;
	
	private String[] operatingSystems;
	
	public Student() {
		
		// populate country options: used ISO country code
		countryOptions = new LinkedHashMap<>();
		
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("DE", "Germany");
		countryOptions.put("IN", "India");
		countryOptions.put("US", "United States of America");		

	}

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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
			
}
