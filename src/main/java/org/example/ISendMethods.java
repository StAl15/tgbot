package org.example;

import org.telegram.telegrambots.meta.api.objects.Message;

public interface ISendMethods {

    void sendText(Long who, String what);

    void copyMessage(Long who, Integer msgId);
}
