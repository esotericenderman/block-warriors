package dev.enderman.minecraft.plugins.games.bw.utility;

import org.bukkit.GameRule;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public final class PacketUtility {
	public static void respawnPlayer(@NotNull final Player player) {
		player.getWorld().setGameRule(GameRule.DO_IMMEDIATE_RESPAWN, true);
	}
}
