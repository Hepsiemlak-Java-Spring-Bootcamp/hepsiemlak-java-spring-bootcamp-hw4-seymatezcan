package com.emlakBurada.emlakBuradaBanner.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class BannerRequest {

    private int advertId;
    private String phoneNumber;
    private int total;
    private AddressRequest addressRequest;

}
