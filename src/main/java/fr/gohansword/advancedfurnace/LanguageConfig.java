package fr.gohansword.advancedfurnace;

import fr.gohansword.advancedfurnace.AdvancedFurnace;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class LanguageConfig {


    private FileConfiguration languageConfig;


    public FileConfiguration getLanguageConfig() {
        return this.languageConfig;
    }

    void createlanguageConfig() {
        File languageConfigFile = new File(AdvancedFurnace.getInstance().getDataFolder(), "language/" + AdvancedFurnace.getInstance().getConfig().getString("language") + ".yml");
        if (!languageConfigFile.exists()) {
            languageConfigFile.getParentFile().mkdirs();
            AdvancedFurnace.getInstance().saveResource("language/"+AdvancedFurnace.getInstance().getConfig().getString("language")+".yml", false);
        }

        languageConfig= new YamlConfiguration();
        try {
            languageConfig.load(languageConfigFile);
        } catch (IOException | InvalidConfigurationException e) {
            e.printStackTrace();
        }
    }

}