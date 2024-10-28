package fr.amitron.first.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class msg implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		Player p = (Player) sender;
		
		if(args.length == 0) {
			p.sendMessage("§cUtilisation : /msg <joueur> <message>");
		}
		
		if(args.length == 1) {
			p.sendMessage("§cUtilisation : /msg <joueur> <message>");
		}
		
		if(args.length >= 2) {
			Player t = Bukkit.getPlayer(args[0]); // place le joueur cible dans une variable appelé "t" pour "target"
			
			if(t != null && t.isOnline()) { // verif si le joueur cible est en ligne
				
				StringBuilder msg = new StringBuilder();
				
				for(int i = 1; i < args.length ; i++) {
					msg.append(args[i]).append(" ");
				}
				
				// Envoyer les messages
				t.sendMessage("§a[MSG] §r§7" + p.getName() + " -> Moi : §r" + msg.toString().trim()); // au joueur cible
				p.sendMessage("§a[MSG] §r§7Moi -> " + t.getName() + " : §r" + msg.toString().trim()); // au joueur qui a tappé la commande
				
				
				
			}else {
				p.sendMessage("§cLe joueur " + args[0] + " n'est pas en ligne"); //si il n'est pas en ligne, alors on envoie le message
				
			}
		}
		
		
		
		
		return false;
	}

}
