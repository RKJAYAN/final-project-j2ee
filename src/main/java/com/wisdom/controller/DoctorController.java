package com.wisdom.controller;

import com.wisdom.model.Doctor;
import com.wisdom.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @PostMapping("/Doctor")
    public Doctor saveDoctorInfo(@RequestBody Doctor doctor){
        try{
            return doctorService.saveDoctorInfo(doctor);
        }catch(Exception e){
            System.out.println("Error saving doctor details.."  + e);
            return null;
        }
    }

    @GetMapping("/Doctor")
    public List<Doctor> getAllDoctorInfo(){
        try{
            return doctorService.getAllDoctorInfo();
        }catch(Exception e){
            System.out.println("Error getting all doctor details.."  + e);
            return null;
        }
    }

    @PutMapping("/Doctor")
    public Doctor updateDoctorInfo(@RequestBody Doctor doctor){
        try{
            return doctorService.updateDoctorInfo(doctor);
        }catch(Exception e){
            System.out.println("Error updating doctor details.."  + e);
            return null;
        }
    }

    @DeleteMapping("/Doctor")
    public boolean deleteDoctorInfo(@RequestBody Doctor doctor){
        try{
            doctorService.deleteDoctorInfo(doctor);
            return true;
        }catch(Exception e){
            System.out.println("Error deleting doctor details.."  + e);
            return false;
        }
    }


}
