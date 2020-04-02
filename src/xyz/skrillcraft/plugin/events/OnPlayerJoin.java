package xyz.skrillcraft.plugin.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class OnPlayerJoin implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        event.setJoinMessage(ChatColor.GREEN + "+ " + ChatColor.GRAY + player.getDisplayName());

        player.setPlayerListHeader("§c§lSKRILLCRAFT\n§f");
        player.setPlayerListFooter("\n§5discord.gg/skrillex §7• §5reddit.com/r/skrillex");
    }
}
