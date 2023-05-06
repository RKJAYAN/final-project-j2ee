package com.wisdom.repository;

import com.wisdom.model.PatientOther;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientOtherRepository extends JpaRepository<PatientOther, Integer> {

}
