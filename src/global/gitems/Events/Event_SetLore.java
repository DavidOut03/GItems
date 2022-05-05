package global.gitems.Events;

import java.util.ArrayList;

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

public class Event_SetLore implements Listener {
	
	@EventHandler
	public void onChat(AsyncPlayerChatEvent e) {
		Player p = e.getPlayer();
		
		if(GUI_Manager.setlore.contains(p.getName())) {
			if(p.getItemInHand() != null) {
				if(p.getItemInHand().getType() != Material.AIR) {
			ItemStack item = p.getItemInHand();
			ItemMeta im = item.getItemMeta();
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(AlternateCodes.format(e.getMessage()));
			e.setCancelled(true);
			im.setLore(lore);
			item.setItemMeta(im);
			p.setItemInHand(item);
			GUI_Manager.setlore.remove(p.getName());
			p.sendMessage(AlternateCodes.format(Message.prefix + "You set the lore of the item in your hand to &8'&r" + e.getMessage() + "&8'."));
				} else {
					p.sendMessage(AlternateCodes.format("&cYou have to hold an item in your hand."));
				}
			} else {
				p.sendMessage(AlternateCodes.format("&cYou have to hold an item in your hand."));
			}
		}
	}

}
