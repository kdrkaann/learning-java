package com.kafein.project.Entities;

import javax.persistence.*;

@Entity
@Table(name="user")
public class User {

    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userID;

    @Column(name="Username")
    private String username;

    @Column(name="Password")
    private String password;

    @Column(name="BlogPost")
    private String blogPost;

    public User(int userID, String username, String password, String blogPost) {
        this.userID = userID;
        this.username = username;
        this.password = password;
        this.blogPost = blogPost;
    }

    public User(){

    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBlogPost() {
        return blogPost;
    }

    public void setBlogPost(String blogPost) {
        this.blogPost = blogPost;
    }
}
