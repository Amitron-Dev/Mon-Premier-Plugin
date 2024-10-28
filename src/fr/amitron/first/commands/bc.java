package fr.amitron.first.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class bc implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		Player p = (Player) sender;
		
		
		// -> Etape 1 : verifier les arguments
		// -> Etape 2 : recuperé les arguments et les mettre dans un string builder
		// -> Etape 3 : Envoyer les differents messages au joueurs.
		
		
		// Etape 1
		if(args.length == 0) {
			p.sendMessage("§cVous devez utilisé la commande : /broadcasr <message>");
		}
		
		if(args.length >= 1) {
			
			// Recuperer le message (Etape 2)
			StringBuilder msg = new StringBuilder();
			for(String word : args) {
				msg.append(word).append(" ");
			}
			
			// Envoyer le message (Etape 3)
			Bukkit.broadcastMessage("§6[BROADCAST] §r§a" + msg.toString().trim());
			
			
			
		}
		
		
		
		return false;
	}

}
