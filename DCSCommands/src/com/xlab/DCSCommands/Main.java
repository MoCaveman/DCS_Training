package com.xlab.DCSCommands;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        PluginDescriptionFile pdf = getDescription();
        getLogger().info(pdf.getName() + " " + pdf.getVersion() + " Night Vision has been Enabled ");
    }

    @Override
    public void onDisable() {
        PluginDescriptionFile pdf = getDescription();
        getLogger().info(pdf.getName() + " " + pdf.getVersion() + " Night Vision has been disabled ");
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
         if (label.equalsIgnoreCase("nv") && player.hasPermission("DCSCommands.nv") && player.getPotionEffect(PotionEffectType.NIGHT_VISION) == null) {
            player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 1000000000, 5));
            player.sendMessage(ChatColor.GREEN + " Dark Cave Spider has shown you the light " + player.getName() + "!");
            return true;
        }
        else if (label.equalsIgnoreCase("nv") && player.getPotionEffect(PotionEffectType.NIGHT_VISION) != null) {
            player.removePotionEffect(PotionEffectType.NIGHT_VISION);
            player.sendMessage(ChatColor.GREEN + " Night Vision has been deactivated " + player.getName() + "!");
            return true;
        }
     
        if (label.equalsIgnoreCase("gsword") && player.hasPermission("DCSCommands.gsword" ))  {
        	if (player.getInventory().firstEmpty() != -1) {
                 ItemStack specialItem = new ItemStack(Material.DIAMOND_SWORD);
                 specialItem.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 105);
         		 specialItem.addUnsafeEnchantment(Enchantment.DURABILITY, 10);

                 player.getInventory().addItem(specialItem);
                 player.sendMessage(ChatColor.RED + "Enjoy the God Sword " + player.getName() );
                 return true;
             } else {
                 sender.sendMessage(ChatColor.RED + "You need to clear up some inventory space before receiving a God Sword!");
             }
         }
        return false;
     }
}

