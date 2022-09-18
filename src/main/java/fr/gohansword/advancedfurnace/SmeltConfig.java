package fr.gohansword.advancedfurnace;

import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;
import java.util.Hashtable;

public class SmeltConfig {

    private FileConfiguration smeltconfig;

    public Hashtable<String,String> map;


    public FileConfiguration getsmeltConfig() {
        return this.smeltconfig;
    }

    void createsmeltConfig() {
        File smeltconfigfile = new File(AdvancedFurnace.getInstance().getDataFolder(), "smelt.yml");
        if (!smeltconfigfile.exists()) {
            smeltconfigfile.getParentFile().mkdirs();
            AdvancedFurnace.getInstance().saveResource("smelt.yml", false);
        }

        smeltconfig= new YamlConfiguration();
        try {
            smeltconfig.load(smeltconfigfile);
        } catch (IOException | InvalidConfigurationException e) {
            e.printStackTrace();
        }


        map=new Hashtable<String,String>();
        int i = 0;
        while (smeltconfig.getString("smeltable."+i+".from") != null)
        {
            map.put(smeltconfig.getString("smeltable."+i+".from") , smeltconfig.getString("smeltable."+i+".to") );
            i++;
        }
    }

}
