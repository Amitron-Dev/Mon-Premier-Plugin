package fr.amitron.first.commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class lever implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		Player p = (Player) sender;
		
		
		// Création du levier
		ItemStack lever = new ItemStack(Material.LEVER);
		ItemMeta leverMeta = lever.getItemMeta();
		
		// Modification de la méta
		leverMeta.setDisplayName("§dLe Levier Magique");
		
		// Application de la méta
		lever.setItemMeta(leverMeta);
		
		// Ajout du levier dans l'inventaire du joueur
		p.getInventory().addItem(lever);
		
		// Envoyer un message au joueur pour le prevenir
		p.sendMessage("§aVous avez recu : §r§dLe Levier Magique");
		
		
		return false;
	}

}
