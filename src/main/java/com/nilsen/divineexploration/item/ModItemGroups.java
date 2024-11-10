package com.nilsen.divineexploration.item;

import com.nilsen.divineexploration.DivineExploration;
import com.nilsen.divineexploration.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup DIVINE_EXPLORATION_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(DivineExploration.MOD_ID, "divine_exploration_items"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.ROSE_QUARTZ_INGOT))
                    .displayName(Text.translatable("itemgroup.divineexploration.divine_exploration_item_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.ROSE_QUARTZ_INGOT);
                        entries.add(ModItems.ROSE_QUARTZ);

                        entries.add(ModBlocks.ROSE_QUARTZ_BLOCK);
                        entries.add(ModBlocks.RAW_ROSE_QUARTZ_BLOCK);
                        entries.add(ModBlocks.ROSE_QUARTZ_ORE);

                        entries.add(ModItems.FEATHER_OF_PURITY);
                        entries.add(ModItems.SHARD_OF_LIGHT);
                    }).build());

    public static void registerItemGroups() {
        DivineExploration.LOGGER.info("registering mod item groups for" + DivineExploration.MOD_ID);
    }

}
