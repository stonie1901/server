package de.stonie1901.serverplugin;

import org.bukkit.plugin.java.JavaPlugin;

import de.stonie1901.serverplugin.commands.teamspeakCommand;

public class Main extends JavaPlugin {
	
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
	}
	
	public void getCommands()
	{
		this.getCommand("teamspeak").setExecutor(new teamspeakCommand(this));
		
	}
}
