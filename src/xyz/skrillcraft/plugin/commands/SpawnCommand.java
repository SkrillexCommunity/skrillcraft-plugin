package xyz.skrillcraft.plugin.commands;

import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SpawnCommand implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            World world = player.getWorld();

            player.teleport(world.getSpawnLocation());

            return true;
        } else {
            sender.sendMessage("Only players can run this command.");

            return false;
        }
    }
}
