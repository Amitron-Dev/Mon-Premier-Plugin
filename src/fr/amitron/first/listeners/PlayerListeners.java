package fr.amitron.first.listeners;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class PlayerListeners implements Listener {
	
	@EventHandler
	public void onInteract(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		ItemStack it = e.getItem();
		Block b = e.getClickedBlock();
		
		if(it !=null && it.getType() == Material.LEVER && it.hasItemMeta() && it.getItemMeta().hasDisplayName() && it.getItemMeta().getDisplayName().equals("§dLe Levier Magique")) { // verifié le levier
			
			if(!(b.getType() == Material.LEVER)) { // si le block cliqué n'est pas un levier
				
				if(!(b.getType() == Material.COAL_BLOCK)) { // si le block cliqué est un block de charbon
					
					e.setCancelled(true); // annulé l'evenement crée par minecraft
					p.sendMessage("§cVous devez poser le levier sur un bloc de charbon.");
					
				}
			}else { // sinon
				e.setCancelled(false); // n'annule pas l'evenement
				
			}
			
			
			
		}
	}
	
	

}
