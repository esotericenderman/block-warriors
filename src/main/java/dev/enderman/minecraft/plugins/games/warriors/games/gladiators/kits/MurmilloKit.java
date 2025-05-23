package dev.enderman.minecraft.plugins.games.warriors.games.gladiators.kits;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.jetbrains.annotations.NotNull;

import dev.enderman.minecraft.plugins.games.warriors.BlockWarriorsPlugin;
import dev.enderman.minecraft.plugins.games.warriors.enums.KitType;
import dev.enderman.minecraft.plugins.games.warriors.types.AbstractKit;
import dev.enderman.minecraft.plugins.games.warriors.utility.ItemUtility;

public final class MurmilloKit extends AbstractKit {
	public MurmilloKit(@NotNull final BlockWarriorsPlugin plugin, @NotNull final Player kitUser) {
		super(
						plugin,
						KitType.MURMILLO,
						kitUser
		);
	}

	@Override
	public void activateKit(@NotNull final Player player) {
		player.addPotionEffect(
						new PotionEffect(
										PotionEffectType.BLINDNESS, 200, 0, true, true, true
						)
		);

		player.addPotionEffect(
						new PotionEffect(
										PotionEffectType.SPEED, 200, 1, true, true, true
						)
		);
	}

	@Override
	public void giveItems(@NotNull Player player) {
		final PlayerInventory playerInventory = player.getInventory();

		playerInventory.addItem(
						ItemUtility.createCustomItem(
										Material.IRON_SWORD,
										"Murmillo's Blade"
						)
		);

		playerInventory.setHelmet(
						ItemUtility.createCustomItem(
										Material.GOLDEN_HELMET,
										ChatColor.YELLOW + "Murmillo's Helmet"
						)
		);

		playerInventory.setBoots(
						ItemUtility.createCustomItem(
										Material.GOLDEN_BOOTS,
										ChatColor.YELLOW + "Murmillo's Boots"
						)
		);

		playerInventory.setItemInOffHand(
						ItemUtility.createCustomItem(
										Material.SHIELD,
										ChatColor.DARK_AQUA + "Murmillo's Shield"
						)
		);
	}
}
