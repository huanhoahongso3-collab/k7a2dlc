
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package mc.dhp.foss.k7a2dlc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import mc.dhp.foss.k7a2dlc.entity.TonLaiEntity;
import mc.dhp.foss.k7a2dlc.entity.TPLTraderEntity;
import mc.dhp.foss.k7a2dlc.K7a2dlcMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class K7a2dlcModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, K7a2dlcMod.MODID);
	public static final RegistryObject<EntityType<TonLaiEntity>> TON_LAI = register("ton_lai",
			EntityType.Builder.<TonLaiEntity>of(TonLaiEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(1).setUpdateInterval(3).setCustomClientFactory(TonLaiEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TPLTraderEntity>> TPL_TRADER = register("tpl_trader",
			EntityType.Builder.<TPLTraderEntity>of(TPLTraderEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(1).setUpdateInterval(3).setCustomClientFactory(TPLTraderEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			TonLaiEntity.init();
			TPLTraderEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(TON_LAI.get(), TonLaiEntity.createAttributes().build());
		event.put(TPL_TRADER.get(), TPLTraderEntity.createAttributes().build());
	}
}
