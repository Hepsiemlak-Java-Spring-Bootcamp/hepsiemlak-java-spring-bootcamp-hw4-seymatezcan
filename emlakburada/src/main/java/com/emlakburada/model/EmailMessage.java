package com.emlakburada.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Time;
import java.util.Date;

@Entity
@Getter
@Setter
@Data
public class EmailMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int emailId;
    Date date;
    Time time;

}
