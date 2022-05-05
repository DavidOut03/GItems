package global.gitems.Core;

import org.bukkit.Bukkit;

import global.gitems.Commands.Command_UnBreakable;
import global.gitems.Commands.Command_More;
import global.gitems.Commands.Command_Break;
import global.gitems.Commands.Command_Repair;
import global.gitems.Commands.Command_AddLore;
import global.gitems.Commands.Command_GItems;
import global.gitems.Commands.Command_Rename;
import global.gitems.Commands.Command_SetLore;
import global.gitems.Events.Event_AddLore;
import global.gitems.Events.Event_Rename;
import global.gitems.Events.Event_SetLore;
import global.gitems.GUI.GUI_Enchant;
import global.gitems.GUI.GUI_Manager;
import global.gitems.GUI.GUI_UnBreakabillity;

public class Register {

	private static Main plugin = Main.getPlugin(Main.class);
	
	
	
	public static void Register() {
		registerCommands();
		registerEvents();
	}
	
	private static void registerCommands() {
		plugin.getCommand("gitems").setExecutor(new Command_GItems());
		plugin.getCommand("rename").setExecutor(new Command_Rename());
		plugin.getCommand("setlore").setExecutor(new Command_SetLore());
		plugin.getCommand("addlore").setExecutor(new Command_AddLore());
		plugin.getCommand("repair").setExecutor(new Command_Repair());
		plugin.getCommand("break").setExecutor(new Command_Break());
		plugin.getCommand("more").setExecutor(new Command_More());
		plugin.getCommand("unbreakable").setExecutor(new Command_UnBreakable());
	}
	
	private static void registerEvents() {
		Bukkit.getPluginManager().registerEvents(new GUI_Manager(), plugin);
		Bukkit.getPluginManager().registerEvents(new GUI_Enchant(), plugin);
		Bukkit.getPluginManager().registerEvents(new GUI_UnBreakabillity(), plugin);
		Bukkit.getPluginManager().registerEvents(new Event_Rename(), plugin);
		Bukkit.getPluginManager().registerEvents(new Event_SetLore(), plugin);
		Bukkit.getPluginManager().registerEvents(new Event_AddLore(), plugin);
	}
}
