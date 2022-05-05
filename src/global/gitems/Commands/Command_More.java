package global.gitems.Commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import global.gitems.Utils.AlternateCodes;
import global.gitems.Utils.Message;

public class Command_More implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String arg2, String[] args) {
		
		if(cmd.getName().equalsIgnoreCase("more")) {
			if(sender instanceof Player) {
				if(sender.hasPermission("gitems.more")) {
					Player p = (Player) sender;
					if(p.getItemInHand() != null) {
						if(p.getItemInHand().getType() != Material.AIR) {
							if(p.getItemInHand().getMaxStackSize() > 1) {
								p.sendMessage(AlternateCodes.format(Message.prefix + "Successfully added a stack to your inventory of the item in your hand."));
								ItemStack item = p.getItemInHand();
								item.setAmount(item.getMaxStackSize());
								p.setItemInHand(item);
								} else {
									p.sendMessage(AlternateCodes.format(Message.prefix + "Successfully added 64 items from the item in your hand."));
									ItemStack item = p.getItemInHand();
									item.setAmount(64);
									p.setItemInHand(item);
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
		}
		return false;
	}

}
