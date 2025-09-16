
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package mc.dhp.foss.k7a2dlc.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import mc.dhp.foss.k7a2dlc.client.renderer.TonLaiRenderer;
import mc.dhp.foss.k7a2dlc.client.renderer.TPLTraderRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class K7a2dlcModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(K7a2dlcModEntities.TON_LAI.get(), TonLaiRenderer::new);
		event.registerEntityRenderer(K7a2dlcModEntities.TPL_TRADER.get(), TPLTraderRenderer::new);
	}
}
