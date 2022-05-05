package global.gitems.GUI;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes.Name;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import global.gitems.Utils.AlternateCodes;
import global.gitems.Utils.ItemCreator;
import global.gitems.Utils.Message;

public class GUI_Manager implements Listener {
	
	public static ArrayList<String> rename = new ArrayList<String>();
	public static ArrayList<String> addlore = new ArrayList<String>();
	public static ArrayList<String> setlore = new ArrayList<String>();
	
	public static void sendGUI(Player p) {
		Inventory inv = Bukkit.createInventory(null, 9, AlternateCodes.format("Item Manager"));
		
		ItemCreator.addItem(Material.LEASH, "&aRename", "&7Rename the item in your hand.", 0, 1, inv);
		ItemCreator.addItem(Material.NAME_TAG, "&eAdd Lore", "&7Add a line to the lore of the item in your hand", 0, 1, inv);
		ItemCreator.addItem(Material.NAME_TAG, "&6Set Lore", "&7Set the lore of the item in your hand.", 0, 1, inv);
		ItemCreator.addItem(Material.ANVIL, "&bRepair", "&7Repair the item in your hand.", 0, 1, inv);
		ItemCreator.addItem(Material.ANVIL, "&cBreak", "&7Break the item in your hand to 1 durrabillity.", 2, 1, inv);
		ItemCreator.addItem(Material.SHEARS, "&dMore", "&7Get a items from the item in your hand.", 0, 64, inv);
		ItemCreator.addItem(Material.BOOK, "&9Unbreakable", "&7Set the item in your hand unbreakable", 0, 1, inv);
		ItemCreator.addItem(Material.ENCHANTED_BOOK, "&3Enchant", "&7Enchant the item in your hand.", 0, 1, inv);
		
		p.openInventory(inv);
	}

	@EventHandler
	public void clickevent(InventoryClickEvent e) {
		
		if(e.getWhoClicked() instanceof Player) {
			Player p = (Player) e.getWhoClicked();
			
			if(e.getClickedInventory() != null) {
			if(e.getClickedInventory() != p.getInventory()) {
			if(e.getClickedInventory().getName().equalsIgnoreCase(AlternateCodes.format("Item Manager"))) {
				
				if(p.getItemInHand().getType() != Material.AIR) {
					
					if(e.getCurrentItem().getType() == Material.LEASH) {
						ItemStack Leash = e.getCurrentItem();
						if(Leash.getItemMeta().getDisplayName().equalsIgnoreCase(AlternateCodes.format("&aRename"))) {
						     e.setCancelled(true);
							rename.add(p.getName());
							p.sendMessage(AlternateCodes.format(Message.prefix + "&aType the new name for the item."));
							p.closeInventory();
						} else {
							e.setCancelled(true);
							e.getClickedInventory().remove(Leash);
						}
					} else if(e.getCurrentItem().getType() == Material.NAME_TAG) {
						 ItemStack NameTag = e.getCurrentItem();
						 if(NameTag.getItemMeta().getDisplayName().equalsIgnoreCase(AlternateCodes.format("&eAdd Lore"))) {
						     e.setCancelled(true);
							 addlore.add(p.getName());
							 p.sendMessage(AlternateCodes.format(Message.prefix + "&aType the new lore to add to the item."));
								p.closeInventory();
						 } else if(NameTag.getItemMeta().getDisplayName().equalsIgnoreCase(AlternateCodes.format("&6Set Lore"))) {
						     e.setCancelled(true);
							 setlore.add(p.getName());
							 p.sendMessage(AlternateCodes.format(Message.prefix + "&aType the new lore to add to the item."));
						     p.closeInventory();
						 } else {
							 e.setCancelled(true);
							 e.getClickedInventory().remove(NameTag);
						 }
					} else if(e.getCurrentItem().getType() == Material.ANVIL) {
						ItemStack Anvil = e.getCurrentItem();
						if(Anvil.getItemMeta().getDisplayName().equalsIgnoreCase(AlternateCodes.format("&bRepair"))) {
							e.setCancelled(true);
							p.closeInventory();
							p.getItemInHand().setDurability((short) 100000);
							p.sendMessage(AlternateCodes.format(Message.prefix + "Successfully repaired the item in your hand."));
						} else if(Anvil.getItemMeta().getDisplayName().equalsIgnoreCase(AlternateCodes.format("&cBreak"))) {
							e.setCancelled(true);
							p.closeInventory();
							if(p.getItemInHand().getItemMeta().spigot().isUnbreakable()) {
								p.sendMessage(AlternateCodes.format("&cYou can't break this item."));
							} else {
							short max = p.getItemInHand().getType().getMaxDurability();
							int durrabillity = max;
							p.getItemInHand().setDurability((short) durrabillity);
							p.sendMessage(AlternateCodes.format(Message.prefix + "Successfully broke the item in your hand."));
							}
						} else {
							e.setCancelled(true);
							e.getClickedInventory().remove(Anvil);
						}
					} else if(e.getCurrentItem().getType() == Material.SHEARS) {
						ItemStack Shear = e.getCurrentItem();
						if(Shear.getItemMeta().getDisplayName().equalsIgnoreCase(AlternateCodes.format("&dMore"))) {
							p.closeInventory();
							e.setCancelled(true);
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
							e.setCancelled(true);
							e.getClickedInventory().remove(Shear);
						}
 					} else if(e.getCurrentItem().getType() == Material.BOOK) {
 						ItemStack Book = e.getCurrentItem();
						if(Book.getItemMeta().getDisplayName().equalsIgnoreCase(AlternateCodes.format("&9Unbreakable"))) {
							p.closeInventory();
							e.setCancelled(true);
							GUI_UnBreakabillity.sendGUI(p);
						} else {
							e.setCancelled(true);
							e.getClickedInventory().remove(Book);
						}
					} else if(e.getCurrentItem().getType() == Material.ENCHANTED_BOOK) {
						ItemStack EnchantedBook = e.getCurrentItem();
						if(EnchantedBook.getItemMeta().getDisplayName().equalsIgnoreCase(AlternateCodes.format("&3Enchant"))) {
							e.setCancelled(true);
							p.closeInventory();
							GUI_Enchant.sendGUI(p);
						} else {
							e.setCancelled(true);
							e.getClickedInventory().remove(EnchantedBook);
						}
					}
					
				} else {
					p.closeInventory();
					p.sendMessage(AlternateCodes.format("&cYou have to hold an item in your hand."));
				}
			}
			}
			}
		}
	}

}
