package fr.amitron.first;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import fr.amitron.first.commands.Players;
import fr.amitron.first.commands.bc;
import fr.amitron.first.commands.lever;
import fr.amitron.first.commands.msg;
import fr.amitron.first.listeners.PlayerListeners;

public class GMain extends JavaPlugin {
	
	@Override
	public void onEnable() {
		System.out.println("  [MYFIRSTPLUGIN] Lancement...");
		System.out.println("  Joueurs actuellement connecté : " + Bukkit.getServer().getOnlinePlayers().size());
		
		if(Bukkit.getServer().getOnlinePlayers().size() >= 2) {
			Bukkit.broadcastMessage("Il y a plus de 1 joueur connecté !");
		}
		getCommand("players").setExecutor(new Players());
		getCommand("lever").setExecutor(new lever());
		getCommand("msg").setExecutor(new msg());
		getCommand("broadcast").setExecutor(new bc());
		
		Bukkit.getServer().getPluginManager().registerEvents(new PlayerListeners(), this);
	}
	
	@Override
	public void onDisable() {
		
	}

}
