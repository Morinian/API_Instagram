package com.post.instagram.controller;

import com.post.instagram.model.Instagram;
import com.post.instagram.service.InstagramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/instagram")
@CrossOrigin
public class InstagramController {

    @Autowired
    private InstagramService instagramService;

    @PostMapping("/post")
    public String add(@RequestBody Instagram instagram){
        instagramService.savePost(instagram);
        return "Post Feito";
    }

    @GetMapping("/getAll")
    public List<Instagram> list(){
        return instagramService.getAllPost();
    }

}
