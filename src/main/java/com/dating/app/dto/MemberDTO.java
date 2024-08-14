package com.dating.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class MemberDTO {
    private String firstName;
    private String lastName;
    private String gender;
    private int age;
    private String mbrPlan;
    private String mobNo;
    private String interest;
    private String country;
    private String countryCode;

    public MemberDTO(String firstName, String lastName, String gender, int age, String mbrPlan, String mobNo, String interest, String country, String countryCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.mbrPlan = mbrPlan;
        this.mobNo = mobNo;
        this.interest = interest;
        this.country = country;
        this.countryCode = countryCode;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMbrPlan() {
        return mbrPlan;
    }

    public void setMbrPlan(String mbrPlan) {
        this.mbrPlan = mbrPlan;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
}
