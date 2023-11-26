package com.post.instagram.service;

import com.post.instagram.model.Instagram;
import com.post.instagram.repository.InstagramRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstagramServiceImpl implements InstagramService{

    @Autowired
    private InstagramRepository instagramRepository;

    @Override
    public Instagram savePost(Instagram instagram){
        return instagramRepository.save(instagram);
    }

    @Override
    public List<Instagram> getAllPost() {
        return instagramRepository.findAll();
    }
}
