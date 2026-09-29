package com.sarvesh.spring_sec_demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="users")
public class User {
    @Id
    private Integer id;
    private String username;
    private String password;
}
