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

public class Command_Rename implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String arg2, String[] args) {
		
		if(cmd.getName().equalsIgnoreCase("rename")) {
			if(sender instanceof Player) {
				if(sender.hasPermission("gitems.rename")) {
					Player p = (Player) sender;
					if(args.length == 0) {
						p.sendMessage(AlternateCodes.format("&aUse&7: /rename [new name]"));
					} else {
						if(p.getItemInHand() != null) {
							if(p.getItemInHand().getType() != Material.AIR) {
								ItemStack item = p.getItemInHand();
								ItemMeta im = item.getItemMeta();
								 String message = "";
					                for(int i = 0; i != args.length; i++) {
					                    message += args[i] + " ";
					                    im.setDisplayName(AlternateCodes.format(message));
					            }
								item.setItemMeta(im);
								p.setItemInHand(item);
							} else {
								p.sendMessage(AlternateCodes.format("&cYou have to hold an item in your hand."));
							}
						} else {
							p.sendMessage(AlternateCodes.format("&cYou have to hold an item in your hand."));
						}
					}
				} else {
					sender.sendMessage(Message.nopermission);
				}
			} else {
				sender.sendMessage(Message.console);
			}
		}
		return false;
	}
	
	

}
