package com.wisdom.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "patient_details")
@Getter
@Setter
@ToString
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name ="patient_id", length = 10)
    private String patientId;

    @Column(name = "first_name", length = 30)
    private String patientFirstName;

    @Column(name = "last_name", length = 30)
    private String patientLastName;
	
    @Column(name = "contact_number", length = 15)
    private String patientContactNo;

    @Column(name = "postal_code", length = 20)
    private String patientPostalCode;
	
    @Column(name = "address", length = 100)
    private String patientAddress;
	
    @Column(name = "city", length = 20)
    private String patientCity;
	
    @Column(name = "country", length = 20)
    private String patientCountry;
	
    @Column(name = "nic", length = 11)
    private String patientNIC;	

}
