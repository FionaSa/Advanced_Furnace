package fr.gohansword.advancedfurnace;

import org.bukkit.Instrument;
import org.bukkit.Material;
import org.bukkit.Note;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.inventory.ItemStack;

import java.util.Set;

public class Utils {


    public static boolean isValidMaterial(ItemStack stack) {
        return (getSmeltedItemStack(stack) != null);
    }

    public static ItemStack getSmeltedItemStack(ItemStack itemStack) {

        ConfigurationSection sec = AdvancedFurnace.smelt.getsmeltConfig().getConfigurationSection("smeltable");
        Set<String> Keys = sec.getKeys(false);

        for (String key : Keys) {
            ConfigurationSection currentSection = sec.getConfigurationSection(key);
            if(currentSection.getString("from").equalsIgnoreCase(String.valueOf(itemStack.getType())) ){
                return  new ItemStack( Material.valueOf(currentSection.getString("to")), itemStack.getAmount() );
            }
        }
        return null;


    }
}
