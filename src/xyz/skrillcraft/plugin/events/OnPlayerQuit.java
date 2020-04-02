package xyz.skrillcraft.plugin.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class OnPlayerQuit implements Listener {

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        Player player = event.getPlayer();

        event.setQuitMessage(ChatColor.RED + "- " + ChatColor.GRAY + player.getDisplayName());
    }
}
