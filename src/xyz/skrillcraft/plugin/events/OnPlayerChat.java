package xyz.skrillcraft.plugin.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class OnPlayerChat implements Listener {

    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent event) {
        Player player = event.getPlayer();
        String prefix = "§7";

        if (player.isOp()) {
            prefix = "§c";
        }

        event.setFormat(prefix + player.getDisplayName()  + "§f: " + event.getMessage());
    }
}
