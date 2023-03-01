//package com.tuyendt.springbootloginwithjwt.Entity;
//
//
//import lombok.Data;
//import lombok.NonNull;
//
//import javax.persistence.*;
//import javax.validation.constraints.NotNull;
//
//@Entity
//@Table(name = "user")
//@Data
//public class User {
//    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employee_generator")
//    @SequenceGenerator(name = "employee_generator", sequenceName = "user_seq", allocationSize = 1)
//    @NotNull
//    private Long id;
//
//    @Column(nullable = false, unique = true)
//    private String username;
//    private String password;
//
//}
