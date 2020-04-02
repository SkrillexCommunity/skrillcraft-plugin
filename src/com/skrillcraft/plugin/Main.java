package com.skrillcraft.plugin;

import com.skrillcraft.plugin.events.OnPlayerJoin;
import com.skrillcraft.plugin.events.OnPlayerQuit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getConfig().options().copyDefaults(true);
        saveDefaultConfig();

        getServer().getPluginManager().registerEvents(new OnPlayerJoin(), this);
        getServer().getPluginManager().registerEvents(new OnPlayerQuit(), this);
    }

    @Override
    public void onDisable() {
        saveConfig();
    }
}
