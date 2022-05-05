package global.gitems.Events;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import global.gitems.GUI.GUI_Manager;
import global.gitems.Utils.AlternateCodes;
import global.gitems.Utils.Message;

import org.bukkit.event.Listener;

public class Event_AddLore implements Listener {
	
	@EventHandler
	public void onchat(AsyncPlayerChatEvent e) { 
		
		Player p = e.getPlayer();
		
		if(GUI_Manager.addlore.contains(p.getName())) {
			if(p.getItemInHand() != null) {
				if(p.getItemInHand().getType() != Material.AIR) {
					ItemStack item = p.getItemInHand();
					ItemMeta im = item.getItemMeta();
					List<String> lore = new ArrayList<String>();
					if(lore != null) {
						lore = im.getLore();
						lore.add(AlternateCodes.format(e.getMessage()));
						e.setCancelled(true);
					} else {
						lore.add(AlternateCodes.format(e.getMessage()));
						e.setCancelled(true);
					}
					im.setLore(lore);
					item.setItemMeta(im);
					p.setItemInHand(item);
					GUI_Manager.addlore.remove(p.getName());
					p.sendMessage(AlternateCodes.format(Message.prefix + "You added the lore &8'&r" + e.getMessage() + "&8' to the item in your hand."));
				} else {
					p.sendMessage(AlternateCodes.format("&cYou have to hold an item in your hand."));
				}
			} else {
				p.sendMessage(AlternateCodes.format("&cYou have to hold an item in your hand."));
			}
			
		}
	}

}
