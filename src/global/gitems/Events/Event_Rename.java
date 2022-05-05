package global.gitems.Events;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import global.gitems.GUI.GUI_Manager;
import global.gitems.Utils.AlternateCodes;
import global.gitems.Utils.Message;

public class Event_Rename implements Listener {
	
	@EventHandler
	public void onchat(AsyncPlayerChatEvent e) {
		
		Player p = (Player) e.getPlayer();
		
		if(GUI_Manager.rename.contains(p.getName())) {
			
			if(p.getItemInHand() != null) {
				if(p.getItemInHand().getType() != Material.AIR) {
			
			ItemStack item = p.getItemInHand();
			ItemMeta im = item.getItemMeta();
			im.setDisplayName(AlternateCodes.format(e.getMessage()));
			item.setItemMeta(im);
			p.setItemInHand(item);
			e.setCancelled(true);
			GUI_Manager.rename.remove(p.getName());
			p.sendMessage(AlternateCodes.format(Message.prefix + "You renamed the item in your hand to &8'&r" + e.getMessage() + "&8'."));
				} else {
					p.sendMessage(AlternateCodes.format("&cYou have to hold an item in your hand."));
				}
			} else {
				p.sendMessage(AlternateCodes.format("&cYou have to hold an item in your hand."));
			}
		}
	}

}
