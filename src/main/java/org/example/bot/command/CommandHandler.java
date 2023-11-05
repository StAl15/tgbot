package org.example.bot.command;

import org.example.bot.Bot;
import org.example.bot.communicator.ICommunicator;
import org.example.service.music.MusicApi;
import org.example.utils.FormatTracks;
import org.telegram.telegrambots.meta.api.objects.Message;

//some
public class CommandHandler {

    private final Bot bot;
    private final ICommunicator communicator;

    private final MusicApi musicApi = new MusicApi();
    private FormatTracks formatTracks = new FormatTracks();

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
                                /get_singers - список исполнителей
                                /get_popular - список популярных треков
                                """.trim()
                );
            }
            case GET_SINGERS -> {
                String api = formatTracks.format(musicApi.getTopTracks());
                String res = String.format("Список исполнителей: %s", api);
                communicator.sendText(
                        bot,
                        message.getFrom().getId(),
                        res.trim()
                );
            }
            case GET_POPULAR -> {
                communicator.sendText(
                        bot,
                        message.getFrom().getId(),
                        """
                                Загрузка...
                                """.trim()
                );
                String api = formatTracks.format(musicApi.getTopTracks());
                String res = String.format("Список чартов:\n%s", api);
                communicator.sendText(
                        bot,
                        message.getFrom().getId(),
                        res.trim()
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
            case "/get_singers" -> Command.GET_SINGERS;
            case "/get_popular" -> Command.GET_POPULAR;
            default -> Command.UNKNOWN;
        };
    }

}
