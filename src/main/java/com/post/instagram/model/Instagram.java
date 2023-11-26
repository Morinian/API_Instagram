package com.post.instagram.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Instagram {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int PK_idpost;

    private String post_perfil ;
    private String post_nome;
    private String post_img;
    private String post_des;

    public int getPK_idpost() {
        return PK_idpost;
    }

    public void setPK_idpost(int PK_idpost) {
        this.PK_idpost = PK_idpost;
    }

    public String getPost_perfil() {
        return post_perfil;
    }

    public void setPost_perfil(String post_perfil) {
        this.post_perfil = post_perfil;
    }

    public String getPost_nome() {
        return post_nome;
    }

    public void setPost_nome(String post_nome) {
        this.post_nome = post_nome;
    }

    public String getPost_img() {
        return post_img;
    }

    public void setPost_img(String post_img) {
        this.post_img = post_img;
    }

    public String getPost_des() {
        return post_des;
    }

    public void setPost_des(String post_des) {
        this.post_des = post_des;
    }
}
