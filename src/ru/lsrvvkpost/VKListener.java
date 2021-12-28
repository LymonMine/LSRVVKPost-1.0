package ru.lsrvvkpost;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import com.ubivashka.vk.spigot.events.VKPostNewEvent;

public class VKListener implements Listener{
	
	@EventHandler
	public void onVKMessage(VKPostNewEvent e) {
    	for(String s : main.instance.getConfig().getStringList("alert-newpost")) {
    		s = ChatColor.translateAlternateColorCodes('&', s);
		Bukkit.getServer().broadcastMessage(s);
		
	}
}
}