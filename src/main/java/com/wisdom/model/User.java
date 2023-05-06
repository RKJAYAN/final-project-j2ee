package com.wisdom.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user_details")
@Getter
@Setter
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name ="user_name", length = 10)
    private String userName;

    @Column(name = "first_name", length = 30)
    private String userFirstName;

    @Column(name ="last_name", length = 30)
    private String userLastName;

    @Column(name = "user_password", length = 15)
    private String userPassword;

    @Column(name = "user_role", length = 15)
    private String userRole;
}
