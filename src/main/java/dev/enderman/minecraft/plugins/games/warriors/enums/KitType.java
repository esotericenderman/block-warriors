package dev.enderman.minecraft.plugins.games.warriors.enums;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import dev.enderman.minecraft.plugins.games.warriors.utility.ItemUtility;

public enum KitType {
	MOLE(
					ChatColor.GOLD + "Mole",
					ItemUtility.createCustomItem(
									Material.RABBIT_SPAWN_EGG,
									ChatColor.GOLD + "Mole",
									ChatColor.GRAY + "Moles are often gluttonous beasts,\n" + ChatColor.GRAY
													+ "proving to be very effective in this mini-game.\n\n"
													+ ChatColor.GRAY + "- " + ChatColor.YELLOW + "Golden Pickaxe\n"
													+ ChatColor.GRAY + "- " + ChatColor.WHITE + "Speed " + ChatColor.BOLD + "III " + ChatColor.GRAY + "(" + ChatColor.YELLOW + "12.5 " + ChatColor.GRAY + "s)"
					)
	),
	VOLE(
					ChatColor.DARK_GRAY + "Vole",
					ItemUtility.createCustomItem(
									Material.SILVERFISH_SPAWN_EGG,
									ChatColor.DARK_GRAY + "Vole",
									ChatColor.GRAY + "Voles are most commonly roly and poly,\n" + ChatColor.GRAY
													+ "with some variants being professional munchers.\n\n"
													+ ChatColor.GRAY + "- " + ChatColor.WHITE + "Iron Shovel\n"
													+ ChatColor.GRAY + "- " + ChatColor.YELLOW + "Haste " + ChatColor.BOLD + "I " + ChatColor.GRAY + "("
													+ ChatColor.YELLOW + "12.5 " + ChatColor.GRAY + "s)"
					)
	),
	RETIARIUS(
					ChatColor.GOLD + "Retiarius",
					ItemUtility.createCustomItem(
									Material.TRIDENT,
									ChatColor.GOLD + "Retiarius",
									ChatColor.RED + "A fierce, strong and brave warrior from the colosseum of ancient Rome.\n\n"
													+ ChatColor.GRAY + "- " + ChatColor.AQUA + "Trident\n"
													+ ChatColor.GRAY + "- " + ChatColor.YELLOW + "Gold Chestplate\n"
													+ ChatColor.GRAY + "- " + ChatColor.WHITE + "Iron Boots\n"
													+ ChatColor.GRAY + "- " + ChatColor.RED + "Strength " + ChatColor.BOLD + "I " + ChatColor.GRAY + "(" + ChatColor.YELLOW + "3 " + ChatColor.GRAY + "s)\n"
													+ ChatColor.GRAY + "- Slowness " + ChatColor.BOLD + "II " + ChatColor.GRAY + "(" + ChatColor.YELLOW + "10 " + ChatColor.GRAY + "s)\n"
					)
	),
	MURMILLO(
					ChatColor.RED + "Murmillo",
					ItemUtility.createCustomItem(
									Material.IRON_SWORD,
									ChatColor.RED + "Murmillo",
									ChatColor.GRAY + "An offense-oriented gladiator, impaired in vision by his protective golden helmet.\n\n"
													+ ChatColor.GRAY + "- " + ChatColor.WHITE + "Iron Sword\n"
													+ ChatColor.GRAY + "- " + ChatColor.YELLOW + "Gold Helmet\n"
													+ ChatColor.GRAY + "- " + ChatColor.YELLOW + "Gold Boots\n"
													+ ChatColor.GRAY + "- " + ChatColor.DARK_AQUA + "Shield\n"
													+ ChatColor.GRAY + "- " + ChatColor.GRAY + "Blindness " + ChatColor.BOLD + "I " + ChatColor.GRAY + "(" + ChatColor.YELLOW + "10 " + ChatColor.GRAY + "s)\n"
													+ ChatColor.GRAY + "- " + ChatColor.WHITE + "Speed " + ChatColor.BOLD + "II " + ChatColor.GRAY + "(" + ChatColor.YELLOW + "10 " + ChatColor.GRAY + "s)"
					)
	);

	private final String name;
	private final ItemStack icon;

	KitType(@NotNull final String displayName, @NotNull final ItemStack icon) {
		this.name = displayName;
		this.icon = icon;
	}

	public String getName() {
		return name;
	}

	public ItemStack getIcon() {
		return icon;
	}
}
