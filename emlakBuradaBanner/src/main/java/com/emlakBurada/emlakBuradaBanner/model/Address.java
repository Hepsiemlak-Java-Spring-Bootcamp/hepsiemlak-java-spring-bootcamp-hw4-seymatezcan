package com.emlakBurada.emlakBuradaBanner.model;


import lombok.*;

import javax.persistence.Entity;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Address {

    String province;
    String county;
    String addressDescription;

}
