package com.emlakburada.queue;

import com.emlakburada.model.EmailMessage;

public interface QueueService {

    void sendMessage(EmailMessage email);
}
