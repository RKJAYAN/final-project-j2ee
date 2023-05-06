package com.wisdom.controller;

import com.wisdom.model.PatientOther;
import com.wisdom.service.PatientOtherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PatientOtherController {

    @Autowired
    private PatientOtherService patientOtherService;

    @PostMapping("/PatientOther")
    public PatientOther savePatientOtherInfo(@RequestBody PatientOther patientOther){
        try{
            return patientOtherService.savePatientOtherInfo(patientOther);
        }catch(Exception e){
            System.out.println("Error saving patientOther details.."  + e);
            return null;
        }
    }

    @GetMapping("/PatientOther")
    public List<PatientOther> getAllPatientOtherInfo(){
        try{
            return patientOtherService.getAllPatientOtherInfo();
        }catch(Exception e){
            System.out.println("Error getting all patientOther details.."  + e);
            return null;
        }
    }

    @PutMapping("/PatientOther")
    public PatientOther updatePatientOtherInfo(@RequestBody PatientOther patientOther){
        try{
            return patientOtherService.updatePatientOtherInfo(patientOther);
        }catch(Exception e){
            System.out.println("Error updating patientOther details.."  + e);
            return null;
        }
    }

    @DeleteMapping("/PatientOther")
    public boolean deletePatientOtherInfo(@RequestBody PatientOther patientOther){
        try{
            patientOtherService.deletePatientOtherInfo(patientOther);
            return true;
        }catch(Exception e){
            System.out.println("Error deleting patientOther details.."  + e);
            return false;
        }
    }
}
