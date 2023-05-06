package com.wisdom.service;

import com.wisdom.model.Patient;
import com.wisdom.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    public Patient savePatientInfo(Patient patient) throws Exception{
        return patientRepository.save(patient);
    }

    public List<Patient> getAllPatientInfo() throws Exception {
        return patientRepository.findAll();

    }

    public Patient updatePatientInfo(Patient patient) throws Exception{
        return patientRepository.save(patient);
    }

    public void deletePatientInfo(Patient patient) throws Exception{
        patientRepository.delete(patient);
    }

    /*public Optional<Patient> getPatientInfo(Integer id) throws Exception{
        return patientRepository.findAllById(id);
    }*/

}
