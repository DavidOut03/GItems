package global.gitems.Commands;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import global.gitems.Utils.AlternateCodes;
import global.gitems.Utils.Message;

public class Command_SetLore implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender s, Command cmd, String arg2, String[] args) {
		
		if(cmd.getName().equalsIgnoreCase("setlore")) {
			if(s instanceof Player) {
				if(s.hasPermission("gitems.setlore")) {
					Player p = (Player) s;
					if(args.length == 0) {
						p.sendMessage(AlternateCodes.format("&aUse&7: /setlore [new lore]"));
					} else {
						if(p.getItemInHand() != null) {
							if(p.getItemInHand().getType() != Material.AIR) {
								String message = "";
							   
							     ItemStack item = p.getItemInHand();
									ItemMeta im = item.getItemMeta();
									ArrayList<String> lore = new ArrayList<String>();
									  for(int i = 0; i != args.length; i++) {
						                    message += args[i] + " ";
						            }
										lore.add(AlternateCodes.format(message));
									im.setLore(lore);
									item.setItemMeta(im);
									p.setItemInHand(item);
								p.sendMessage(AlternateCodes.format(Message.prefix + "You set the lore of the item in your hand to &8'&5" + message + "&8'."));	
							} else {
								p.sendMessage(AlternateCodes.format("&cYou have to hold an item in your hand."));
							}
						} else {
							p.sendMessage(AlternateCodes.format("&cYou have to hold an item in your hand."));
						}
					}
				} else {
					s.sendMessage(Message.nopermission);
				}
			} else {
				s.sendMessage(Message.console);
			}
		}
		return false;
	}

}
