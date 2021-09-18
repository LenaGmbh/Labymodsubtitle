package me.lenajenichen;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CMD_Subtitle implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player)sender;

        if(!(sender instanceof Player)) {
            sender.sendMessage(SubtitleMain.prefix + "You can not use this command in the console!");
        }

        if(args.length == 0) {
            p.sendMessage(SubtitleMain.prefix + "§cPlease use /subtitle <subtitle>");
        } else {
            String subtitle = "";
            for (int i = 0; i < args.length; i++) {
                subtitle = subtitle + " " + args[i];
            }
            for(Player all : Bukkit.getOnlinePlayers()) {
                new SubtitleClass(all, p.getUniqueId(), subtitle);
            }
            p.sendMessage(SubtitleMain.prefix + "your Subtitle was set");
            Filemanager.saveSubstring(p.getUniqueId().toString(), subtitle);
            Filemanager.saveConfig();
        }


        return false;
    }
}
