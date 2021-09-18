package me.lenajenichen;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.labymod.serverapi.bukkit.LabyModPlugin;
import org.bukkit.entity.Player;

import java.util.UUID;

public class SubtitleClass {

    public SubtitleClass(Player receiver, UUID subtitlePlayer, String value)
    {
        JsonArray array = new JsonArray();
        JsonObject subtitle = new JsonObject();
        subtitle.addProperty("uuid", subtitlePlayer.toString());
        subtitle.addProperty("size", Double.valueOf(0.8D));
        if (value != null) {
            subtitle.addProperty("value", value);
        }
        array.add(subtitle);
        LabyModPlugin.getInstance().sendServerMessage(receiver, "account_subtitle", array);
    }

}
