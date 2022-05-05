package global.gitems.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Loot {
	
	static List<ItemStack> loot = new ArrayList<>();
	
	public static void addLoot() {
		ItemStack goldsword = new ItemStack(Material.GOLD_SWORD);
		ItemMeta gsm = goldsword.getItemMeta();
		gsm.setDisplayName(AlternateCodes.format("&e&l&nSword"));
		goldsword.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 3);
		goldsword.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 1);
		goldsword.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
		goldsword.setItemMeta(gsm);
		loot.add(goldsword);
		
		ItemStack pickaxe = new ItemStack(Material.DIAMOND_PICKAXE);
		ItemMeta pm = pickaxe.getItemMeta();
		pm.setDisplayName("&b&l&nPickaxe");
		pickaxe.addUnsafeEnchantment(Enchantment.DIG_SPEED, 4);
		pickaxe.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS, 2);
		pickaxe.addUnsafeEnchantment(Enchantment.DURABILITY, 2);
		pickaxe.setItemMeta(pm);
		loot.add(pickaxe);
		
		ItemStack chestplate = new ItemStack(Material.IRON_CHESTPLATE);
		ItemMeta cm = chestplate.getItemMeta();
		cm.setDisplayName("&7&l&nChestplate");
		chestplate.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
		chestplate.addUnsafeEnchantment(Enchantment.THORNS, 1);
		chestplate.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE, 2);
		chestplate.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 2);
		chestplate.addUnsafeEnchantment(Enchantment.DURABILITY, 3);
		chestplate.setItemMeta(cm);
		loot.add(chestplate);
		
		ItemStack diamondblocks = new ItemStack(Material.DIAMOND_BLOCK, 16);
		loot.add(diamondblocks);
		
		ItemStack emeraldblocks = new ItemStack(Material.EMERALD_BLOCK, 8);
		loot.add(emeraldblocks);
		
		ItemStack goldblocks = new ItemStack(Material.GOLD_BLOCK, 12);
		loot.add(goldblocks);
		
		 ArrayList<String> lore = new ArrayList<String>();
			String lt = AlternateCodes.format("&7(Right-Click) on the ground to spawn this boss.");
			ItemStack skeletonegg = new ItemStack(Material.MONSTER_EGG, 1, (short) 51);
			ItemMeta sm = skeletonegg.getItemMeta();
			sm.setDisplayName(AlternateCodes.format("&eSkeleton King"));
			lore.add(lt);
			sm.setLore(lore);
			skeletonegg.setItemMeta(sm);
			loot.add(skeletonegg);
			
			ItemStack zombieegg = new ItemStack(Material.MONSTER_EGG, 1, (short) 54);
			ItemMeta zm = zombieegg.getItemMeta();
			zm.setDisplayName(AlternateCodes.format("&aZombie King"));
			lore.add(lt);
			zm.setLore(lore);
			zombieegg.setItemMeta(zm);
			loot.add(zombieegg);
		
	}
	
	public static void randomloot(Player p) {
		addLoot();
		Random random = new Random();
		int choice = random.nextInt(loot.size());
		ItemStack chosen = loot.get(choice);
		p.getInventory().addItem(chosen);
	}
	
	public static void giverandomLoot(Player p, int amountofitems) {
		for(int x = 0; x < amountofitems; x++) {
			randomloot(p);
		}
	}

}
