
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package mc.dhp.foss.k7a2dlc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import mc.dhp.foss.k7a2dlc.K7a2dlcMod;

public class K7a2dlcModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, K7a2dlcMod.MODID);
	public static final RegistryObject<Item> TON_LAI_SPAWN_EGG = REGISTRY.register("ton_lai_spawn_egg", () -> new ForgeSpawnEggItem(K7a2dlcModEntities.TON_LAI, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> TPL_TRADER_SPAWN_EGG = REGISTRY.register("tpl_trader_spawn_egg", () -> new ForgeSpawnEggItem(K7a2dlcModEntities.TPL_TRADER, -1, -1, new Item.Properties()));
}
