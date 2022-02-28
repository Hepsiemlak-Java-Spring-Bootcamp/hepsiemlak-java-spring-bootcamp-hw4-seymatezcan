package com.emlakburada.dto.request;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class EnrolleeRequest {

    String name;
    String email;
    String enrolleeDescription;

}
