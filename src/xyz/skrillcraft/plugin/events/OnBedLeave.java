package xyz.skrillcraft.plugin.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import xyz.skrillcraft.plugin.BedManager;

public class OnBedLeave implements Listener {
    private BedManager bedManager;

    public OnBedLeave(BedManager bedManagerInstance) {
        bedManager = bedManagerInstance;
    }

    @EventHandler
    public void onBedLeave(PlayerBedLeaveEvent event) {
        bedManager.removePlayerFromBed();
    }
}
