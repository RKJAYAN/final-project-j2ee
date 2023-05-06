package com.wisdom.service;

import com.wisdom.model.PatientOther;
import com.wisdom.repository.PatientOtherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class PatientOtherService {

    @Autowired
    private PatientOtherRepository patientOtherRepository;

    public PatientOther savePatientOtherInfo(PatientOther patientOther) throws Exception{
        return patientOtherRepository.save(patientOther);
    }

    public List<PatientOther> getAllPatientOtherInfo() throws Exception {
        return patientOtherRepository.findAll();

    }

    public PatientOther updatePatientOtherInfo(PatientOther patientOther) throws Exception{
        return patientOtherRepository.save(patientOther);
    }

    public void deletePatientOtherInfo(PatientOther patientOther) throws Exception{
        patientOtherRepository.delete(patientOther);
    }

    /*public Optional<PatientOther> getPatientOtherInfo(Integer id) throws Exception{
        return patientOtherRepository.findAllById(id);
    }*/

}
