package de.stonie1901.serverplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import de.stonie1901.serverplugin.Main;

public class teamspeakCommand implements CommandExecutor {
	public Main plugin;

	@Override
	public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
		
		if (cmd.getName().equalsIgnoreCase("kits")) {
		      if ((cs instanceof Player))
		      {
		        Player player = (Player)cs;
		        if (player.hasPermission("EasyPvpKits.Kits"))
		        {
		        	player.sendMessage(ChatColor.BLACK + "test");
		        	return true;
		        } else
		        {
		        	player.sendMessage(ChatColor.RED + "You do not have permission to excute this command.");
		            return true;
		        }
		      }
		}
		return false;
	}

}
