package global.gitems.Commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import global.gitems.Utils.AlternateCodes;
import global.gitems.Utils.Message;

public class Command_Repair implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String arg2, String[] args) {
		
		if(cmd.getName().equalsIgnoreCase("repair") || cmd.getName().equalsIgnoreCase("fix")) {
			if(sender instanceof Player) {
				if(sender.hasPermission("gitems.repair") || sender.hasPermission("gitems.fix")) {
					Player p = (Player) sender;
					if(p.getItemInHand() != null) {
						if(p.getItemInHand().getType() != Material.AIR) {
							ItemStack item = p.getItemInHand();
							item.setDurability((short) 100000);
							p.setItemInHand(item);
							p.sendMessage(AlternateCodes.format(Message.prefix + "Successfully repaired the item in your hand."));
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
