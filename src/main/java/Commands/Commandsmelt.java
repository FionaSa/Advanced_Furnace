package Commands;

import fr.gohansword.advancedfurnace.AdvancedFurnace;
import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.io.File;
import java.util.Set;

public class Commandsmelt
        implements CommandExecutor {
    final AdvancedFurnace plugin = AdvancedFurnace.getInstance();

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        String noPermission = AdvancedFurnace.language.getLanguageConfig().getString("NoPermission").replace("&","§");
        String MainName = plugin.getConfig().getString("MainName").replace("&","§");
        String unsmeltableItem = AdvancedFurnace.language.getLanguageConfig().getString("UnsmeltableItem").replace("&","§");
        String successfulSmelt = AdvancedFurnace.language.getLanguageConfig().getString("SuccessfulSmelt").replace("&","§");
        String prefix = AdvancedFurnace.language.getLanguageConfig().getString("Prefix").replace("&","§");
        Player player = (Player)sender;
        ItemStack is = player.getInventory().getItemInMainHand();
        Material item = is.getType();
        int amount = is.getAmount();
        Material newItem = null;
        if (player.hasPermission("advancedfurnace.use")) {
            ConfigurationSection sec = AdvancedFurnace.smelt.getsmeltConfig().getConfigurationSection("smeltable");
            Set<String> Keys = sec.getKeys(false);

            for (String key : Keys) {
                ConfigurationSection currentSection = sec.getConfigurationSection(key);
                if(currentSection.getString("from").equalsIgnoreCase(String.valueOf(item)) ){
                    newItem = Material.valueOf(currentSection.getString("to") );
                    ItemStack newStack = new ItemStack(newItem, amount);
                    player.getInventory().setItemInMainHand(newStack);
                    successfulSmelt = successfulSmelt.replace("%OLDITEM%", item.name());
                    successfulSmelt = successfulSmelt.replace("%NEWITEM%", newItem.name());
                    player.sendMessage(prefix + successfulSmelt);
                    player.playNote(player.getLocation(), Instrument.CHIME, Note.natural(1, Note.Tone.A));
                    player.sendTitle(MainName, successfulSmelt);
                    return true;
                }
            }

                player.sendMessage(prefix + unsmeltableItem);
                player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_DESTROY, 0.1F, 1);
                player.sendTitle(MainName, unsmeltableItem);
                return false;




        } else {

            player.sendMessage(prefix + noPermission);
            player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_DESTROY, 0.1F, 1);
            player.sendTitle(MainName, noPermission);
        }



        return true;
    }



}
