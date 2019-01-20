package com.internetapplications2018.myblog.repository;

import com.internetapplications2018.myblog.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
