package me.lenajenichen;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class SubtitleMain extends JavaPlugin {

    public static String prefix = "§7[§5Subtitles§7] ";

    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage(prefix + "================ " + prefix + "================");
        Bukkit.getConsoleSender().sendMessage(prefix + "This plugin was programmed by Lena_Gmbh");
        Bukkit.getConsoleSender().sendMessage(prefix + "The plugin is now §aactivated!");
        Bukkit.getConsoleSender().sendMessage(prefix + "Thanks for using my plugin! ^^");
        Bukkit.getConsoleSender().sendMessage(prefix + "================ " + prefix + "================");
        Filemanager.createConfig();
        registerCommands();
        registerEvents();
    }

    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(prefix + "================ " + prefix + "================");
        Bukkit.getConsoleSender().sendMessage(prefix + "This plugin was programmed by Lena_Gmbh");
        Bukkit.getConsoleSender().sendMessage(prefix + "The plugin is now §cdeactivated!");
        Bukkit.getConsoleSender().sendMessage(prefix + "Thanks for using my plugin! ^^");
        Bukkit.getConsoleSender().sendMessage(prefix + "================ " + prefix + "================");
        Filemanager.saveConfig();
    }

    public void registerCommands() {
        getCommand("subtitle").setExecutor(new CMD_Subtitle());
    }

    public void registerEvents() {
        PluginManager pm = getServer().getPluginManager();

        pm.registerEvents(new JoinQuit(), this);
    }

}
