package com.fjtechsolutions.bean;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="user_info")
public class UserInfo {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String userName;
    private String userId;
    private String password;
    private int roleDetails;



}
