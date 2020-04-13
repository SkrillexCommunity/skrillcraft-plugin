package xyz.skrillcraft.plugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class HelpCommand implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        String[] helpMesssages = {
                "§c§lSKRILLCRAFT HELP",
                "§fTo create a town use §5/town create <name>",
                "§fTo claim land use §5/town claim",
                "§fTo teleport to spawn use §5/spawn"
        };

        sender.sendMessage(helpMesssages);

        return true;
    }
}
