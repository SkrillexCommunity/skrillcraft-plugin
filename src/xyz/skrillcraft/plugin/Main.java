package xyz.skrillcraft.plugin;

import xyz.skrillcraft.plugin.commands.DonateCommand;
import xyz.skrillcraft.plugin.commands.HelpCommand;
import xyz.skrillcraft.plugin.commands.HomeCommand;
import xyz.skrillcraft.plugin.commands.SpawnCommand;
import xyz.skrillcraft.plugin.events.OnPlayerChat;
import xyz.skrillcraft.plugin.events.OnPlayerJoin;
import xyz.skrillcraft.plugin.events.OnPlayerQuit;
import xyz.skrillcraft.plugin.events.OnBedEnter;
import xyz.skrillcraft.plugin.events.OnBedLeave;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.skrillcraft.plugin.managers.BedManager;

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

        getCommand("spawn").setExecutor(new SpawnCommand());
        getCommand("help").setExecutor(new HelpCommand());
        getCommand("home").setExecutor(new HomeCommand());
        getCommand("donate").setExecutor(new DonateCommand());
    }

    @Override
    public void onDisable() {
        saveConfig();
    }
}
