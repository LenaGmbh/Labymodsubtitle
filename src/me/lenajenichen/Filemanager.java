package me.lenajenichen;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class Filemanager {

    private String root;
    public static File file;
    public static FileConfiguration cfg;

    public static void createConfig() {
        file = new File("plugins/LabyModSubtitle", "subtitles.yml");
        cfg = YamlConfiguration.loadConfiguration(file);
    }

    public static void saveConfig() {
        try {
            cfg.save(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void saveSubstring(String uuid, String substring) {
        FileConfiguration config = cfg;
        config.set(uuid + ".Substring", substring);
        saveConfig();
    }

    public static String loadSubstring(String uuid) {
        FileConfiguration config = cfg;
        String substring = config.getString(uuid + ".Substring");

        return substring;
    }

}
