package com.examplereqmapping.reqmapping.services;

import com.examplereqmapping.reqmapping.model.Comment;
import com.examplereqmapping.reqmapping.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.stream.Stream;


@Service
public class FileStorageService {

    @Autowired
    private CommentRepository commentRepository;

    public Comment store(MultipartFile file, String text) throws IOException {
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        Comment comment = new Comment( text,fileName, file.getContentType(), file.getBytes());

        return commentRepository.save(comment);
    }

    public Comment getFile(Long id) {
        return commentRepository.findById(id).get();
    }

    public Stream<Comment> getAllFiles() {
        return commentRepository.findAll().stream();
    }
}
