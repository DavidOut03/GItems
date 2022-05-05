package global.gitems.Commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import global.gitems.GUI.GUI_Manager;
import global.gitems.Utils.AlternateCodes;
import global.gitems.Utils.Message;

public class Command_GItems implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
		
		if(cmd.getName().equalsIgnoreCase("gitems") || cmd.getName().equalsIgnoreCase("gitem") || cmd.getName().equalsIgnoreCase("items") || cmd.getName().equalsIgnoreCase("item")) {
		if(sender instanceof Player) {
			if(sender.hasPermission("gitems.manage")) {
				
					Player p = (Player) sender;
					
					if(p.getItemInHand().getType() != Material.AIR) {
						GUI_Manager.sendGUI(p);
					} else {
						p.sendMessage(AlternateCodes.format("&cYou have to hold an item in your hand."));
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
