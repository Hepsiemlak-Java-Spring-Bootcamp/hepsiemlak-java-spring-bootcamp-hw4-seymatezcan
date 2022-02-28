package com.emlakBurada.emlakBuradaBanner.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class AddressRequest {

    private String province;
    private String county;
    private String addressDescription;

}
