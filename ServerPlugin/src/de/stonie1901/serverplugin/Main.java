package de.stonie1901.serverplugin;

import java.io.IOException;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.spigotmc.Metrics;


import de.stonie1901.serverplugin.commands.teamspeakCommand;
import de.stonie1901.serverplugin.commands.teamspeakCommand;

public class Main extends JavaPlugin {
	private static Main plugin;
	
	@Override
	public void onDisable()
	{
		getLogger().info("Sciencecraft Plugin wurde deaktiviert!");
	}
	
	
	@Override
	public void onEnable()
	{
		getLogger().info("Sciencecraft Plugin wurde aktiviert!");
		getCommands();
		PluginManager pm = getServer().getPluginManager();
		try {
	        Metrics metrics = new Metrics();
	        metrics.start();
	    } catch (IOException e) {
	        // Failed to submit the stats :-(
	    }
	}
	
	public void getCommands()
	{
		this.getCommand("teamspeak").setExecutor(new teamspeakCommand());
		
	}
}
