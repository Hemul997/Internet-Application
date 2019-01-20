package com.internetapplications2018.myblog.service.impl;

import com.internetapplications2018.myblog.model.Comment;
import com.internetapplications2018.myblog.repository.CommentRepository;
import com.internetapplications2018.myblog.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImp implements CommentService {

    private final CommentRepository commentRepository;

    @Autowired
    public CommentServiceImp(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    @Override
    public Comment save(Comment comment) {
        return commentRepository.saveAndFlush(comment);
    }
}
