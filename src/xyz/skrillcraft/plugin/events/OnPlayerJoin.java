package xyz.skrillcraft.plugin.events;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;
import xyz.skrillcraft.plugin.Main;

public class OnPlayerJoin implements Listener {
    private Plugin plugin = Main.getPlugin(Main.class);

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        Inventory inventory = player.getInventory();

        event.setJoinMessage(ChatColor.GREEN + "+ " + ChatColor.GRAY + player.getDisplayName());

        player.setPlayerListHeader("§c§lSKRILLCRAFT\n§f");
        player.setPlayerListFooter("\n§5discord.gg/skrillex §7• §5reddit.com/r/skrillex");

        if (!player.hasPlayedBefore()) {
            plugin.getServer().broadcastMessage("§fWelcome §5" + player.getDisplayName() + "§f to §c§lSkrillcraft§f.");

            inventory.addItem(new ItemStack(Material.STONE_SWORD));
            inventory.addItem(new ItemStack(Material.STONE_PICKAXE));
            inventory.addItem(new ItemStack(Material.STONE_AXE));
            inventory.addItem(new ItemStack(Material.STONE_SHOVEL));
            inventory.addItem(new ItemStack(Material.BREAD, 16));
        }
    }
}
