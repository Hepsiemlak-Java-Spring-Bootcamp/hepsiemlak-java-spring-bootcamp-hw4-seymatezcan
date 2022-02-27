package com.example.demo.email;

import com.example.demo.dto.EmailMessage;
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
public class Email {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int emailId;
    String email;
    Date date;

    public void setEmail(EmailMessage message) {
    }
}
