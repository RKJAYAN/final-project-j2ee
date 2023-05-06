package com.wisdom.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ward_details")
@Getter
@Setter
@ToString
public class Ward {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name ="ward_id", length = 10)
    private String wardId;

    @Column(name = "ward_name", length = 30)
    private String wardName;

    @Column(name = "last_updated_date")
    private Date lastUpdatedDate;

    @Column(name = "updated_user", length = 15)
    private String updatedUser;

}
