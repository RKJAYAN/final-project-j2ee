package com.wisdom.controller;

import com.wisdom.model.Ward;
import com.wisdom.service.WardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class WardController {

    @Autowired
    private WardService wardService;

    @PostMapping("/Ward")
    public Ward saveWardInfo(@RequestBody Ward ward){
        try{
            return wardService.saveWardInfo(ward);
        }catch(Exception e){
            System.out.println("Error saving ward details.."  + e);
            return null;
        }
    }

    @GetMapping("/Ward")
    public List<Ward> getAllWardInfo(){
        try{
            return wardService.getAllWardInfo();
        }catch(Exception e){
            System.out.println("Error getting all ward details.."  + e);
            return null;
        }
    }

    @PutMapping("/Ward")
    public Ward updateWardInfo(@RequestBody Ward ward){
        try{
            return wardService.updateWardInfo(ward);
        }catch(Exception e){
            System.out.println("Error updating ward details.."  + e);
            return null;
        }
    }

    @DeleteMapping("/Ward")
    public boolean deleteWardInfo(@RequestBody Ward ward){
        try{
            wardService.deleteWardInfo(ward);
            return true;
        }catch(Exception e){
            System.out.println("Error deleting ward details.."  + e);
            return false;
        }
    }

    @GetMapping("/Wardf")
    public Ward getWardInfo(@RequestBody Ward ward){
        Optional<Ward> w = null;

        try{
            w = wardService.getWardInfo(ward);
          //return w.get();
          if(w.isPresent()){
              return w.get();
          }
        }catch(Exception e){
            System.out.println("Error getting ward details.."  + e);
            return null;
        }
        return w.get();
    }
}
