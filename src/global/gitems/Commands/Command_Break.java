package global.gitems.Commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import global.gitems.Utils.AlternateCodes;
import global.gitems.Utils.Message;

public class Command_Break implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String arg2, String[] args) {
		
		if(cmd.getName().equalsIgnoreCase("break")) {
			if(sender instanceof Player) {
				Player p = (Player) sender;
				if(sender.hasPermission("gitems.break")) {
					
					if(p.getItemInHand().getType() != Material.AIR) {
						if(p.getItemInHand().getItemMeta().spigot().isUnbreakable()) {
							p.sendMessage(AlternateCodes.format("&cYou can't break this item."));
						} else {
						short max = p.getItemInHand().getType().getMaxDurability();
						int durrabillity = max;
						p.getItemInHand().setDurability((short) durrabillity);
						p.sendMessage(AlternateCodes.format(Message.prefix + "Successfully broke the item in your hand."));
						}
					} else {
						p.sendMessage(AlternateCodes.format("&cYou have to hold an item in your hand."));
					}
				} else {
					p.sendMessage(AlternateCodes.format("&cYou have to hold an item in your hand."));
				}
				
				} else {
					sender.sendMessage(Message.console);
				}
			} else {
				sender.sendMessage(Message.console);
			}
		
		return false;
	}

	
}
