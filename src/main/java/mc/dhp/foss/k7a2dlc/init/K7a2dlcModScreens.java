
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package mc.dhp.foss.k7a2dlc.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import mc.dhp.foss.k7a2dlc.client.gui.WeaponTraderScreen;
import mc.dhp.foss.k7a2dlc.client.gui.ArmorTraderScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class K7a2dlcModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(K7a2dlcModMenus.WEAPON_TRADER.get(), WeaponTraderScreen::new);
			MenuScreens.register(K7a2dlcModMenus.ARMOR_TRADER.get(), ArmorTraderScreen::new);
		});
	}
}
