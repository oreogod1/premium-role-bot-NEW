import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;

public class Main {
    public static void main(String[] args) {
        String token = System.getenv("BOT_TOKEN");

        if (token == null || token.isEmpty()) {
            System.out.println("ERROR: BOT_TOKEN not set!");
            return;
        }

        JDA jda = JDABuilder.createDefault(token)
                .enableIntents(GatewayIntent.GUILD_MEMBERS, GatewayIntent.MESSAGE_CONTENT)
                .setActivity(Activity.playing("Giving Premium roles"))
                .build();

        System.out.println("Premium Role Bot is online!");
    }
}
