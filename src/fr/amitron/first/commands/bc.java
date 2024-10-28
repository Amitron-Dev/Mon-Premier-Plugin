package fr.amitron.first.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class bc implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		Player p = (Player)sender;
		
		if(args.length == 0) {
			p.sendMessage("§cUtilisation : /broadcast <message>");
			
		}
		
		if(args.length >= 1) {
			StringBuilder msg = new StringBuilder();
			for(String word : args) {
				msg.append(word).append(" ");
			}
			
			Bukkit.broadcastMessage("§6[BROADCAST] §r§a" + msg.toString().trim());
		}
		
		return false;
	}

}
