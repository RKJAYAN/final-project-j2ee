package com.wisdom.controller;

import com.wisdom.model.Patient;
import com.wisdom.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
public class PatientController {

    @Autowired
    private PatientService patientService;

    @PostMapping("/Patient")
    public Patient savePatientInfo(@RequestBody Patient patient){
        try{
            return patientService.savePatientInfo(patient);
        }catch(Exception e){
            System.out.println("Error saving patient details.."  + e);
            return null;
        }
    }

    @GetMapping("/Patient")
    public List<Patient> getAllPatientInfo(){
        try{
            return patientService.getAllPatientInfo();
        }catch(Exception e){
            System.out.println("Error getting all patient details.."  + e);
            return null;
        }
    }

    @PutMapping("/Patient")
    public Patient updatePatientInfo(@RequestBody Patient patient){
        try{
            return patientService.updatePatientInfo(patient);
        }catch(Exception e){
            System.out.println("Error updating patient details.."  + e);
            return null;
        }
    }

    @DeleteMapping("/Patient")
    public boolean deletePatientInfo(@RequestBody Patient patient){
        try{
            patientService.deletePatientInfo(patient);
            return true;
        }catch(Exception e){
            System.out.println("Error deleting patient details.."  + e);
            return false;
        }
    }
}
