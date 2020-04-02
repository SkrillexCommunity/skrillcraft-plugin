package xyz.skrillcraft.plugin;

import xyz.skrillcraft.plugin.events.OnPlayerChat;
import xyz.skrillcraft.plugin.events.OnPlayerJoin;
import xyz.skrillcraft.plugin.events.OnPlayerQuit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getConfig().options().copyDefaults(true);
        saveDefaultConfig();

        getServer().getPluginManager().registerEvents(new OnPlayerJoin(), this);
        getServer().getPluginManager().registerEvents(new OnPlayerQuit(), this);
        getServer().getPluginManager().registerEvents(new OnPlayerChat(), this);
    }

    @Override
    public void onDisable() {
        saveConfig();
    }
}
