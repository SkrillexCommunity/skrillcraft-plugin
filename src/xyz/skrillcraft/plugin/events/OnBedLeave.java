package xyz.skrillcraft.plugin.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import xyz.skrillcraft.plugin.services.BedService;

public class OnBedLeave implements Listener {
    private BedService bedService;

    public OnBedLeave(BedService bedServiceInstance) {
        bedService = bedServiceInstance;
    }

    @EventHandler
    public void onBedLeave(PlayerBedLeaveEvent event) {
        bedService.removePlayerFromBed();
    }
}
