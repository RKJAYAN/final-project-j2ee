package com.wisdom.service;

import com.wisdom.model.Doctor;
import com.wisdom.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    public Doctor saveDoctorInfo(Doctor doctor) throws Exception{
        return doctorRepository.save(doctor);
    }

    public List<Doctor> getAllDoctorInfo() throws Exception {
        return doctorRepository.findAll();

    }

    public Doctor updateDoctorInfo(Doctor doctor) throws Exception{
        return doctorRepository.save(doctor);
    }

    public void deleteDoctorInfo(Doctor doctor) throws Exception{
        doctorRepository.delete(doctor);
    }

    /*public Optional<Doctor> getDoctorInfo(Integer id) throws Exception{
        return doctorRepository.findAllById(id);
    }*/

}
