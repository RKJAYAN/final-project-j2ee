package com.wisdom.controller;

import com.wisdom.model.Bed;
import com.wisdom.service.BedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BedController {

    @Autowired
    private BedService bedService;

    @PostMapping("/Bed")
    public Bed saveBedInfo(@RequestBody Bed bed){
        try{
            return bedService.saveBedInfo(bed);
        }catch(Exception e){
            System.out.println("Error saving bed details.."  + e);
            return null;
        }
    }

    @GetMapping("/Bed")
    public List<Bed> getAllBedInfo(){
        try{
            return bedService.getAllBedInfo();
        }catch(Exception e){
            System.out.println("Error getting all bed details.."  + e);
            return null;
        }
    }

    @PutMapping("/Bed")
    public Bed updateBedInfo(@RequestBody Bed bed){
        try{
            return bedService.updateBedInfo(bed);
        }catch(Exception e){
            System.out.println("Error updating bed details.."  + e);
            return null;
        }
    }

    @DeleteMapping("/Bed")
    public boolean deleteBedInfo(@RequestBody Bed bed){
        try{
            bedService.deleteBedInfo(bed);
            return true;
        }catch(Exception e){
            System.out.println("Error deleting bed details.."  + e);
            return false;
        }
    }
}
