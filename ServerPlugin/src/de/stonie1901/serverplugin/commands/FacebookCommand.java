package de.stonie1901.serverplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FacebookCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
		
		if (cmd.getName().equalsIgnoreCase("facebook")) {
		      if ((cs instanceof Player))
		      {
		        Player player = (Player)cs;
		        if (player.hasPermission("sciencecraft.facebook"))
		        {
		        	player.sendMessage(ChatColor.RED + "Du willst uns auf Facebook liken?");
		        	player.sendMessage(ChatColor.GREEN + "");
		        	player.sendMessage(ChatColor.GREEN + "Hier hast du den Link! Danke schonmal im voraus!");
		        	player.sendMessage(ChatColor.GREEN + "");
		        	player.sendMessage(ChatColor.GREEN + "http://goo.gl/i1H0Io");
		        	return true;
		        } else
		        {
		        	player.sendMessage(ChatColor.RED + "Dafuer hast du keine Berechtigung.");
		            return true;
		        }
		      }
		}
		return false;
	}

}
