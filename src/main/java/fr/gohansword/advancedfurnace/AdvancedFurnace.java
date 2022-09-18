package fr.gohansword.advancedfurnace;

import Commands.Commandsmelt;
import Commands.Commandsmeltall;
import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class AdvancedFurnace extends JavaPlugin {
   public static final LanguageConfig language = new LanguageConfig();

   public static final SmeltConfig smelt = new SmeltConfig();
    private static AdvancedFurnace instance;

    public static AdvancedFurnace getInstance(){
        return instance; }


        //Main start
    @Override
    public void onEnable() {
        instance = this;
        this.saveDefaultConfig();
        language.createlanguageConfig();
        smelt.createsmeltConfig();
        String newLine = System.getProperty("line.separator");
        Bukkit.getConsoleSender().sendMessage("   §a________" + newLine + "                   §a| | -- | |" + newLine + "                   §a| |-AF-| |" + newLine + "                   §a| |-->-| |     §8§l[§b§lAdvanced§f§lFurnace§8§l] §8>> §aLoaded successfully ! V 1.1.3 :)" + newLine + "                   §a| |-AF-| |" + newLine + "                   §a| | -- | |" + newLine + "                 §a§m--------------§r");
        int pluginId = 9314;
        getCommand("smelt").setExecutor(new Commandsmelt());
        getCommand("smeltall").setExecutor(new Commandsmeltall());

    }
        //Main stop
    @Override
    public void onDisable() {
        String newLine = System.getProperty("line.separator");
        Bukkit.getConsoleSender().sendMessage("   §c________" + newLine + "                   §c| | -- | |" + newLine + "                   §c| |-AF-| |" + newLine + "                   §c| |-->-| |     §8§l[§b§lAdvanced§f§lFurnace§8§l] §8>> §cUnloaded successfully ! V 1.1.3 :)" + newLine + "                   §c| |-AF-| |" + newLine + "                   §c| | -- | |" + newLine + "                 §c§m--------------§r");

    }
        //Main cmd
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        String newLine = System.getProperty("line.separator");
        String blankline = "&c";
        Player player = (Player)sender;

        if (label.equalsIgnoreCase("advancedfurnace")) {
            if (args.length == 0) {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&',
                        language.getLanguageConfig().getString("Prefix") + language.getLanguageConfig().getString("Usage")));
                player.playNote(player.getLocation(), Instrument.CHIME, Note.natural(1, Note.Tone.A));
                player.sendTitle(ChatColor.translateAlternateColorCodes('&',
                        this.getConfig().getString("MainName")), ChatColor.translateAlternateColorCodes('&',
                        language.getLanguageConfig().getString("Usage")));
            }
            if (args.length > 0) {
                if (args[0].equalsIgnoreCase("reload")) {
                    if (!sender.hasPermission("advancedfurnace.admin")) {
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&',
                                language.getLanguageConfig().getString("Prefix") + language.getLanguageConfig().getString("NoPermission")));
                        player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_DESTROY, 0.1F, 1);
                        player.sendTitle(ChatColor.translateAlternateColorCodes('&',
                                this.getConfig().getString("MainName")), ChatColor.translateAlternateColorCodes('&',
                                language.getLanguageConfig().getString("NoPermission")));
                        return true;
                    }else
                        this.saveDefaultConfig();
                        this.reloadConfig();
                        smelt.createsmeltConfig();
                        language.createlanguageConfig();
                    player.playNote(player.getLocation(), Instrument.CHIME, Note.natural(1, Note.Tone.A));
                    player.sendTitle(ChatColor.translateAlternateColorCodes('&',
                            this.getConfig().getString("MainName")), ChatColor.translateAlternateColorCodes('&',
                            language.getLanguageConfig().getString("Reload")));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&',
                            language.getLanguageConfig().getString("Prefix") + language.getLanguageConfig().getString("Reload")));
                    Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&',
                            language.getLanguageConfig().getString("Prefix") + language.getLanguageConfig().getString("Reload")));
                } else if (args[0].equalsIgnoreCase("help")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&',
                            language.getLanguageConfig().getString("Help") + newLine + blankline + newLine + language.getLanguageConfig().getString("CommandHelp") + newLine + language.getLanguageConfig().getString("CommandReload") + newLine + language.getLanguageConfig().getString("CommandSmelt") + newLine + blankline + newLine + language.getLanguageConfig().getString("HelpEnd")));
                }
            }
        } else if (label.equalsIgnoreCase("af")) {
            if (args.length == 0) {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&',
                        language.getLanguageConfig().getString("Prefix") + language.getLanguageConfig().getString("Usage")));
                player.playNote(player.getLocation(), Instrument.CHIME, Note.natural(1, Note.Tone.A));
                player.sendTitle(ChatColor.translateAlternateColorCodes('&',
                        this.getConfig().getString("MainName")), ChatColor.translateAlternateColorCodes('&',
                        language.getLanguageConfig().getString("Usage")));
            }
            else if (args.length > 0) {
                if (args[0].equalsIgnoreCase("reload")) {
                    if (!sender.hasPermission("advancedfurnace.admin")) {
                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&',
                                language.getLanguageConfig().getString("Prefix") + language.getLanguageConfig().getString("NoPermission")));
                        player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_DESTROY, 0.1F, 1);
                        player.sendTitle(ChatColor.translateAlternateColorCodes('&',
                                this.getConfig().getString("MainName")), ChatColor.translateAlternateColorCodes('&',
                                language.getLanguageConfig().getString("NoPermission")));
                        return true;
                    }else
                         this.saveDefaultConfig();
                         this.reloadConfig();
                         language.createlanguageConfig();
                    player.playNote(player.getLocation(), Instrument.CHIME, Note.natural(1, Note.Tone.A));
                    player.sendTitle(ChatColor.translateAlternateColorCodes('&',
                            this.getConfig().getString("MainName")), ChatColor.translateAlternateColorCodes('&',
                            language.getLanguageConfig().getString("Reload")));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&',
                            language.getLanguageConfig().getString("Prefix") + language.getLanguageConfig().getString("Reload")));
                    Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&',
                            language.getLanguageConfig().getString("Prefix") + language.getLanguageConfig().getString("Reload")));
                }else if (args[0].equalsIgnoreCase("help")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&',
                            language.getLanguageConfig().getString("Help" ) + newLine + blankline + newLine + language.getLanguageConfig().getString("CommandHelp") + newLine + language.getLanguageConfig().getString("CommandReload") + newLine + language.getLanguageConfig().getString("CommandSmelt") + newLine + blankline + newLine + language.getLanguageConfig().getString("HelpEnd")));
                }
            }
        } return false;
    }
}
