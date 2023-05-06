package com.wisdom.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "bed_details")
@Getter
@Setter
@ToString
public class Bed{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name ="bed_number", length = 10)
    private String bedId;

    @Column(name ="bed_occupied")
    private boolean bedOccupied;

    @Column(name = "last_updated_date")
    private Date lastUpdatedDate;

    @Column(name = "updated_user", length = 15)
    private String updatedUser;

}
