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

public class ButtonClickedArmorProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			Map<Enchantment, Integer> _enchantments = EnchantmentHelper
					.getEnchantments((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY));
			if (_enchantments.containsKey(Enchantments.ALL_DAMAGE_PROTECTION)) {
				_enchantments.remove(Enchantments.ALL_DAMAGE_PROTECTION);
				EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY));
			}
		}
		{
			Map<Enchantment, Integer> _enchantments = EnchantmentHelper
					.getEnchantments((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY));
			if (_enchantments.containsKey(Enchantments.FIRE_PROTECTION)) {
				_enchantments.remove(Enchantments.FIRE_PROTECTION);
				EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY));
			}
		}
		{
			Map<Enchantment, Integer> _enchantments = EnchantmentHelper
					.getEnchantments((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY));
			if (_enchantments.containsKey(Enchantments.BLAST_PROTECTION)) {
				_enchantments.remove(Enchantments.BLAST_PROTECTION);
				EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY));
			}
		}
		{
			Map<Enchantment, Integer> _enchantments = EnchantmentHelper
					.getEnchantments((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY));
			if (_enchantments.containsKey(Enchantments.PROJECTILE_PROTECTION)) {
				_enchantments.remove(Enchantments.PROJECTILE_PROTECTION);
				EnchantmentHelper.setEnchantments(_enchantments, (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY));
			}
		}
		(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).enchant(Enchantments.BLAST_PROTECTION,
				(int) Mth.nextDouble(RandomSource.create(), 1, 3));
		(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).enchant(Enchantments.FIRE_PROTECTION,
				(int) Mth.nextDouble(RandomSource.create(), 1, 3));
		(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).enchant(Enchantments.PROJECTILE_PROTECTION,
				(int) Mth.nextDouble(RandomSource.create(), 1, 2));
		(entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY).enchant(Enchantments.ALL_DAMAGE_PROTECTION,
				(int) Mth.nextDouble(RandomSource.create(), 1, 4));
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
