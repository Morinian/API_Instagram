package com.post.instagram.service;

import com.post.instagram.model.Instagram;

import java.util.List;

public interface InstagramService {

    public  Instagram savePost(Instagram instagram);

    public List<Instagram> getAllPost();
}
