package org.example;

import org.example.config.BotConfig;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.io.Serializable;

public class Bot extends org.telegram.telegrambots.bots.TelegramLongPollingBot {
    private final BotConfig botConfig = new BotConfig();

    @Override
    public String getBotUsername() {
        return botConfig.getBotName();
    }

    @Override
    public String getBotToken() {
        return botConfig.getToken();
    }

    @Override
    public void onUpdateReceived(Update update) {
        var msg = update.getMessage();
        var user = msg.getFrom();
        var id = user.getId();
        SendMethods botMethods = new SendMethods();

        if (msg.isCommand()) {
            botMethods.printCustomMessage(id, msg);
        } else {
            botMethods.copyMessage(id, msg.getMessageId());
        }

    }

    @Override
    public <T extends Serializable, Method extends BotApiMethod<T>> T execute(Method method) throws TelegramApiException {
        return super.execute(method);
    }
}
