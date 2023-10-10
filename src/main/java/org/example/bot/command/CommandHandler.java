package org.example.bot.command;

import org.example.bot.Bot;
import org.example.bot.communicator.ICommunicator;
import org.telegram.telegrambots.meta.api.objects.Message;

public class CommandHandler {

    private final Bot bot;
    private final ICommunicator communicator;

    public CommandHandler(Bot bot, ICommunicator communicator) {
        this.bot = bot;
        this.communicator = communicator;
    }

    public void handle(Command command, Message message) {
        switch (command) {
            case START -> {
                communicator.sendText(
                        bot,
                        message.getFrom().getId(),
                        """
                        Добро пожаловать
                        Команды:
                        /help - памагите
                        /about - хто я
                        """.trim()
                );
            }
            case HELP -> {
                communicator.sendText(
                        bot,
                        message.getFrom().getId(),
                        """
                        А кому щас легко
                        """.trim()
                );
            }
            case ABOUT -> {
                communicator.sendText(
                        bot,
                        message.getFrom().getId(),
                        """
                        я робот
                        """.trim()
                );
            }
            default -> {
                communicator.copyMessage(bot, message);
            }
        }
    }

    public static Command toCommand(String text) {
        return switch (text) {
            case "/start" -> Command.START;
            case "/help" -> Command.HELP;
            case "/about" -> Command.ABOUT;
            default -> Command.UNKNOWN;
        };
    }

}
