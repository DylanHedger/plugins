package com.dhl.IslandCraft;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class IslandCraft extends JavaPlugin {

	public void onEnable() {
		registerCommands();
		registerEvents();
		registerConfig();
	}
	
	public void onDisable() {
		reloadConfig();
		saveConfig();
	}

	private void registerCommands() {
		//TODO
	}
	
	private void registerEvents() {
		PluginManager pm = getServer().getPluginManager();
		//TODO
	}

	private void registerConfig() {
		getConfig().options().copyDefaults(true);
		saveConfig();
	}
}
