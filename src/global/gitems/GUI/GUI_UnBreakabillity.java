package global.gitems.GUI;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import global.gitems.Utils.AlternateCodes;
import global.gitems.Utils.ItemCreator;
import global.gitems.Utils.Message;

public class GUI_UnBreakabillity implements Listener {
	
	public static void sendGUI(Player p) {
		Inventory inv = Bukkit.createInventory(null, 54, "Select UnBreakabillity");
		
		
		ItemCreator.setItem(Material.WOOL, "&cRemove UnBreakabillity", "&7Click on this item to remove the UnBreakabillity.", 14, 1, inv, 19);
		inv.setItem(22, p.getItemInHand());
		ItemCreator.setItem(Material.WOOL, "&aAdd UnBreakabillity", "&7Click on this item to add the UnBreakabillity.", 5, 1, inv, 25);
		ItemCreator.setItem(Material.ENCHANTED_BOOK, "&6Confirm", "&7Click this item to confirm.", 0, 1, inv, 40);
		p.openInventory(inv);
	}
	
	@EventHandler
	public void onclick(InventoryClickEvent e) {
		
		if(e.getWhoClicked() instanceof Player) {
			if(e.getClickedInventory() != null) {
				if(e.getClickedInventory().getName().equalsIgnoreCase("Select UnBreakabillity")) {
					if(e.getCurrentItem() != null) {
						Player p = (Player) e.getWhoClicked();
						if(e.getCurrentItem().getType() == Material.WOOL) {
							if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(AlternateCodes.format("&cRemove UnBreakabillity"))) {
								ItemStack item = p.getItemInHand();
								ItemMeta im = item.getItemMeta();
								im.spigot().setUnbreakable(false);
								item.setItemMeta(im);
								e.setCancelled(true);
								e.getClickedInventory().setItem(22, item);
							} else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(AlternateCodes.format("&aAdd UnBreakabillity"))) {
								ItemStack item = p.getItemInHand();
								ItemMeta im = item.getItemMeta();
								im.spigot().setUnbreakable(true);
								item.setItemMeta(im);
								e.getClickedInventory().setItem(22, item);
								e.setCancelled(true);
							} else {
								e.setCancelled(true);
							}
						} else if(e.getCurrentItem().getType() == Material.ENCHANTED_BOOK) {
							p.setItemInHand(e.getClickedInventory().getItem(22));
							e.setCancelled(true);
							p.closeInventory();
							p.sendMessage(AlternateCodes.format(Message.prefix + "You edit the UnBreakabillity of the item in your hand."));
						} else {
							e.setCancelled(true);
						}
					} else {
						e.setCancelled(true);
					}
				}
			}
		}
	}

}
