package me.lenajenichen;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinQuit implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        for(Player all : Bukkit.getOnlinePlayers()) {
            new SubtitleClass(all, p.getUniqueId(), Filemanager.loadSubstring(p.getUniqueId().toString()));
            new SubtitleClass(p, all.getUniqueId(), Filemanager.loadSubstring(all.getUniqueId().toString()));
        }
    }

}
