package com.emlakburada.model;

import lombok.Data;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Time;
import java.util.Date;

@Entity
@Data
@Getter
@Setter
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int messageId;
    //Enrollee sendBy;
    //Enrollee sendTo;
    String messageTitle;
    String messageContent;
    Date date;
    Time time;
    Boolean isSeen;
    Date seenTime;
    Date seenDate;


}
