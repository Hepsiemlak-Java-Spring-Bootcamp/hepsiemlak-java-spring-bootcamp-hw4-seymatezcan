package com.emlakburada.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@Getter
@Setter
public class Enrollee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ENROLLEE_ID",nullable = false)
    int enrolleeId;
    String enrolleeType;
    String name;
    String email;
    String enrolleePhoto;
    String enrolleeDescription;
    int countBannerOrder;
    /*@OneToMany
    Set<Advert> favoriteAdverts = new HashSet<Advert>();
    @OneToMany(cascade = {CascadeType.ALL})
    @JoinColumn(name="enrolleeId")
    List<Advert> publishedAdverts = new ArrayList<Advert>();
    @OneToMany
    List<Message> messageBox;*/

}
