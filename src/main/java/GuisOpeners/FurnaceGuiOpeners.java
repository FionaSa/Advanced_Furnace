package GuisOpeners;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FurnaceGuiOpeners implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("§cSeulement les joueurs sont autoriser a utiliser cette commande");
            return true;
        }
        sender.sendMessage("§cGG MEK !");
        return true;
    }
}


