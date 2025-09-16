
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package mc.dhp.foss.k7a2dlc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import mc.dhp.foss.k7a2dlc.world.inventory.WeaponTraderMenu;
import mc.dhp.foss.k7a2dlc.world.inventory.ArmorTraderMenu;
import mc.dhp.foss.k7a2dlc.K7a2dlcMod;

public class K7a2dlcModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, K7a2dlcMod.MODID);
	public static final RegistryObject<MenuType<WeaponTraderMenu>> WEAPON_TRADER = REGISTRY.register("weapon_trader", () -> IForgeMenuType.create(WeaponTraderMenu::new));
	public static final RegistryObject<MenuType<ArmorTraderMenu>> ARMOR_TRADER = REGISTRY.register("armor_trader", () -> IForgeMenuType.create(ArmorTraderMenu::new));
}
