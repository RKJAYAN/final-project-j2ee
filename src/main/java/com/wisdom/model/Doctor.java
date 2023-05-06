package com.wisdom.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "doctor_details")
@Getter
@Setter
@ToString
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name ="doctor_id", length = 10)
    private String doctorId;

    @Column(name = "first_name", length = 30)
    private String doctorFirstName;

    @Column(name = "last_name", length = 30)
    private String doctorLastName;

    @Column(name = "last_updated_date")
    private Date lastUpdatedDate;

    @Column(name = "updated_user", length = 15)
    private String updatedUser;

}
