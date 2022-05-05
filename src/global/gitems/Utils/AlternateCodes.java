package global.gitems.Utils;

import org.bukkit.ChatColor;

public class AlternateCodes {

	public static String format(String message) {
		return ChatColor.translateAlternateColorCodes('&', message);
	}
}
