package com.wu.learning.StudentDirectory.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
    @Column(name="name")
    private String name;
    @Column(name ="address")
    private String address;
    @Column(name="contact")
    private String contact;
    @Id
    @Column(name="student_id")
    private String student_id;

    public Student() {
    }

    public Student(String name, String student_id, String contact, String address) {
        this.name = name;
        this.student_id = student_id;
        this.contact = contact;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contact='" + contact + '\'' +
                ", student_id='" + student_id + '\'' +
                '}';
    }
}
