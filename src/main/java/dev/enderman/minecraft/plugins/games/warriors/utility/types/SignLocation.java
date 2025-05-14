package dev.enderman.minecraft.plugins.games.warriors.utility.types;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.BlockFace;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class SignLocation extends Location {
	private final BlockFace facingDirection;

	public SignLocation(@Nullable World world, final double x, final double y, final double z, @NotNull final BlockFace direction) {
		super(world, x, y, z);
		this.facingDirection = direction;
	}

	public BlockFace getFacingDirection() {
		return facingDirection;
	}
}
