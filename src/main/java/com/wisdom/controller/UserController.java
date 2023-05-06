package com.wisdom.controller;

import com.wisdom.model.User;
import com.wisdom.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/User")
    public User saveUserInfo(@RequestBody User user){
        try{
            return userService.saveUserInfo(user);
        }catch(Exception e){
            System.out.println("Error saving user details.."  + e);
            return null;
        }
    }

    @PostMapping("/User/logging")
    public User verifyUserInfo(@RequestBody User user){
        try{
            return userService.verifyUserInfo(user);
        }catch(Exception e){
            System.out.println("Error checking user details.."  + e);
            return null;
        }
    }

    @GetMapping("/User")
    public List<User> getAllUserInfo(){
        try{
            return userService.getAllUserInfo();
        }catch(Exception e){
            System.out.println("Error getting all user details.."  + e);
            return null;
        }
    }

    @PutMapping("/User")
    public User updateUserInfo(@RequestBody User user){
        try{
            return userService.updateUserInfo(user);
        }catch(Exception e){
            System.out.println("Error updating user details.."  + e);
            return null;
        }
    }

    @DeleteMapping("/User")
    public boolean deleteUserInfo(@RequestBody User user){
        try{
            userService.deleteUserInfo(user);
            return true;
        }catch(Exception e){
            System.out.println("Error deleting user details.."  + e);
            return false;
        }
    }

}
