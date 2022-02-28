package com.emlakburada.dto.response;

import com.emlakburada.model.Enrollee;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.sql.Time;
import java.util.Date;

@Data
@Getter
@Setter
public class MessageResponse {

    int messageId;
    Enrollee sendBy;
    Enrollee sendTo;
    String messageTitle;
    String messageContent;
    Date date;
    Time time;
    Boolean isSeen;
    Date seenTime;
    Date seenDate;
}
