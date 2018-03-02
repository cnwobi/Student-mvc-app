package com.buck.production;

import javax.validation.constraints.*;
import java.util.LinkedHashMap;

public class Student {
    private String firstName;

    @NotNull(message = "Please enter your last name")
    @Size(min = 1, message = "is required")
        private String lastName;

    @Pattern(regexp = "^[0-9]{4}",message = "PostCde must be 4 digits")
    private String postCode;

    private String country;
    private LinkedHashMap<String, String> countryoptions;
    private LinkedHashMap<String, String> favouriteLanguageOptions;
    private String favouriteLanguage;
    private String[] operatingSystems;


    @Min(value = 0,message="must be greater than or equal to zero")
    @Max(value = 5, message="must less than or equal to 5")
    private Integer coursesOfferred;


    public Student() {

        // intialize and population country options
        countryoptions = new LinkedHashMap<>();
        getCountryoptions().put("GB", "Britain");
        getCountryoptions().put("AU", "Australia");
        getCountryoptions().put("NGA", "Nigeria");
// parameter order: value, display label

        favouriteLanguageOptions = new LinkedHashMap<>();
        getFavouriteLanguageOptions().put("Java", "Java");
        getFavouriteLanguageOptions().put("C#", "C#");
        getFavouriteLanguageOptions().put("Ruby", "Ruby");
        getFavouriteLanguageOptions().put("PHP", "PHP");

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

    public LinkedHashMap<String, String> getCountryoptions() {
        return countryoptions;
    }

    public void setCountryoptions(LinkedHashMap<String, String> countryoptions) {
        this.countryoptions = countryoptions;
    }

    public LinkedHashMap<String, String> getFavouriteLanguageOptions() {
        return favouriteLanguageOptions;
    }

    public void setFavouriteLanguageOptions(LinkedHashMap<String, String> favouriteLanguageOptions) {
        this.favouriteLanguageOptions = favouriteLanguageOptions;
    }

    public String getFavouriteLanguage() {
        return favouriteLanguage;
    }

    public void setFavouriteLanguage(String favouriteLanguage) {
        this.favouriteLanguage = favouriteLanguage;
    }

    public String[] getOperatingSystems() {
        return operatingSystems;
    }

    public void setOperatingSystems(String[] operatingSystems) {
        this.operatingSystems = operatingSystems;
    }

    public Integer getCoursesOfferred() {
        return coursesOfferred;
    }

    public void setCoursesOfferred(Integer coursesOfferred) {
        this.coursesOfferred = coursesOfferred;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }
}

