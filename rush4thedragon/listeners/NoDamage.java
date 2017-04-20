package rush4thedragon.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryInteractEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import rush4thedragon.Rush4TheDragon;

public class NoDamage implements Listener {
	
	@EventHandler
	public void onDam(EntityDamageEvent e){
		if(Rush4TheDragon.pause && (!Rush4TheDragon.isGameFinish) && Rush4TheDragon.status) e.setCancelled(true);
	}
	
	@EventHandler
	public void onPick(PlayerPickupItemEvent e){
		if(Rush4TheDragon.pause && (!Rush4TheDragon.isGameFinish) && Rush4TheDragon.status) e.setCancelled(true);
	}
	
	@EventHandler
	public void onDrop(PlayerDropItemEvent e){
		if(Rush4TheDragon.pause && (!Rush4TheDragon.isGameFinish) && Rush4TheDragon.status) e.setCancelled(true);
	}
	
	@EventHandler
	public void onInvInteract(InventoryClickEvent e){
		if(Rush4TheDragon.pause && (!Rush4TheDragon.isGameFinish) && Rush4TheDragon.status) e.setCancelled(true);
	}
	
	@EventHandler
	public void onInvInteract(InventoryInteractEvent e){
		if(Rush4TheDragon.pause && (!Rush4TheDragon.isGameFinish) && Rush4TheDragon.status) e.setCancelled(true);
	}
	
	@EventHandler
	public void onBlockBreak(BlockBreakEvent e){
		if(Rush4TheDragon.pause && (!Rush4TheDragon.isGameFinish) && Rush4TheDragon.status) e.setCancelled(true);
	}
	
	@EventHandler
	public void onMove(PlayerMoveEvent e){
		Player p = e.getPlayer();
		if(Rush4TheDragon.pause && (!Rush4TheDragon.isGameFinish) && Rush4TheDragon.status){
			p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 999999999, 254));
		}else{
			if(p.hasPotionEffect(PotionEffectType.SLOW)){
				p.removePotionEffect(PotionEffectType.SLOW);
			}
		}
	}

}
