
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package mc.dhp.foss.k7a2dlc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import mc.dhp.foss.k7a2dlc.block.LuckyBlockBlock;
import mc.dhp.foss.k7a2dlc.K7a2dlcMod;

public class K7a2dlcModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, K7a2dlcMod.MODID);
	public static final RegistryObject<Block> LUCKY_BLOCK = REGISTRY.register("lucky_block", () -> new LuckyBlockBlock());
}
