package org.example.bot.communicator;

import org.example.bot.Bot;
import org.telegram.telegrambots.meta.api.methods.CopyMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class Communicator implements ICommunicator {

    @Override
    public void sendText(Bot bot, Long chatId, String text) {
        SendMessage sendMessage = SendMessage.builder()
                .chatId(chatId.toString())
                .text(text).build();
        try {
            bot.execute(sendMessage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void copyMessage(Bot bot, Message message) {
        CopyMessage copyMessage = CopyMessage.builder()
                .fromChatId(message.getChatId().toString())
                .chatId(message.getChatId().toString())
                .messageId(message.getMessageId())
                .build();
        try {
            bot.execute(copyMessage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

}
