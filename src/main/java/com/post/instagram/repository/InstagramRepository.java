package com.post.instagram.repository;

import com.post.instagram.model.Instagram;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstagramRepository extends JpaRepository<Instagram, Integer> {
}
