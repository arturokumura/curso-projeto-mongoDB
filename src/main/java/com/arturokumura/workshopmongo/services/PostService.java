package com.arturokumura.workshopmongo.services;

import com.arturokumura.workshopmongo.domain.Post;
import com.arturokumura.workshopmongo.domain.User;
import com.arturokumura.workshopmongo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;


    public Post findById(String id) {
        Post user = repo.findById(id).orElse(null);
        if (user == null) {
            throw new ObjectNotFoundException("Object not found");
        }
        return user;
    }
}
