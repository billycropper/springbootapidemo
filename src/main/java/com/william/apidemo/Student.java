package com.william.apidemo;

import javax.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private Integer favoriteNumber;

    public Student(){

    }

    public Student(Long id, String name, Integer favoriteNumber) {
        this.id = id;
        this.name = name;
        this.favoriteNumber = favoriteNumber;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getFavoriteNumber() {
        return favoriteNumber;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFavoriteNumber(Integer favoriteNumber) {
        this.favoriteNumber = favoriteNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", favoriteNumber=" + favoriteNumber +
                '}';
    }
}
