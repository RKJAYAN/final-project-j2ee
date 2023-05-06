package com.wisdom.controller;

import com.wisdom.model.RecordSheet;
import com.wisdom.service.RecordSheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RecordSheetController {

    @Autowired
    private RecordSheetService recordSheetService;

    @PostMapping("/RecordSheet")
    public RecordSheet saveRecordSheetInfo(@RequestBody RecordSheet recordSheet){
        try{
            return recordSheetService.saveRecordSheetInfo(recordSheet);
        }catch(Exception e){
            System.out.println("Error saving recordSheet details.."  + e);
            return null;
        }
    }

    @GetMapping("/RecordSheet")
    public List<RecordSheet> getAllRecordSheetInfo(){
        try{
            return recordSheetService.getAllRecordSheetInfo();
        }catch(Exception e){
            System.out.println("Error getting all recordSheet details.."  + e);
            return null;
        }
    }

    @PutMapping("/RecordSheet")
    public RecordSheet updateRecordSheetInfo(@RequestBody RecordSheet recordSheet){
        try{
            return recordSheetService.updateRecordSheetInfo(recordSheet);
        }catch(Exception e){
            System.out.println("Error updating recordSheet details.."  + e);
            return null;
        }
    }

    @DeleteMapping("/RecordSheet")
    public boolean deleteRecordSheetInfo(@RequestBody RecordSheet recordSheet){
        try{
            recordSheetService.deleteRecordSheetInfo(recordSheet);
            return true;
        }catch(Exception e){
            System.out.println("Error deleting recordSheet details.."  + e);
            return false;
        }
    }
}
