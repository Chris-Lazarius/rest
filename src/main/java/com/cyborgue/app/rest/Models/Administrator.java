package com.cyborgue.app.rest.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Administrator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long admin_id;
    @Column
    private String admin_Name;
    @Column
    private String admin_password;
    @Column
    private String admin_contact;
    public long getAdmin_id() {
        return admin_id;
    }
    public void setAdmin_id(long admin_id) {
        this.admin_id = admin_id;
    }
    public String getAdmin_Name() {
        return admin_Name;
    }
    public void setAdmin_Name(String admin_Name) {
        this.admin_Name = admin_Name;
    }
    public String getAdmin_password() {
        return admin_password;
    }
    public void setAdmin_password(String admin_password) {
        this.admin_password = admin_password;
    }
    public String getAdmin_contact() {
        return admin_contact;
    }
    public void setAdmin_contact(String admin_contact) {
        this.admin_contact = admin_contact;
    }
    
    public Administrator(long admin_id, String admin_Name, String admin_password, String admin_contact) {
        this.admin_id = admin_id;
        this.admin_Name = admin_Name;
        this.admin_password = admin_password;
        this.admin_contact = admin_contact;
    }

    @Override
	public String toString() {
		return String.format("Administrator[id=%d, Name='%s', Password='%s', Contact='%s']", admin_id, admin_Name, admin_password, admin_contact);
	}
    
    
    

}
