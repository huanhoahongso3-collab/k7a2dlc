
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package mc.dhp.foss.k7a2dlc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import mc.dhp.foss.k7a2dlc.item.VotPickleballItem;
import mc.dhp.foss.k7a2dlc.item.StopRightThereItem;
import mc.dhp.foss.k7a2dlc.item.PickleballItem;
import mc.dhp.foss.k7a2dlc.item.DoPhuQuyPickleballItem;
import mc.dhp.foss.k7a2dlc.item.BananaItem;
import mc.dhp.foss.k7a2dlc.K7a2dlcMod;

public class K7a2dlcModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, K7a2dlcMod.MODID);
	public static final RegistryObject<Item> TON_LAI_SPAWN_EGG = REGISTRY.register("ton_lai_spawn_egg", () -> new ForgeSpawnEggItem(K7a2dlcModEntities.TON_LAI, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> TPL_TRADER_SPAWN_EGG = REGISTRY.register("tpl_trader_spawn_egg", () -> new ForgeSpawnEggItem(K7a2dlcModEntities.TPL_TRADER, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> BANANA = REGISTRY.register("banana", () -> new BananaItem());
	public static final RegistryObject<Item> LUCKY_BLOCK = block(K7a2dlcModBlocks.LUCKY_BLOCK);
	public static final RegistryObject<Item> STOP_RIGHT_THERE = REGISTRY.register("stop_right_there", () -> new StopRightThereItem());
	public static final RegistryObject<Item> PICKLEBALL = REGISTRY.register("pickleball", () -> new PickleballItem());
	public static final RegistryObject<Item> VOT_PICKLEBALL = REGISTRY.register("vot_pickleball", () -> new VotPickleballItem());
	public static final RegistryObject<Item> DO_PHU_QUY_PICKLEBALL = REGISTRY.register("do_phu_quy_pickleball", () -> new DoPhuQuyPickleballItem());
	public static final RegistryObject<Item> BLOCK_OF_TPL = block(K7a2dlcModBlocks.BLOCK_OF_TPL);
	public static final RegistryObject<Item> BLOCK_OF_TPL_2 = block(K7a2dlcModBlocks.BLOCK_OF_TPL_2);
	public static final RegistryObject<Item> FLOATING_LANTERN = block(K7a2dlcModBlocks.FLOATING_LANTERN);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
