package Commands;

import fr.gohansword.advancedfurnace.AdvancedFurnace;
import fr.gohansword.advancedfurnace.Utils;
import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;


public class Commandsmeltall implements CommandExecutor {
    final AdvancedFurnace plugin = AdvancedFurnace.getInstance();

    public boolean onCommand(CommandSender sender, Command command, String commandLabel, String[] args) {
        Player player = (Player) sender;
        if (player.hasPermission("advancedfurnace.use")) {
            int amount = 0;
            for (ItemStack itemStack : player.getInventory().getContents()) {
                if (itemStack != null && itemStack.getType() != Material.AIR)
                    if (Utils.isValidMaterial(itemStack))
                        amount += itemStack.getAmount();
            }
            if (amount <= 0) {
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', AdvancedFurnace.language.getLanguageConfig().getString("Prefix")) + ChatColor.translateAlternateColorCodes('&', AdvancedFurnace.language.getLanguageConfig().getString("UnsmeltableItem")));
                player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_DESTROY, 0.1F, 1);
                player.sendTitle(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("MainName")), ChatColor.translateAlternateColorCodes('&', AdvancedFurnace.language.getLanguageConfig().getString("UnsmeltableItem")));
                return true;
            }
            int count = 0;
            for (ItemStack itemStack : player.getInventory().getContents()) {
                if (itemStack != null && itemStack.getType() != Material.AIR)
                    if (Utils.isValidMaterial(itemStack)) {
                        ItemStack smelted = Utils.getSmeltedItemStack(itemStack);
                        if (smelted != null) {
                            count++;
                            itemStack.setAmount(smelted.getAmount());
                            itemStack.setItemMeta(smelted.getItemMeta());
                            itemStack.setType(smelted.getType());
                            itemStack.setData(itemStack.getData());
                    }
                    }
            }
            if(count == 0) {
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', AdvancedFurnace.language.getLanguageConfig().getString("Prefix")) + ChatColor.translateAlternateColorCodes('&', AdvancedFurnace.language.getLanguageConfig().getString("UnsmeltableItemAll")));
                player.playNote(player.getLocation(), Instrument.CHIME, Note.natural(1, Note.Tone.A));
                player.sendTitle(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("MainName")), ChatColor.translateAlternateColorCodes('&', AdvancedFurnace.language.getLanguageConfig().getString("UnsmeltableItemAll")));
            }
            else
            {
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', AdvancedFurnace.language.getLanguageConfig().getString("Prefix")) + ChatColor.translateAlternateColorCodes('&', AdvancedFurnace.language.getLanguageConfig().getString("SuccessfulSmeltAll").replace("{N}",String.valueOf(count))));
                player.playNote(player.getLocation(), Instrument.CHIME, Note.natural(1, Note.Tone.A));
                player.sendTitle(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("MainName")), ChatColor.translateAlternateColorCodes('&', AdvancedFurnace.language.getLanguageConfig().getString("SuccessfulSmeltAll").replace("{N}",String.valueOf(count))));

            }

        } else if(!player.hasPermission("advancedfurnace.use")) {
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', AdvancedFurnace.language.getLanguageConfig().getString("Prefix")) + ChatColor.translateAlternateColorCodes('&', AdvancedFurnace.language.getLanguageConfig().getString("NoPermission")));
        player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_DESTROY, 0.1F, 1);
        player.sendTitle(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("MainName")), ChatColor.translateAlternateColorCodes('&', AdvancedFurnace.language.getLanguageConfig().getString("NoPermission")));




    }return true;
}
}