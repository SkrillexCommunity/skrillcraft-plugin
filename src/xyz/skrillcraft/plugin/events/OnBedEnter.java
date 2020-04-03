package xyz.skrillcraft.plugin.events;

import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;
import xyz.skrillcraft.plugin.services.BedService;

import java.util.List;

public class OnBedEnter implements Listener {
    private BedService bedManager;

    public OnBedEnter(BedService bedManagerInstance) {
        bedManager = bedManagerInstance;
    }

    @EventHandler
    public void onBedEnter(PlayerBedEnterEvent event) {
        Player player = event.getPlayer();
        World world = player.getWorld();

        if (world.getTime() > 12000 && world.getTime() < 24000) {
            List<Player> playersInWorld = world.getPlayers();
            double playersRequired = playersInWorld.size() * 0.5;

            bedManager.addPlayerToBed();

            if (bedManager.getPlayersInBed() >= playersRequired) {
                world.setTime(1000);
            } else {
                String playerDifference = String.valueOf(Math.round(playersRequired - bedManager.getPlayersInBed()));

                for (Player playerInWorld : playersInWorld) {
                    playerInWorld.sendMessage("§c§lSKRILLCRAFT §7" + playerDifference + " more players required to sleep.");
                }
            }
        }
    }
}
