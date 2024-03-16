package dev.destinysoul.infinitenightmare.itemGroups;

import dev.destinysoul.infinitenightmare.InfiniteNightmare;
import dev.destinysoul.infinitenightmare.blocks.CommonBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class BlocksItemGroup {
    public static final ItemGroup BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(InfiniteNightmare.ModID, "blocks"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.blocks"))
                    .icon(() -> new ItemStack(Items.DIAMOND_PICKAXE)).entries((displayContext, entries) -> {
                        entries.add(Items.DIAMOND);
                        entries.add(CommonBlocks.UNDEFINED_BLOCK);
                    }).build());


    public static void registerItemGroups() {
        InfiniteNightmare.LOGGER.info("Registering BlocksItemGroups for " + InfiniteNightmare.ModID);
    }
}
