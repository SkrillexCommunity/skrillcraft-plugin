package xyz.skrillcraft.plugin.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import xyz.skrillcraft.plugin.managers.BedManager;

public class OnBedLeave implements Listener {
    private BedManager bedService;

    public OnBedLeave(BedManager bedManagerInstance) {
        bedService = bedManagerInstance;
    }

    @EventHandler
    public void onBedLeave(PlayerBedLeaveEvent event) {
        bedService.removePlayerFromBed();
    }
}
