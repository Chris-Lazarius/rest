package com.cyborgue.app.rest.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Register {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long register_id;
    @Column
    private String strudent_name;
    @Column
    private String student_address;
    @Column
    private String student_email;
    @Column
    private String student_password;
    @Column
    private String course_name;

    
    public long getRegister_id() {
        return register_id;
    }
    public void setRegister_id(long register_id) {
        this.register_id = register_id;
    }
    public String getStrudent_name() {
        return strudent_name;
    }
    public void setStrudent_name(String strudent_name) {
        this.strudent_name = strudent_name;
    }
    public String getStudent_address() {
        return student_address;
    }
    public void setStudent_address(String student_address) {
        this.student_address = student_address;
    }
    public String getStudent_email() {
        return student_email;
    }
    public void setStudent_email(String student_email) {
        this.student_email = student_email;
    }
    public String getStudent_password() {
        return student_password;
    }
    public void setStudent_password(String student_password) {
        this.student_password = student_password;
    }
    public String getCourse_name() {
        return course_name;
    }
    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }
    
    
    public Register(String strudent_name, String student_address, String student_email, String student_password, String course_name) {
        this.strudent_name = strudent_name; 
        this.student_address = student_address;
        this.student_email = student_email; 
        this.student_password = student_password;
        this.course_name = course_name;
    }

    @Override
	public String toString() {
		return String.format("Register[id=%d, Name='%s', Address='%s', Email='%s', Password='%s', Course name='%s']", register_id,
        strudent_name, student_address, student_email, student_password, course_name);
	}
    
    

}
