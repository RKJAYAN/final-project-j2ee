package com.wisdom.repository;

import com.wisdom.model.RecordSheet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordSheetRepository extends JpaRepository<RecordSheet, Integer> {

}
