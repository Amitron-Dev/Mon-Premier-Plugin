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
		
		
		// -> Verifier les arguments de la commande
		// -> verifier si le joueur cible est connecté
		// -> Recuper le joueur de la commande et l'envoyer dans une variable
		// -> Recuperer le messag et le mettre dans un string builder
		// -> envoyer les message au sender et au joueurs qui est dans la commande
		
		
		// Etape 1 :
		if(args.length == 0) {
			p.sendMessage("§cUtilisation : /msg <joueur> <message>");
		}
		
		if(args.length == 1) {
			p.sendMessage("§cUtilisation : /msg <joueur> <message>");
		}
		
		
		
		
		if(args.length >= 2) {
			
			
			// Etape 2 - 3 
			Player t = Bukkit.getPlayer(args[0]);
			if(t != null && t.isOnline()) {
				// Etape 4
				StringBuilder msg = new StringBuilder();
				for(int i = 1; i < args.length; i++) {
					msg.append(args[i]).append(" ");
				}
				
				// Etaoe 5
				p.sendMessage("§a[MSG] §r§7Moi -> " + t.getName() + " §r : " + msg.toString().trim());
				t.sendMessage("§a[MSG] §r§7" + p.getName() + " -> Moi" + " §r : " + msg.toString().trim());
			}else {
				p.sendMessage("§cLe joueur " + args[0] + " n'est pas en ligne !");
			}
			
			
			
		}
		
		
		return false;
	}

}
