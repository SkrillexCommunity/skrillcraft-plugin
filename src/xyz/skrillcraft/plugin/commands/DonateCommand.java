package xyz.skrillcraft.plugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class DonateCommand implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        sender.sendMessage("§fWant to support the server? Message §5Jeth#6666§5 on Discord.");
        return true;
    }
}
