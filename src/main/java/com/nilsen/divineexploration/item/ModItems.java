package com.nilsen.divineexploration.item;

import com.nilsen.divineexploration.DivineExploration;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item ROSE_QUARTZ_INGOT = registerItem("rose_quartz_ingot", new Item(new Item.Settings()));
    public static final Item ROSE_QUARTZ = registerItem("rose_quartz", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(DivineExploration.MOD_ID, name), item);
    }

    public static void registerModItems() {
        DivineExploration.LOGGER.info("registering mod items for" + DivineExploration.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(ROSE_QUARTZ_INGOT);
            entries.add(ROSE_QUARTZ);
        });
    }
}
