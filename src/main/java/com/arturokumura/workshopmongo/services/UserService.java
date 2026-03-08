package com.arturokumura.workshopmongo.services;

import com.arturokumura.workshopmongo.domain.User;
import com.arturokumura.workshopmongo.dto.UserDTO;
import com.arturokumura.workshopmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }

    public User findById(String id) {
        User user = repo.findById(id).orElse(null);
        if (user == null) {
            throw new ObjectNotFoundException("Object not found");
        }
        return user;
    }

    public User insert(User obj) {
        return repo.insert(obj);
    }

    public User fromDTO(UserDTO objDtO) {
        return new User(objDtO.getId(), objDtO.getName(), objDtO.getEmail());
    }
}
