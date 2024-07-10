package com.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.catalina.User;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Beneficiary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String accountDetails;

//    @ManyToOne
//    @JoinColumn(name = "user_id")
//    private User user;
}
