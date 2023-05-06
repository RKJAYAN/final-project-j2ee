package com.wisdom.service;

import com.wisdom.model.Bed;
import com.wisdom.repository.BedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class BedService {

    @Autowired
    private BedRepository bedRepository;

    public Bed saveBedInfo(Bed bed) throws Exception{
        return bedRepository.save(bed);
    }

    public List<Bed> getAllBedInfo() throws Exception {
        return bedRepository.findAll();

    }

    public Bed updateBedInfo(Bed bed) throws Exception{
        return bedRepository.save(bed);
    }

    public void deleteBedInfo(Bed bed) throws Exception{
        bedRepository.delete(bed);
    }

}
