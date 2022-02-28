package com.emlakBurada.emlakBuradaBanner.model;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Banner {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int AdvertId;
    private String phoneNumber;
    private int total;
    //private Address address;
}
