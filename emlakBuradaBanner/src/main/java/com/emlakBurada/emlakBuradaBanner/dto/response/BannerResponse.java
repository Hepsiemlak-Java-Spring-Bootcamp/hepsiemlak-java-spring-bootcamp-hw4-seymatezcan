package com.emlakBurada.emlakBuradaBanner.dto.response;

import com.emlakBurada.emlakBuradaBanner.dto.request.AddressRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class BannerResponse {

    private int advertId;
    private String phoneNumber;
    private int total;
    private AddressRequest addressRequest;

}
