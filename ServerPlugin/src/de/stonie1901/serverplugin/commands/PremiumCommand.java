package de.stonie1901.serverplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PremiumCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
		
		if (cmd.getName().equalsIgnoreCase("hilfe")) {
			Player player = (Player)cs;
		      if ((cs instanceof Player))
		      {
		        if (player.hasPermission("sciencecraft.hilfe"))
		        {
		        	player.sendMessage(ChatColor.RED + "Du willst Premium werden?");
		        	player.sendMessage(ChatColor.GREEN + "");
		        	player.sendMessage(ChatColor.GREEN + "Dann gebe einfach im Chat den Befehl \"/buy\" ein und such dir dort dein Premium Pakte aus.");
		        	player.sendMessage(ChatColor.GREEN + "");
		        	player.sendMessage(ChatColor.GREEN + "Andernfalls kannst du auch auf unserer Internetseite die Pakete aussuchen. Der Link dazu ist http://goo.gl/toBeV7");
		        	return true;
		        } else
		        {
		        	player.sendMessage(ChatColor.RED + "Dafuer hast du keine Berechtigung.");
		            return true;
		        }
		      } else {
		    	  player.sendMessage("Du kannst das nicht mit der Konsole ausfuehren!");
		      }
		}
		return false;
	}

}
