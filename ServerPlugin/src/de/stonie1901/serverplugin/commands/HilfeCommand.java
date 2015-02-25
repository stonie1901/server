package de.stonie1901.serverplugin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HilfeCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
		
		if (cmd.getName().equalsIgnoreCase("hilfe")) {
			Player player = (Player)cs;
		      if ((cs instanceof Player))
		      {
		        if (player.hasPermission("sciencecraft.hilfe"))
		        {
		        	player.sendMessage(ChatColor.GREEN + "Du kannst dich nicht einloggen?");
		        	player.sendMessage(ChatColor.GREEN + "");
		        	player.sendMessage(ChatColor.GREEN + "Klick einfach auf den Nachfolgenden Link und setz dich mit uns in Verbindung!");
		        	player.sendMessage(ChatColor.GREEN + "");
		        	player.sendMessage(ChatColor.GREEN + "http://goo.gl/UenkzR");
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
