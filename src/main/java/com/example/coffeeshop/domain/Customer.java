package com.example.coffeeshop.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String money;

    // 0,1이 아닌 MALE,FEMALE로 Displaying 하기 위함.
    @Enumerated(EnumType.STRING)
    private Gender gender;

}
