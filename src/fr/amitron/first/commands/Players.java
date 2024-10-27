package fr.amitron.first.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Players implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		Player p = (Player) sender;
		
		p.sendMessage("Nombre de joueurs connecté au serveur : " + Bukkit.getServer().getOnlinePlayers().size());
		
		return false;
	}

}
