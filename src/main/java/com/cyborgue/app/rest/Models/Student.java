package com.cyborgue.app.rest.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String sName;
    @Column
    private String sAddress;
    @Column
    private String sEmail;
    @Column
    private String sPassword;
    
    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getsName() {
        return sName;
    }
    public void setsName(String sName) {
        this.sName = sName;
    }
    public String getsAddress() {
        return sAddress;
    }
    public void setsAddress(String sAddress) {
        this.sAddress = sAddress;
    }
    public String getsEmail() {
        return sEmail;
    }
    public void setsEmail(String sEmail) {
        this.sEmail = sEmail;
    }
    public String getsPassword() {
        return sPassword;
    }
    public void setsPassword(String sPassword) {
        this.sPassword = sPassword;
    }
    public Student(String sName, String sAddress, String sEmail, String sPassword) {
        this.sName = sName;
        this.sAddress = sAddress;
        this.sEmail = sEmail;
        this.sPassword = sPassword;
    }

    @Override
	public String toString() {
		return String.format("Student[id=%d, Name='%s', Address='%s', Email='%s', Password='%s']", id,
				sName, sAddress, sEmail, sPassword);
	}


}
