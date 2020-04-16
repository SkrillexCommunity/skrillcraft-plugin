package xyz.skrillcraft.plugin.commands;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HomeCommand implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            Location home = player.getBedSpawnLocation();

            if (home != null) {
                player.teleport(home);
            } else {
                player.sendMessage("§fYour home bed was missing or obstructed");
            }
        }

        return true;
    }
}
