package com.wisdom.service;

import com.wisdom.model.RecordSheet;
import com.wisdom.repository.RecordSheetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class RecordSheetService {

    @Autowired
    private RecordSheetRepository recordSheetRepository;

    public RecordSheet saveRecordSheetInfo(RecordSheet recordSheet) throws Exception{
        return recordSheetRepository.save(recordSheet);
    }

    public List<RecordSheet> getAllRecordSheetInfo() throws Exception {
        return recordSheetRepository.findAll();

    }

    public RecordSheet updateRecordSheetInfo(RecordSheet recordSheet) throws Exception{
        return recordSheetRepository.save(recordSheet);
    }

    public void deleteRecordSheetInfo(RecordSheet recordSheet) throws Exception{
        recordSheetRepository.delete(recordSheet);
    }

    /*public Optional<RecordSheet> getRecordSheetInfo(Integer id) throws Exception{
        return recordSheetRepository.findAllById(id);
    }*/

}
