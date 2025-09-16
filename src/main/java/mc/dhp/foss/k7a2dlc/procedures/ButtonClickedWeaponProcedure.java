package mc.dhp.foss.k7a2dlc.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import java.util.function.Supplier;
import java.util.Map;

public class ButtonClickedWeaponProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			Map<Enchantment, Integer> _enchantments = EnchantmentHelper
					.getEnchantments((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY));
			if (_enchantments.containsKey(Enchantments.SHARPNESS)) {
				_enchantments.remove(Enchantments.SHARPNESS);
				EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY));
			}
		}
		{
			Map<Enchantment, Integer> _enchantments = EnchantmentHelper
					.getEnchantments((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY));
			if (_enchantments.containsKey(Enchantments.BANE_OF_ARTHROPODS)) {
				_enchantments.remove(Enchantments.BANE_OF_ARTHROPODS);
				EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY));
			}
		}
		{
			Map<Enchantment, Integer> _enchantments = EnchantmentHelper
					.getEnchantments((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY));
			if (_enchantments.containsKey(Enchantments.SMITE)) {
				_enchantments.remove(Enchantments.SMITE);
				EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY));
			}
		}
		(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).enchant(Enchantments.SHARPNESS,
				(int) Mth.nextDouble(RandomSource.create(), 1, 4));
		(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).enchant(Enchantments.BANE_OF_ARTHROPODS,
				(int) Mth.nextDouble(RandomSource.create(), 1, 3));
		(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).enchant(Enchantments.SMITE,
				(int) Mth.nextDouble(RandomSource.create(), 1, 3));
		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			ItemStack _setstack = (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY);
			_setstack.setCount(1);
			((Slot) _slots.get(2)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			((Slot) _slots.get(0)).set(ItemStack.EMPTY);
			_player.containerMenu.broadcastChanges();
		}
		if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			((Slot) _slots.get(1)).set(ItemStack.EMPTY);
			_player.containerMenu.broadcastChanges();
		}
	}
}
