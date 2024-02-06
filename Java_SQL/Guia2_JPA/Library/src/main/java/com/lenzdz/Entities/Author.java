package com.lenzdz.Entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Author {

    @Id
    @GeneratedValue (strategy= GenerationType.AUTO)
    private Long id;
    @Basic
    private String name;
    private String lastname;
    private LocalDate birth;

    public Author() {
    }

    public Author(String name, String lastname, LocalDate birth) {
        this.name = name;
        this.lastname = lastname;
        this.birth = birth;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", birth=" + birth +
                '}';
    }

}
