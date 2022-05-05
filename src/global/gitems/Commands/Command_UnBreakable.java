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

public class Command_UnBreakable implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String arg2, String[] args) {
		
		if(cmd.getName().equalsIgnoreCase("unbreakable")) {
			if(sender instanceof Player) {
				if(sender.hasPermission("gitems.unbreakable")) {
					Player p = (Player) sender;
					if(p.getItemInHand() != null) {
						if(p.getItemInHand().getType() != Material.AIR) {
							if(args.length == 0) {
								if(p.getItemInHand().getItemMeta().spigot().isUnbreakable()) {
									ItemStack item = p.getItemInHand();
									ItemMeta im = item.getItemMeta();
									im.spigot().setUnbreakable(false);
									item.setItemMeta(im);
									p.setItemInHand(item);
									p.sendMessage(AlternateCodes.format(Message.prefix + "You removed UnBreakable of the item in your hand."));
								} else {
									ItemStack item = p.getItemInHand();
									ItemMeta im = item.getItemMeta();
									im.spigot().setUnbreakable(true);
									item.setItemMeta(im);
									p.setItemInHand(item);
									p.sendMessage(AlternateCodes.format(Message.prefix + "You added UnBreakable to the item in your hand."));
								}
							} else if(args.length == 1) {
								if(args[0].equalsIgnoreCase("add")) {
									ItemStack item = p.getItemInHand();
									ItemMeta im = item.getItemMeta();
									im.spigot().setUnbreakable(true);
									item.setItemMeta(im);
									p.setItemInHand(item);
									p.sendMessage(AlternateCodes.format(Message.prefix + "You removed UnBreakable of the item in your hand."));
								} else if(args[0].equalsIgnoreCase("remove")) {
									ItemStack item = p.getItemInHand();
									ItemMeta im = item.getItemMeta();
									im.spigot().setUnbreakable(false);
									item.setItemMeta(im);
									p.setItemInHand(item);
									p.sendMessage(AlternateCodes.format(Message.prefix + "You removed UnBreakable of the item in your hand."));
								} else {
									p.sendMessage(AlternateCodes.format("&aUse&7: /UnBreakable [add/remove]"));
								}
							} else {
								p.sendMessage(AlternateCodes.format("&aUse&7: /UnBreakable [add/remove]"));
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
