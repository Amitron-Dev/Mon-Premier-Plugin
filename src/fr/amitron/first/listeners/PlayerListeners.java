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
		
		
		if(!(b.getType() == Material.LEVER)) {
			if(it !=null && it.hasItemMeta() && it.getItemMeta().hasDisplayName() && it.getItemMeta().getDisplayName().equals("§dLe Levier Magique")) {
				
				// -> Uniquement poser sur un bloc de charbon
				
				if(!(b.getType() == Material.COAL_BLOCK)) {
					p.sendMessage("§cVous devez le levier uniquement sur un bloc de charbon");
					e.setCancelled(true);
				}else {
					if(b.getType() == Material.COAL_BLOCK) {
						p.sendMessage("§aBravo !");
					}
				}
				
				
			}
		}
		
		
	}
	
	

}
