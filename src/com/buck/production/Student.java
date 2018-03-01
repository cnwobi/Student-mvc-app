package com.buck.production;

import java.util.LinkedHashMap;

public class Student {
    private String firstName;
    private String lastName;
    private String country;
    private LinkedHashMap<String,String> countryoptions;
    public Student(){
      countryoptions= new LinkedHashMap<>();
        getCountryoptions().put("GB","Britain");
        getCountryoptions().put("AU", "Australia");
        getCountryoptions().put ("NGA","Nigeria");

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
}

