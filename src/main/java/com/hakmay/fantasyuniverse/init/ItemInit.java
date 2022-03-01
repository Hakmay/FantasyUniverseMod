package com.hakmay.fantasyuniverse.init;

import com.google.common.base.Supplier;
import com.hakmay.fantasyuniverse.FantasyUniverseMod;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			FantasyUniverseMod.MOD_ID);

	public static final RegistryObject<Item> EXEMPLE_ITEM = register("example_item",
			() -> new Item(new Item.Properties().tab(FantasyUniverseMod.FANTASY_TAB)));

	private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item) {
		return ITEMS.register(name, item);
	}
}
