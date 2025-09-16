package mc.dhp.foss.k7a2dlc.procedures;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;

public class BananaPlayerFinishesUsingItemProcedure {
	public static void execute(LevelAccessor world, double x, double z, Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			_ent.teleportTo((x + Mth.nextDouble(RandomSource.create(), -74, 74)),
					(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + Mth.nextDouble(RandomSource.create(), -74, 74)), (int) (z + Mth.nextDouble(RandomSource.create(), -74, 74)))),
					(z + Mth.nextDouble(RandomSource.create(), -74, 74)));
			if (_ent instanceof ServerPlayer _serverPlayer)
				_serverPlayer.connection.teleport((x + Mth.nextDouble(RandomSource.create(), -74, 74)),
						(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + Mth.nextDouble(RandomSource.create(), -74, 74)), (int) (z + Mth.nextDouble(RandomSource.create(), -74, 74)))),
						(z + Mth.nextDouble(RandomSource.create(), -74, 74)), _ent.getYRot(), _ent.getXRot());
		}
	}
}
