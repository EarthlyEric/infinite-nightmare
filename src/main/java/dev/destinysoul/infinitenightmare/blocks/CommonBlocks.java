package dev.destinysoul.infinitenightmare.blocks;

import dev.destinysoul.infinitenightmare.sounds.BlockSoundsGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import dev.destinysoul.infinitenightmare.InfiniteNightmare;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class CommonBlocks {
    public static final Block UNDEFINED_BLOCK = registerBlock("undefined_block",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).sounds(BlockSoundsGroup.UNDEFINED_BLOCK_SOUNDS)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(InfiniteNightmare.ModID, name), block);
    }


    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, new Identifier(InfiniteNightmare.ModID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerCommonBlocks() {
        InfiniteNightmare.LOGGER.info("Registering commonBlocks for " + InfiniteNightmare.ModID);
    }
}
