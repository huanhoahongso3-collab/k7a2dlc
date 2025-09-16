
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package mc.dhp.foss.k7a2dlc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import mc.dhp.foss.k7a2dlc.K7a2dlcMod;

public class K7a2dlcModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, K7a2dlcMod.MODID);
	public static final RegistryObject<SoundEvent> PICKLEBALL = REGISTRY.register("pickleball", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("k7a2dlc", "pickleball")));
}
