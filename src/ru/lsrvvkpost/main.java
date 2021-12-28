package ru.lsrvvkpost;

import java.io.File;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;


public class main extends JavaPlugin {
    
    public static main instance;
	@SuppressWarnings("deprecation")
	public void onEnable() {;
	instance = this;

	Bukkit.getPluginManager().registerEvents(new VKListener(), this);
	getCommand("fakepost").setExecutor(new fakepostcmd(this)); 
	
	File config = new File(getDataFolder() + File.separator + "config.yml");
    if(!config.exists()) {
	getConfig().options().copyDefaults(true);
	saveDefaultConfig();
    
    }
	}
}



