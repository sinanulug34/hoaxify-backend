package com.hoaxify.webservices.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    UserRepository userRepository;

    //yalnızca 1 constructor varsa @Autowired a gerek yok.
    //ve o constructor parametreler alıyorsa autowired zorunlu değil
    //burada constructor injection yaptık.
    //@Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void save(User user) {
        userRepository.save(user);
    }
}
