package com.wisdom.service;

import com.wisdom.model.User;
import com.wisdom.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User verifyUserInfo(User user) throws Exception{
        User _user = userRepository.findByUserName(user.getUserName());

        if(_user.getUserPassword().equals(user.getUserPassword())){
            return _user;
        }
        else{
            return null;
        }
    }
    public User saveUserInfo(User user) throws Exception{
        return userRepository.save(user);
    }

    public List<User> getAllUserInfo() throws Exception {
        return userRepository.findAll();
    }

    public User updateUserInfo(User user) throws Exception{
        return userRepository.save(user);
    }

    public void deleteUserInfo(User user) throws Exception{
        userRepository.delete(user);
    }

}
