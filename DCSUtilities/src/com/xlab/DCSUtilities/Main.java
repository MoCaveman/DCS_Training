package com.xlab.DCSUtilities;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Main {

	public ItemStack specialItem;
	
	public void GiveSpecialItem() {
	
		specialItem = (new ItemStack(Material.DIAMOND_SWORD));
		specialItem.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 105);
		specialItem.addUnsafeEnchantment(Enchantment.DURABILITY , 10);
		
		
	}
	
}
