
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package mc.dhp.foss.k7a2dlc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import mc.dhp.foss.k7a2dlc.K7a2dlcMod;

public class K7a2dlcModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, K7a2dlcMod.MODID);
	public static final RegistryObject<CreativeModeTab> K_7_A_2_DLC = REGISTRY.register("k_7_a_2_dlc",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.k7a2dlc.k_7_a_2_dlc")).icon(() -> new ItemStack(Blocks.DIAMOND_BLOCK)).displayItems((parameters, tabData) -> {
				tabData.accept(K7a2dlcModItems.TON_LAI_SPAWN_EGG.get());
				tabData.accept(K7a2dlcModItems.TPL_TRADER_SPAWN_EGG.get());
				tabData.accept(K7a2dlcModItems.BANANA.get());
				tabData.accept(K7a2dlcModBlocks.LUCKY_BLOCK.get().asItem());
				tabData.accept(K7a2dlcModItems.STOP_RIGHT_THERE.get());
				tabData.accept(K7a2dlcModItems.PICKLEBALL.get());
				tabData.accept(K7a2dlcModItems.VOT_PICKLEBALL.get());
				tabData.accept(K7a2dlcModItems.DO_PHU_QUY_PICKLEBALL.get());
				tabData.accept(K7a2dlcModBlocks.FLOATING_LANTERN.get().asItem());
			}).withSearchBar().build());
}
