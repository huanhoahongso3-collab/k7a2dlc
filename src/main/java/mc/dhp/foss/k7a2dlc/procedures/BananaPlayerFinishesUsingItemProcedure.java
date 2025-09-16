package mc.dhp.foss.k7a2dlc.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;

public class BananaPlayerFinishesUsingItemProcedure {
	public static void execute(double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			_ent.teleportTo((x + Mth.nextDouble(RandomSource.create(), -474, 474)), y, (z + Mth.nextDouble(RandomSource.create(), -474, 474)));
			if (_ent instanceof ServerPlayer _serverPlayer)
				_serverPlayer.connection.teleport((x + Mth.nextDouble(RandomSource.create(), -474, 474)), y, (z + Mth.nextDouble(RandomSource.create(), -474, 474)), _ent.getYRot(), _ent.getXRot());
		}
	}
}
