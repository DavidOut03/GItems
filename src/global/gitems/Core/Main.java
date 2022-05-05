package global.gitems.Core;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import global.gitems.Utils.AlternateCodes;
import global.gitems.Utils.Message;

public class Main extends JavaPlugin {
	
	
	@Override
	public void onEnable() {
		Bukkit.getConsoleSender().sendMessage(AlternateCodes.format(Message.prefix + "Turned " + this.getName() + " &aON&7."));
		Register.Register();
	}
	
	@Override
	public void onDisable() {
		Bukkit.getConsoleSender().sendMessage(AlternateCodes.format(Message.prefix + "Turned " + this.getName() + " &cOFF&7."));
	}

}
