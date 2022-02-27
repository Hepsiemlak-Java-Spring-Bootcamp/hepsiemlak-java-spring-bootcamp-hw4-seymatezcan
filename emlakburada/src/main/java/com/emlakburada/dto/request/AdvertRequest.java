package com.emlakburada.dto.request;


import com.emlakburada.model.Enrollee;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class AdvertRequest {

    String usageCase;
    String advertTitle;
    Enrollee enrollee;

}
