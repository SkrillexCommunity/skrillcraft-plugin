package xyz.skrillcraft.plugin;

import xyz.skrillcraft.plugin.events.OnPlayerChat;
import xyz.skrillcraft.plugin.events.OnPlayerJoin;
import xyz.skrillcraft.plugin.events.OnPlayerQuit;
import xyz.skrillcraft.plugin.events.OnBedEnter;
import xyz.skrillcraft.plugin.events.OnBedLeave;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getConfig().options().copyDefaults(true);
        saveDefaultConfig();

        BedManager bedManager = new BedManager();

        getServer().getPluginManager().registerEvents(new OnPlayerJoin(), this);
        getServer().getPluginManager().registerEvents(new OnPlayerQuit(), this);
        getServer().getPluginManager().registerEvents(new OnPlayerChat(), this);
        getServer().getPluginManager().registerEvents(new OnBedEnter(bedManager), this);
        getServer().getPluginManager().registerEvents(new OnBedLeave(bedManager), this);
    }

    @Override
    public void onDisable() {
        saveConfig();
    }
}
