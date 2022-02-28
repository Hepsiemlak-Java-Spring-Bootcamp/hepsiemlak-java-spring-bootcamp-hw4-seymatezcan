package com.emlakburada.dto.response;

import com.emlakburada.model.Advert;
import com.emlakburada.model.Message;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Getter
@Setter
public class EnrolleeResponse {

    String enrolleeType;
    String name;
    String email;
    String enrolleePhoto;
    String enrolleeDescription;
    int countBannerOrder;
   /* Set<Advert> favoriteAdverts = new HashSet<Advert>();
    List<Advert> publishedAdverts = new ArrayList<Advert>();
    List<Message> messageBox;*/
}
