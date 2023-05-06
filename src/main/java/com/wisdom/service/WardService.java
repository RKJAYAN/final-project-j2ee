package com.wisdom.service;

import com.wisdom.model.Ward;
import com.wisdom.repository.WardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class WardService {

    @Autowired
    private WardRepository wardRepository;

    public Ward saveWardInfo(Ward ward) throws Exception{
        return wardRepository.save(ward);
    }

    public List<Ward> getAllWardInfo() throws Exception {
        return wardRepository.findAll();

    }

    public Ward updateWardInfo(Ward ward) throws Exception{
        return wardRepository.save(ward);
    }

    public void deleteWardInfo(Ward ward) throws Exception{
        wardRepository.delete(ward);
    }

    public Optional<Ward> getWardInfo(Ward ward) throws Exception{
        return wardRepository.findById(ward.getId());
    }

}
