package com.wisdom.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "patient_other_details")
@Getter
@Setter
@ToString
public class PatientOther {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name ="patient_id", length = 10)
    private String patientId;
	
    @Column(name ="bed_number", length = 10)
    private String bedId;

    @Column(name ="doctor_id", length = 10)
    private String doctorId;

    @Column(name ="ward_id", length = 10)
    private String wardId;	

    @Column(name = "updated_date", length = 30)
    private Date updatedDate;
	
    @Column(name = "updated_user", length = 30)
    private String updatedUser;

}
