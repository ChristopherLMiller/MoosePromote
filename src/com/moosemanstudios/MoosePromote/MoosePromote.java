package com.moosemanstudios.MoosePromote;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class MoosePromote extends JavaPlugin {
	Logger log = Logger.getLogger("minecraft");
	
	@Override
	public void onDisable() {
		log.info("[MoosePromote] is disabled");
	}
	
	@Override
	public void onEnable() {
		// see if bPermissions is found
		this.getServer().getPluginManager().getPlugin("bpermissions");
		
		PluginDescriptionFile pdfFile = this.getDescription();
		log.info("[" + pdfFile.getAuthors() + "] version: " + pdfFile.getVersion() + " is now enabled.");
	}
}
