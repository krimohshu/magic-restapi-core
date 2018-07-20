package com.demo.framework.restapis.entity;

import javax.persistence.*;
import java.io.Serializable;
/**
 * Created by Krishan Shukla on 19/07/2018.
 */

@Entity
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "firstName" , nullable = true)
    private String firstName;
    @Column(name = "lastName" , nullable = true)
    private String lastName;

    @Column(name = "age" , nullable = true)
    private int age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
