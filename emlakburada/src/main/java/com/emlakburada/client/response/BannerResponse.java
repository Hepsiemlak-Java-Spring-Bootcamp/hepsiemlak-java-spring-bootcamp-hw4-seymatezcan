package com.emlakburada.client.response;

import com.emlakburada.client.request.AddressRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BannerResponse {

    private int advertNo;
    private String phone;
    private int total;
    private AddressRequest address;
}
