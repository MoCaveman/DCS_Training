package com.xlab.helloworld;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		
		getLogger().info("Hellow Wesley has been enabled");
		
	}
	public void onDisable() {
		
		getLogger().info("Hellow Wesley has been disabled");
		
	}
}	