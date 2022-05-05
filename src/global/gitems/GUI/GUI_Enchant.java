package global.gitems.GUI;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import global.gitems.Utils.AlternateCodes;
import global.gitems.Utils.ItemCreator;

public class GUI_Enchant implements Listener {
	
	public static HashMap<Player, Enchantment> enchant = new HashMap<Player, Enchantment>();
	public static HashMap<Player, Integer> level = new HashMap<Player, Integer>(); 
	
	public static void sendGUI(Player p) {
		Inventory inv = Bukkit.createInventory(null, 27, "Enchants");
		ItemCreator.addItem(Material.ENCHANTED_BOOK, "&ePower", "", 0, 1, inv);
		ItemCreator.addItem(Material.ENCHANTED_BOOK, "&eFlame", "", 0, 1, inv);
		ItemCreator.addItem(Material.ENCHANTED_BOOK, "&eInfinity", "", 0, 1, inv);
		ItemCreator.addItem(Material.ENCHANTED_BOOK, "&ePunch", "", 0, 1, inv);
		ItemCreator.addItem(Material.ENCHANTED_BOOK, "&eSharpness", "", 0, 1, inv);
		ItemCreator.addItem(Material.ENCHANTED_BOOK, "&eBane of Arthropods", "", 0, 1, inv);
		ItemCreator.addItem(Material.ENCHANTED_BOOK, "&eSmite", "", 0, 1, inv);
		ItemCreator.addItem(Material.ENCHANTED_BOOK, "&eEfficiency", "", 0, 1, inv);
		ItemCreator.addItem(Material.ENCHANTED_BOOK, "&eUnBreaking", "", 0, 1, inv);
		ItemCreator.addItem(Material.ENCHANTED_BOOK, "&eFire Aspect", "", 0, 1, inv);
		ItemCreator.addItem(Material.ENCHANTED_BOOK, "&eKnockback", "", 0, 1, inv);
		ItemCreator.addItem(Material.ENCHANTED_BOOK, "&eFortune", "", 0, 1, inv);
		ItemCreator.addItem(Material.ENCHANTED_BOOK, "&eLooting", "", 0, 1, inv);
		ItemCreator.addItem(Material.ENCHANTED_BOOK, "&eLuck", "", 0, 1, inv);
		ItemCreator.addItem(Material.ENCHANTED_BOOK, "&eLure", "", 0, 1, inv);
		ItemCreator.addItem(Material.ENCHANTED_BOOK, "&eResperation", "", 0, 1, inv);
		ItemCreator.addItem(Material.ENCHANTED_BOOK, "&eProtection", "", 0, 1, inv);
		ItemCreator.addItem(Material.ENCHANTED_BOOK, "&eBlast Protection", "", 0, 1, inv);
		ItemCreator.addItem(Material.ENCHANTED_BOOK, "&eFeather Falling", "", 0, 1, inv);
		ItemCreator.addItem(Material.ENCHANTED_BOOK, "&eFire Protection", "", 0, 1, inv);
		ItemCreator.addItem(Material.ENCHANTED_BOOK, "&eProjectile Protection", "", 0, 1, inv);
		ItemCreator.addItem(Material.ENCHANTED_BOOK, "&eSilk Touch", "", 0, 1, inv);
		ItemCreator.addItem(Material.ENCHANTED_BOOK, "&eThorns", "", 0, 1, inv);
		ItemCreator.addItem(Material.ENCHANTED_BOOK, "&eAqua Infinity", "", 0, 1, inv);
		
		p.openInventory(inv);
	}
	
	public static void sendPowerGUI(Player p) {
		Inventory inv = Bukkit.createInventory(null, 54, "Select Level");
		
		ItemCreator.setItem(Material.WOOL, "&cRemove Level", "&7Click on this item to remove 1 level.", 14, 1, inv, 19);
		ItemCreator.setItem(Material.BOOK, "&eLevel I", "&7Click on this item to enchant it to level I.", 0, 1, inv, 22);
		ItemCreator.setItem(Material.WOOL, "&aAdd Level", "&7Click on this item to add 1 level.", 5, 1, inv, 25);
		ItemCreator.setItem(Material.ENCHANTED_BOOK, "&6Enchant", "&7Click this item to enchant the item in your hand.", 0, 1, inv, 40);
		
		p.openInventory(inv);
	}
	public static void sendFlameGUI(Player p) {
		Inventory inv = Bukkit.createInventory(null, 54, "Select Level");
		
		ItemCreator.setItem(Material.WOOL, "&cRemove Level", "&7Click on this item to remove 1 level.", 14, 1, inv, 19);
		ItemCreator.setItem(Material.BOOK, "&eLevel I", "&7Click on this item to enchant it to level I.", 0, 1, inv, 22);
		ItemCreator.setItem(Material.WOOL, "&aAdd Level", "&7Click on this item to add 1 level.", 5, 1, inv, 25);
		ItemCreator.setItem(Material.ENCHANTED_BOOK, "&6Enchant", "&7Click this item to enchant the item in your hand.", 0, 1, inv, 40);
		
		p.openInventory(inv);
	}
	public static void sendInfinityGUI(Player p) {
		Inventory inv = Bukkit.createInventory(null, 54, "Select Level");
		
		ItemCreator.setItem(Material.WOOL, "&cRemove Level", "&7Click on this item to remove 1 level.", 14, 1, inv, 19);
		ItemCreator.setItem(Material.BOOK, "&eLevel I", "&7Click on this item to enchant it to level I.", 0, 1, inv, 22);
		ItemCreator.setItem(Material.WOOL, "&aAdd Level", "&7Click on this item to add 1 level.", 5, 1, inv, 25);
		ItemCreator.setItem(Material.ENCHANTED_BOOK, "&6Enchant", "&7Click this item to enchant the item in your hand.", 0, 1, inv, 40);
		
		p.openInventory(inv);
	}
	public static void sendPunchGUI(Player p) {
		Inventory inv = Bukkit.createInventory(null, 54, "Select Level");
		
		ItemCreator.setItem(Material.WOOL, "&cRemove Level", "&7Click on this item to remove 1 level.", 14, 1, inv, 19);
		ItemCreator.setItem(Material.BOOK, "&eLevel I", "&7Click on this item to enchant it to level I.", 0, 1, inv, 22);
		ItemCreator.setItem(Material.WOOL, "&aAdd Level", "&7Click on this item to add 1 level.", 5, 1, inv, 25);
		ItemCreator.setItem(Material.ENCHANTED_BOOK, "&6Enchant", "&7Click this item to enchant the item in your hand.", 0, 1, inv, 40);
		
		p.openInventory(inv);
	}
	public static void sendSharpnessGUI(Player p) {
		Inventory inv = Bukkit.createInventory(null, 54, "Select Level");
		
		ItemCreator.setItem(Material.WOOL, "&cRemove Level", "&7Click on this item to remove 1 level.", 14, 1, inv, 19);
		ItemCreator.setItem(Material.BOOK, "&eLevel I", "&7Click on this item to enchant it to level I.", 0, 1, inv, 22);
		ItemCreator.setItem(Material.WOOL, "&aAdd Level", "&7Click on this item to add 1 level.", 5, 1, inv, 25);
		ItemCreator.setItem(Material.ENCHANTED_BOOK, "&6Enchant", "&7Click this item to enchant the item in your hand.", 0, 1, inv, 40);
		
		p.openInventory(inv);
	}
	public static void sendBaneOfArthropodsGUI(Player p) {
		Inventory inv = Bukkit.createInventory(null, 54, "Select Level");
		
		ItemCreator.setItem(Material.WOOL, "&cRemove Level", "&7Click on this item to remove 1 level.", 14, 1, inv, 19);
		ItemCreator.setItem(Material.BOOK, "&eLevel I", "&7Click on this item to enchant it to level I.", 0, 1, inv, 22);
		ItemCreator.setItem(Material.WOOL, "&aAdd Level", "&7Click on this item to add 1 level.", 5, 1, inv, 25);
		ItemCreator.setItem(Material.ENCHANTED_BOOK, "&6Enchant", "&7Click this item to enchant the item in your hand.", 0, 1, inv, 40);
		
		p.openInventory(inv);
	}
	public static void sendSmiteGUI(Player p) {
		Inventory inv = Bukkit.createInventory(null, 54, "Select Level");
		
		ItemCreator.setItem(Material.WOOL, "&cRemove Level", "&7Click on this item to remove 1 level.", 14, 1, inv, 19);
		ItemCreator.setItem(Material.BOOK, "&eLevel I", "&7Click on this item to enchant it to level I.", 0, 1, inv, 22);
		ItemCreator.setItem(Material.WOOL, "&aAdd Level", "&7Click on this item to add 1 level.", 5, 1, inv, 25);
		ItemCreator.setItem(Material.ENCHANTED_BOOK, "&6Enchant", "&7Click this item to enchant the item in your hand.", 0, 1, inv, 40);
		
		p.openInventory(inv);
	}
	public static void sendEfficiencyGUI(Player p) {
		Inventory inv = Bukkit.createInventory(null, 54, "Select Level");
		
		ItemCreator.setItem(Material.WOOL, "&cRemove Level", "&7Click on this item to remove 1 level.", 14, 1, inv, 19);
		ItemCreator.setItem(Material.BOOK, "&eLevel I", "&7Click on this item to enchant it to level I.", 0, 1, inv, 22);
		ItemCreator.setItem(Material.WOOL, "&aAdd Level", "&7Click on this item to add 1 level.", 5, 1, inv, 25);
		ItemCreator.setItem(Material.ENCHANTED_BOOK, "&6Enchant", "&7Click this item to enchant the item in your hand.", 0, 1, inv, 40);
		
		p.openInventory(inv);
	}
	public static void sendUnBreakGUI(Player p) {
		Inventory inv = Bukkit.createInventory(null, 54, "Select Level");
		
		ItemCreator.setItem(Material.WOOL, "&cRemove Level", "&7Click on this item to remove 1 level.", 14, 1, inv, 19);
		ItemCreator.setItem(Material.BOOK, "&eLevel I", "&7Click on this item to enchant it to level I.", 0, 1, inv, 22);
		ItemCreator.setItem(Material.WOOL, "&aAdd Level", "&7Click on this item to add 1 level.", 5, 1, inv, 25);
		ItemCreator.setItem(Material.ENCHANTED_BOOK, "&6Enchant", "&7Click this item to enchant the item in your hand.", 0, 1, inv, 40);
		
		p.openInventory(inv);
	}
	public static void sendFireAspectGUI(Player p) {
		Inventory inv = Bukkit.createInventory(null, 54, "Select Level");
		
		ItemCreator.setItem(Material.WOOL, "&cRemove Level", "&7Click on this item to remove 1 level.", 14, 1, inv, 19);
		ItemCreator.setItem(Material.BOOK, "&eLevel I", "&7Click on this item to enchant it to level I.", 0, 1, inv, 22);
		ItemCreator.setItem(Material.WOOL, "&aAdd Level", "&7Click on this item to add 1 level.", 5, 1, inv, 25);
		ItemCreator.setItem(Material.ENCHANTED_BOOK, "&6Enchant", "&7Click this item to enchant the item in your hand.", 0, 1, inv, 40);
		
		p.openInventory(inv);
	}
	public static void sendKnockbackGUI(Player p) {
		Inventory inv = Bukkit.createInventory(null, 54, "Select Level");
		
		ItemCreator.setItem(Material.WOOL, "&cRemove Level", "&7Click on this item to remove 1 level.", 14, 1, inv, 19);
		ItemCreator.setItem(Material.BOOK, "&eLevel I", "&7Click on this item to enchant it to level I.", 0, 1, inv, 22);
		ItemCreator.setItem(Material.WOOL, "&aAdd Level", "&7Click on this item to add 1 level.", 5, 1, inv, 25);
		ItemCreator.setItem(Material.ENCHANTED_BOOK, "&6Enchant", "&7Click this item to enchant the item in your hand.", 0, 1, inv, 40);
		
		p.openInventory(inv);
	}
	public static void sendFortuneGUI(Player p) {
		Inventory inv = Bukkit.createInventory(null, 54, "Select Level");
		
		ItemCreator.setItem(Material.WOOL, "&cRemove Level", "&7Click on this item to remove 1 level.", 14, 1, inv, 19);
		ItemCreator.setItem(Material.BOOK, "&eLevel I", "&7Click on this item to enchant it to level I.", 0, 1, inv, 22);
		ItemCreator.setItem(Material.WOOL, "&aAdd Level", "&7Click on this item to add 1 level.", 5, 1, inv, 25);
		ItemCreator.setItem(Material.ENCHANTED_BOOK, "&6Enchant", "&7Click this item to enchant the item in your hand.", 0, 1, inv, 40);
		
		p.openInventory(inv);
	}
	public static void sendLootingGUI(Player p) {
		Inventory inv = Bukkit.createInventory(null, 54, "Select Level");
		
		ItemCreator.setItem(Material.WOOL, "&cRemove Level", "&7Click on this item to remove 1 level.", 14, 1, inv, 19);
		ItemCreator.setItem(Material.BOOK, "&eLevel I", "&7Click on this item to enchant it to level I.", 0, 1, inv, 22);
		ItemCreator.setItem(Material.WOOL, "&aAdd Level", "&7Click on this item to add 1 level.", 5, 1, inv, 25);
		ItemCreator.setItem(Material.ENCHANTED_BOOK, "&6Enchant", "&7Click this item to enchant the item in your hand.", 0, 1, inv, 40);
		
		p.openInventory(inv);
	}
	public static void sendLuckGUI(Player p) {
		Inventory inv = Bukkit.createInventory(null, 54, "Select Level");
		
		ItemCreator.setItem(Material.WOOL, "&cRemove Level", "&7Click on this item to remove 1 level.", 14, 1, inv, 19);
		ItemCreator.setItem(Material.BOOK, "&eLevel I", "&7Click on this item to enchant it to level I.", 0, 1, inv, 22);
		ItemCreator.setItem(Material.WOOL, "&aAdd Level", "&7Click on this item to add 1 level.", 5, 1, inv, 25);
		ItemCreator.setItem(Material.ENCHANTED_BOOK, "&6Enchant", "&7Click this item to enchant the item in your hand.", 0, 1, inv, 40);
		
		p.openInventory(inv);
	}
	public static void sendLureGUI(Player p) {
		Inventory inv = Bukkit.createInventory(null, 54, "Select Level");
		
		ItemCreator.setItem(Material.WOOL, "&cRemove Level", "&7Click on this item to remove 1 level.", 14, 1, inv, 19);
		ItemCreator.setItem(Material.BOOK, "&eLevel I", "&7Click on this item to enchant it to level I.", 0, 1, inv, 22);
		ItemCreator.setItem(Material.WOOL, "&aAdd Level", "&7Click on this item to add 1 level.", 5, 1, inv, 25);
		ItemCreator.setItem(Material.ENCHANTED_BOOK, "&6Enchant", "&7Click this item to enchant the item in your hand.", 0, 1, inv, 40);
		
		p.openInventory(inv);
	}
	public static void sendResperationGUI(Player p) {
		Inventory inv = Bukkit.createInventory(null, 54, "Select Level");
		
		ItemCreator.setItem(Material.WOOL, "&cRemove Level", "&7Click on this item to remove 1 level.", 14, 1, inv, 19);
		ItemCreator.setItem(Material.BOOK, "&eLevel I", "&7Click on this item to enchant it to level I.", 0, 1, inv, 22);
		ItemCreator.setItem(Material.WOOL, "&aAdd Level", "&7Click on this item to add 1 level.", 5, 1, inv, 25);
		ItemCreator.setItem(Material.ENCHANTED_BOOK, "&6Enchant", "&7Click this item to enchant the item in your hand.", 0, 1, inv, 40);
		
		p.openInventory(inv);
	}
	public static void sendProtectionGUI(Player p) {
		Inventory inv = Bukkit.createInventory(null, 54, "Select Level");
		
		ItemCreator.setItem(Material.WOOL, "&cRemove Level", "&7Click on this item to remove 1 level.", 14, 1, inv, 19);
		ItemCreator.setItem(Material.BOOK, "&eLevel I", "&7Click on this item to enchant it to level I.", 0, 1, inv, 22);
		ItemCreator.setItem(Material.WOOL, "&aAdd Level", "&7Click on this item to add 1 level.", 5, 1, inv, 25);
		ItemCreator.setItem(Material.ENCHANTED_BOOK, "&6Enchant", "&7Click this item to enchant the item in your hand.", 0, 1, inv, 40);
		
		p.openInventory(inv);
	}
	public static void sendBlastProtectionGUI(Player p) {
		Inventory inv = Bukkit.createInventory(null, 54, "Select Level");
		
		ItemCreator.setItem(Material.WOOL, "&cRemove Level", "&7Click on this item to remove 1 level.", 14, 1, inv, 19);
		ItemCreator.setItem(Material.BOOK, "&eLevel I", "&7Click on this item to enchant it to level I.", 0, 1, inv, 22);
		ItemCreator.setItem(Material.WOOL, "&aAdd Level", "&7Click on this item to add 1 level.", 5, 1, inv, 25);
		ItemCreator.setItem(Material.ENCHANTED_BOOK, "&6Enchant", "&7Click this item to enchant the item in your hand.", 0, 1, inv, 40);
		
		p.openInventory(inv);
	}
	public static void sendFeatherFallingGUI(Player p) {
		Inventory inv = Bukkit.createInventory(null, 54, "Select Level");
		
		ItemCreator.setItem(Material.WOOL, "&cRemove Level", "&7Click on this item to remove 1 level.", 14, 1, inv, 19);
		ItemCreator.setItem(Material.BOOK, "&eLevel I", "&7Click on this item to enchant it to level I.", 0, 1, inv, 22);
		ItemCreator.setItem(Material.WOOL, "&aAdd Level", "&7Click on this item to add 1 level.", 5, 1, inv, 25);
		ItemCreator.setItem(Material.ENCHANTED_BOOK, "&6Enchant", "&7Click this item to enchant the item in your hand.", 0, 1, inv, 40);
		
		p.openInventory(inv);
	}
	public static void sendFireProtectionGUI(Player p) {
		Inventory inv = Bukkit.createInventory(null, 54, "Select Level");
		
		ItemCreator.setItem(Material.WOOL, "&cRemove Level", "&7Click on this item to remove 1 level.", 14, 1, inv, 19);
		ItemCreator.setItem(Material.BOOK, "&eLevel I", "&7Click on this item to enchant it to level I.", 0, 1, inv, 22);
		ItemCreator.setItem(Material.WOOL, "&aAdd Level", "&7Click on this item to add 1 level.", 5, 1, inv, 25);
		ItemCreator.setItem(Material.ENCHANTED_BOOK, "&6Enchant", "&7Click this item to enchant the item in your hand.", 0, 1, inv, 40);
		
		p.openInventory(inv);
	}
	public static void sendProjectileProtectionGUI(Player p) {
		Inventory inv = Bukkit.createInventory(null, 54, "Select Level");
		
		ItemCreator.setItem(Material.WOOL, "&cRemove Level", "&7Click on this item to remove 1 level.", 14, 1, inv, 19);
		ItemCreator.setItem(Material.BOOK, "&eLevel I", "&7Click on this item to enchant it to level I.", 0, 1, inv, 22);
		ItemCreator.setItem(Material.WOOL, "&aAdd Level", "&7Click on this item to add 1 level.", 5, 1, inv, 25);
		ItemCreator.setItem(Material.ENCHANTED_BOOK, "&6Enchant", "&7Click this item to enchant the item in your hand.", 0, 1, inv, 40);
		
		p.openInventory(inv);
	}
	public static void sendSilkTouchGUI(Player p) {
		Inventory inv = Bukkit.createInventory(null, 54, "Select Level");
		
		ItemCreator.setItem(Material.WOOL, "&cRemove Level", "&7Click on this item to remove 1 level.", 14, 1, inv, 19);
		ItemCreator.setItem(Material.BOOK, "&eLevel I", "&7Click on this item to enchant it to level I.", 0, 1, inv, 22);
		ItemCreator.setItem(Material.WOOL, "&aAdd Level", "&7Click on this item to add 1 level.", 5, 1, inv, 25);
		ItemCreator.setItem(Material.ENCHANTED_BOOK, "&6Enchant", "&7Click this item to enchant the item in your hand.", 0, 1, inv, 40);
		
		p.openInventory(inv);
	}
	public static void sendThornsGUI(Player p) {
		Inventory inv = Bukkit.createInventory(null, 54, "Select Level");
		
		ItemCreator.setItem(Material.WOOL, "&cRemove Level", "&7Click on this item to remove 1 level.", 14, 1, inv, 19);
		ItemCreator.setItem(Material.BOOK, "&eLevel I", "&7Click on this item to enchant it to level I.", 0, 1, inv, 22);
		ItemCreator.setItem(Material.WOOL, "&aAdd Level", "&7Click on this item to add 1 level.", 5, 1, inv, 25);
		ItemCreator.setItem(Material.ENCHANTED_BOOK, "&6Enchant", "&7Click this item to enchant the item in your hand.", 0, 1, inv, 40);
		
		p.openInventory(inv);
	}
	public static void sendAquaInfinityGUI(Player p) {
		Inventory inv = Bukkit.createInventory(null, 54, "Select Level");
		
		ItemCreator.setItem(Material.WOOL, "&cRemove Level", "&7Click on this item to remove 1 level.", 14, 1, inv, 19);
		ItemCreator.setItem(Material.BOOK, "&eLevel I", "&7Click on this item to enchant it to level I.", 0, 1, inv, 22);
		ItemCreator.setItem(Material.WOOL, "&aAdd Level", "&7Click on this item to add 1 level.", 5, 1, inv, 25);
		ItemCreator.setItem(Material.ENCHANTED_BOOK, "&6Enchant", "&7Click this item to enchant the item in your hand.", 0, 1, inv, 40);
		
		p.openInventory(inv);
	}
	
	@EventHandler
	public void onclick(InventoryClickEvent e) {
		
		if(e.getWhoClicked() instanceof Player) {
			if(e.getClickedInventory() != null) {
				if(e.getClickedInventory().getName().equalsIgnoreCase("Select Level")) {
					if(e.getCurrentItem().getType() != Material.AIR) {
						if(e.getCurrentItem() != null) {
							Player p = (Player) e.getWhoClicked();
					if(e.getCurrentItem().getType() == Material.WOOL) {
						if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(AlternateCodes.format("&cRemove Level"))) {
							if(e.getInventory().getItem(22).getAmount() > 1) {
								if(level.get(p) == 11) {
									ItemStack item = e.getInventory().getItem(22);
									ItemMeta im = item.getItemMeta();
									im.setDisplayName(AlternateCodes.format("&eLevel X"));
									item.setItemMeta(im);
									item.setAmount(e.getInventory().getItem(22).getAmount() - 1);
									e.getInventory().setItem(22, item);
									e.setCancelled(true);
									level.put(p, level.get(p) -1);
								} else if(level.get(p) == 10) {
									ItemStack item = e.getInventory().getItem(22);
									ItemMeta im = item.getItemMeta();
									im.setDisplayName(AlternateCodes.format("&eLevel IX"));
									item.setItemMeta(im);
									item.setAmount(e.getInventory().getItem(22).getAmount() - 1);
									e.getInventory().setItem(22, item);
									e.setCancelled(true);
									level.put(p, level.get(p) -1);
								} else if(level.get(p) == 9) {
									ItemStack item = e.getInventory().getItem(22);
									ItemMeta im = item.getItemMeta();
									im.setDisplayName(AlternateCodes.format("&eLevel VIII"));
									item.setItemMeta(im);
									item.setAmount(e.getInventory().getItem(22).getAmount() - 1);
									e.getInventory().setItem(22, item);
									e.setCancelled(true);
									level.put(p, level.get(p) -1);
								} else if(level.get(p) == 8) {
									ItemStack item = e.getInventory().getItem(22);
									ItemMeta im = item.getItemMeta();
									im.setDisplayName(AlternateCodes.format("&eLevel VII"));
									item.setItemMeta(im);
									item.setAmount(e.getInventory().getItem(22).getAmount() - 1);
									e.getInventory().setItem(22, item);
									e.setCancelled(true);
									level.put(p, level.get(p) -1);
								} else if(level.get(p) == 7) {
									ItemStack item = e.getInventory().getItem(22);
									ItemMeta im = item.getItemMeta();
									im.setDisplayName(AlternateCodes.format("&eLevel VI"));
									item.setItemMeta(im);
									item.setAmount(e.getInventory().getItem(22).getAmount() - 1);
									e.getInventory().setItem(22, item);
									e.setCancelled(true);
									level.put(p, level.get(p) -1);
								} else if(level.get(p) == 6) {
									ItemStack item = e.getInventory().getItem(22);
									ItemMeta im = item.getItemMeta();
									im.setDisplayName(AlternateCodes.format("&eLevel V"));
									item.setItemMeta(im);
									item.setAmount(e.getInventory().getItem(22).getAmount() - 1);
									e.getInventory().setItem(22, item);
									e.setCancelled(true);
									level.put(p, level.get(p) -1);
								} else if(level.get(p) == 5) {
									ItemStack item = e.getInventory().getItem(22);
									ItemMeta im = item.getItemMeta();
									im.setDisplayName(AlternateCodes.format("&eLevel IV"));
									item.setItemMeta(im);
									item.setAmount(e.getInventory().getItem(22).getAmount() - 1);
									e.getInventory().setItem(22, item);
									e.setCancelled(true);
									level.put(p, level.get(p) -1);
								} else if(level.get(p) == 4) {
									ItemStack item = e.getInventory().getItem(22);
									ItemMeta im = item.getItemMeta();
									im.setDisplayName(AlternateCodes.format("&eLevel III"));
									item.setItemMeta(im);
									item.setAmount(e.getInventory().getItem(22).getAmount() - 1);
									e.getInventory().setItem(22, item);
									e.setCancelled(true);
									level.put(p, level.get(p) -1);
								} else if(level.get(p) == 3) {
									ItemStack item = e.getInventory().getItem(22);
									ItemMeta im = item.getItemMeta();
									im.setDisplayName(AlternateCodes.format("&eLevel II"));
									item.setItemMeta(im);
									item.setAmount(e.getInventory().getItem(22).getAmount() - 1);
									e.getInventory().setItem(22, item);
									e.setCancelled(true);
									level.put(p, level.get(p) -1);
								} else if(level.get(p) == 2) {
									ItemStack item = e.getInventory().getItem(22);
									ItemMeta im = item.getItemMeta();
									im.setDisplayName(AlternateCodes.format("&eLevel I"));
									item.setItemMeta(im);
									item.setAmount(e.getInventory().getItem(22).getAmount() - 1);
									e.getInventory().setItem(22, item);
									e.setCancelled(true);
									level.put(p, level.get(p) -1);
								} else {
									if(level.get(p) >= 65) {
										ItemStack item = e.getInventory().getItem(22);
										ItemMeta im = item.getItemMeta();
										int il = level.get(p) -1;
										im.setDisplayName(AlternateCodes.format("&eLevel " + il));
										item.setItemMeta(im);
										e.getInventory().setItem(22, item);
										e.setCancelled(true);
										level.put(p, level.get(p) -1);
									} else {
										ItemStack item = e.getInventory().getItem(22);
										ItemMeta im = item.getItemMeta();
										int il = level.get(p) -1;
										item.setAmount(e.getInventory().getItem(22).getAmount() - 1);
										im.setDisplayName(AlternateCodes.format("&eLevel " + il));
										item.setItemMeta(im);
										e.getInventory().setItem(22, item);
										e.setCancelled(true);
										level.put(p, level.get(p) -1);
									}
									
								}
								
							} else {
								e.setCancelled(true);
							}
						} else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(AlternateCodes.format("&aAdd Level"))) {
							if(level.get(p) == 10) {
								ItemStack item = e.getInventory().getItem(22);
								ItemMeta im = item.getItemMeta();
								im.setDisplayName(AlternateCodes.format("&eLevel 11"));
								item.setItemMeta(im);
								item.setAmount(e.getInventory().getItem(22).getAmount() + 1);
								e.getInventory().setItem(22, item);
								e.setCancelled(true);
								level.put(p, level.get(p) +1);
							} else if(level.get(p) == 9) {
								ItemStack item = e.getInventory().getItem(22);
								ItemMeta im = item.getItemMeta();
								im.setDisplayName(AlternateCodes.format("&eLevel X"));
								item.setItemMeta(im);
								item.setAmount(e.getInventory().getItem(22).getAmount() + 1);
								e.getInventory().setItem(22, item);
								e.setCancelled(true);
								level.put(p, level.get(p) +1);
							} else if(level.get(p) == 8) {
								ItemStack item = e.getInventory().getItem(22);
								ItemMeta im = item.getItemMeta();
								im.setDisplayName(AlternateCodes.format("&eLevel IX"));
								item.setItemMeta(im);
								item.setAmount(e.getInventory().getItem(22).getAmount() + 1);
								e.getInventory().setItem(22, item);
								e.setCancelled(true);
								level.put(p, level.get(p) +1);
							} else if(level.get(p) == 7) {
								ItemStack item = e.getInventory().getItem(22);
								ItemMeta im = item.getItemMeta();
								im.setDisplayName(AlternateCodes.format("&eLevel VIII"));
								item.setItemMeta(im);
								item.setAmount(e.getInventory().getItem(22).getAmount() + 1);
								e.getInventory().setItem(22, item);
								e.setCancelled(true);
								level.put(p, level.get(p) +1);
							} else if(level.get(p) == 6) {
								ItemStack item = e.getInventory().getItem(22);
								ItemMeta im = item.getItemMeta();
								im.setDisplayName(AlternateCodes.format("&eLevel VII"));
								item.setItemMeta(im);
								item.setAmount(e.getInventory().getItem(22).getAmount() + 1);
								e.getInventory().setItem(22, item);
								e.setCancelled(true);
								level.put(p, level.get(p) +1);
							} else if(level.get(p) == 5) {
								ItemStack item = e.getInventory().getItem(22);
								ItemMeta im = item.getItemMeta();
								im.setDisplayName(AlternateCodes.format("&eLevel VI"));
								item.setItemMeta(im);
								item.setAmount(e.getInventory().getItem(22).getAmount() + 1);
								e.getInventory().setItem(22, item);
								e.setCancelled(true);
								level.put(p, level.get(p) +1);
							} else if(level.get(p) == 4) {
								ItemStack item = e.getInventory().getItem(22);
								ItemMeta im = item.getItemMeta();
								im.setDisplayName(AlternateCodes.format("&eLevel V"));
								item.setItemMeta(im);
								item.setAmount(e.getInventory().getItem(22).getAmount() + 1);
								e.getInventory().setItem(22, item);
								e.setCancelled(true);
								level.put(p, level.get(p) +1);
							} else if(level.get(p) == 3) {
								ItemStack item = e.getInventory().getItem(22);
								ItemMeta im = item.getItemMeta();
								im.setDisplayName(AlternateCodes.format("&eLevel IV"));
								item.setItemMeta(im);
								item.setAmount(e.getInventory().getItem(22).getAmount() + 1);
								e.getInventory().setItem(22, item);
								e.setCancelled(true);
								level.put(p, level.get(p) +1);
							} else if(level.get(p) == 2) {
								ItemStack item = e.getInventory().getItem(22);
								ItemMeta im = item.getItemMeta();
								im.setDisplayName(AlternateCodes.format("&eLevel III"));
								item.setItemMeta(im);
								item.setAmount(e.getInventory().getItem(22).getAmount() + 1);
								e.getInventory().setItem(22, item);
								e.setCancelled(true);
								level.put(p, level.get(p) +1);
							} else if(level.get(p) == 1) {
								ItemStack item = e.getInventory().getItem(22);
								ItemMeta im = item.getItemMeta();
								im.setDisplayName(AlternateCodes.format("&eLevel II"));
								item.setItemMeta(im);
								item.setAmount(e.getInventory().getItem(22).getAmount() + 1);
								e.getInventory().setItem(22, item);
								e.setCancelled(true);
								level.put(p, level.get(p) +1);
							} else {
								ItemStack item = e.getInventory().getItem(22);
								ItemMeta im = item.getItemMeta();
								int il = level.get(p) +1;
								im.setDisplayName(AlternateCodes.format("&eLevel " + il));
								item.setItemMeta(im);
								item.setAmount(e.getInventory().getItem(22).getAmount() + 1);
								e.getInventory().setItem(22, item);
								e.setCancelled(true);
								level.put(p, level.get(p) +1);
							}
						} else {
							e.getWhoClicked().closeInventory();
						}
					} else if(e.getCurrentItem().getType() == Material.BOOK) {
						e.setCancelled(true);
					} else if(e.getCurrentItem().getType() == Material.ENCHANTED_BOOK) {
						e.setCancelled(true);
						e.getWhoClicked().closeInventory();
						ItemStack item = p.getItemInHand();
						item.addUnsafeEnchantment(enchant.get(p), level.get(p));
						level.remove(p);
						enchant.remove(p);
					} 
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
	
	@EventHandler
	public void onClick(InventoryClickEvent e) {
		if(e.getWhoClicked() instanceof Player) {
			Player p = (Player) e.getWhoClicked();
			
			if(e.getClickedInventory() != null) {
				if(e.getClickedInventory().getName().equalsIgnoreCase("Enchants")) {
					if(e.getCurrentItem() != null) {
					if(e.getCurrentItem().getType() == Material.ENCHANTED_BOOK) {
						if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(AlternateCodes.format("&ePower"))) {
							e.setCancelled(true);
							p.closeInventory();
							enchant.put(p, Enchantment.ARROW_DAMAGE);
							sendPowerGUI(p);
							level.put(p, 1);
						} else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(AlternateCodes.format("&eFlame"))) {
							e.setCancelled(true);
							p.closeInventory();
							enchant.put(p, Enchantment.ARROW_FIRE);
							sendFlameGUI(p);
							level.put(p, 1);
						} else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(AlternateCodes.format("&eInfinity"))) {
							e.setCancelled(true);
							p.closeInventory();
							enchant.put(p, Enchantment.ARROW_INFINITE);
							sendInfinityGUI(p);
							level.put(p, 1);
						} else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(AlternateCodes.format("&ePunch"))) {
							e.setCancelled(true);
							p.closeInventory();
							enchant.put(p, Enchantment.ARROW_KNOCKBACK);
							sendKnockbackGUI(p);
							level.put(p, 1);
						} else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(AlternateCodes.format("&eSharpness"))) {
							e.setCancelled(true);
							p.closeInventory();
							enchant.put(p, Enchantment.DAMAGE_ALL);
							sendSharpnessGUI(p);
							level.put(p, 1);
						} else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(AlternateCodes.format("&eBane of Arthropods"))) {
							e.setCancelled(true);
							p.closeInventory();
							enchant.put(p, Enchantment.DAMAGE_ARTHROPODS);
							sendBaneOfArthropodsGUI(p);
							level.put(p, 1);
						} else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(AlternateCodes.format("&eSmite"))) {
							e.setCancelled(true);
							p.closeInventory();
							enchant.put(p, Enchantment.DAMAGE_UNDEAD);
							sendSmiteGUI(p);
							level.put(p, 1);
						} else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(AlternateCodes.format("&eEfficiency"))) {
							e.setCancelled(true);
							p.closeInventory();
							enchant.put(p, Enchantment.DIG_SPEED);
							sendEfficiencyGUI(p);
							level.put(p, 1);
						} else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(AlternateCodes.format("&eUnBreaking"))) {
							e.setCancelled(true);
							p.closeInventory();
							enchant.put(p, Enchantment.DURABILITY);
							sendUnBreakGUI(p);
							level.put(p, 1);
						} else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(AlternateCodes.format("&eFire Aspect"))) {
							e.setCancelled(true);
							p.closeInventory();
							enchant.put(p, Enchantment.FIRE_ASPECT);
							sendFireAspectGUI(p);
							level.put(p, 1);
						} else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(AlternateCodes.format("&eKnockback"))) {
							e.setCancelled(true);
							p.closeInventory();
							enchant.put(p, Enchantment.KNOCKBACK);
							sendKnockbackGUI(p);
							level.put(p, 1);
						} else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(AlternateCodes.format("&eFortune"))) {
							e.setCancelled(true);
							p.closeInventory();
							enchant.put(p, Enchantment.LOOT_BONUS_BLOCKS);
							sendFortuneGUI(p);
							level.put(p, 1);
						} else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(AlternateCodes.format("&eLooting"))) {
							e.setCancelled(true);
							p.closeInventory();
							enchant.put(p, Enchantment.LOOT_BONUS_MOBS);
							sendLootingGUI(p);
							level.put(p, 1);
						} else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(AlternateCodes.format("&eLuck"))) {
							e.setCancelled(true);
							p.closeInventory();
							enchant.put(p, Enchantment.LUCK);
							sendLuckGUI(p);
							level.put(p, 1);
						} else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(AlternateCodes.format("&eLure"))) {
							e.setCancelled(true);
							p.closeInventory();
							enchant.put(p, Enchantment.LURE);
							sendLureGUI(p);
							level.put(p, 1);
						} else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(AlternateCodes.format("&eResperation"))) {
							e.setCancelled(true);
							p.closeInventory();
							enchant.put(p, Enchantment.OXYGEN);
							sendResperationGUI(p);
							level.put(p, 1);
						} else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(AlternateCodes.format("&eProtection"))) {
							e.setCancelled(true);
							p.closeInventory();
							enchant.put(p, Enchantment.PROTECTION_ENVIRONMENTAL);
							sendProjectileProtectionGUI(p);
							level.put(p, 1);
						} else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(AlternateCodes.format("&eBlast Protection"))) {
							e.setCancelled(true);
							p.closeInventory();
							enchant.put(p, Enchantment.PROTECTION_EXPLOSIONS);
							sendBlastProtectionGUI(p);
							level.put(p, 1);
						} else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(AlternateCodes.format("&eFeather Falling"))) {
							e.setCancelled(true);
							p.closeInventory();
							enchant.put(p, Enchantment.PROTECTION_FALL);
							sendFeatherFallingGUI(p);
							level.put(p, 1);
						} else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(AlternateCodes.format("&eFire Protection"))) {
							e.setCancelled(true);
							p.closeInventory();
							enchant.put(p, Enchantment.PROTECTION_FIRE);
							sendFireProtectionGUI(p);
							level.put(p, 1);
						} else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(AlternateCodes.format("&eProjectile Protection"))) {
							e.setCancelled(true);
							p.closeInventory();
							enchant.put(p, Enchantment.PROTECTION_PROJECTILE);
							sendProjectileProtectionGUI(p);
							level.put(p, 1);
						} else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(AlternateCodes.format("&eSilk Touch"))) {
							e.setCancelled(true);
							p.closeInventory();
							enchant.put(p, Enchantment.SILK_TOUCH);
							sendSilkTouchGUI(p);
							level.put(p, 1);
						} else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(AlternateCodes.format("&eThorns"))) {
							e.setCancelled(true);
							p.closeInventory();
							enchant.put(p, Enchantment.THORNS);
							sendThornsGUI(p);
							level.put(p, 1);
						} else if(e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(AlternateCodes.format("&eAqua Infinity"))) {
							e.setCancelled(true);
							p.closeInventory();
							enchant.put(p, Enchantment.WATER_WORKER);
							sendAquaInfinityGUI(p);
							level.put(p, 1);
						}
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
