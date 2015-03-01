package de.stonie1901.serverplugin;

import java.io.IOException;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.spigotmc.Metrics;






import de.stonie1901.serverplugin.commands.BukkitserverCommand;
import de.stonie1901.serverplugin.commands.FacebookCommand;
import de.stonie1901.serverplugin.commands.HilfeCommand;
import de.stonie1901.serverplugin.commands.PremiumCommand;
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
		
		// Copied from Metrics.org
		/*try {
	        Metrics metrics = new Metrics();
	        metrics.start();
	    } catch (IOException e) {
	        // Failed to submit the stats :-(
	    } */
		// End
	}
	
	public void getCommands()
	{
		this.getCommand("teamspeak").setExecutor(new teamspeakCommand());
		this.getCommand("bukkitserver").setExecutor(new BukkitserverCommand());
		this.getCommand("hilfe").setExecutor(new HilfeCommand());
		this.getCommand("premium").setExecutor(new PremiumCommand());
		this.getCommand("facebook").setExecutor(new FacebookCommand());
	}
}
