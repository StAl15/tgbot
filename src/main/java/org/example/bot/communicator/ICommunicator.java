package org.example.bot.communicator;

import org.example.bot.Bot;
import org.telegram.telegrambots.meta.api.objects.Message;

public interface ICommunicator {

    void sendText(Bot bot, Long id, String text);

    void copyMessage(Bot bot, Message message);

}
