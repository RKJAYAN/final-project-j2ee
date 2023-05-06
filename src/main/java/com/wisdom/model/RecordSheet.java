package com.wisdom.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "record_sheet_details")
@Getter
@Setter
@ToString
public class RecordSheet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name ="patient_id", length = 10)
    private String patientId;

    @Column(name = "record_date")
    private Date recordDate;
	
    @Column(name = "record_details", length = 300)
    private String recordDetails;

    @Column(name = "updated_user", length = 15)
    private String updatedUser;

}
