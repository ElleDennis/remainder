package com.remainder.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by lisette on 7/8/17.
 */
@Entity
public class Registration {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min=3, max=15)
    private String firstname;

    @NotNull
    @Size(min=3, max=15)
    private String lastname;

    @NotNull
    @Size(min=4, max=15)
    private String companyName;

    @NotNull
    private String email;

    @NotNull
    @Size(min=7, max=15)
    private String password;

    @NotNull
    @Size(min=7, max=15)
    private String passwordConfirm;

    public Registration(String firstname, String lastname, String companyName, String email, String password, String passwordConfirm) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.companyName = companyName;
        this.email = email;
        this.password = password;
        this.passwordConfirm = passwordConfirm;
    }

    public Registration() { }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
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
        this.password = password;
    }

    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void put(String firstname, String lastname, String email, String companyName, String password, String passwordConfirm) {
    }
}
