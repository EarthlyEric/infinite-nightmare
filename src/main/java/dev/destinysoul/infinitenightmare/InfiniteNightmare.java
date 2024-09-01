package dev.destinysoul.infinitenightmare;

import dev.destinysoul.infinitenightmare.blocks.CommonBlocks;
import dev.destinysoul.infinitenightmare.itemGroups.BlocksItemGroup;
import dev.destinysoul.infinitenightmare.sounds.BlockSounds;
import dev.destinysoul.infinitenightmare.sounds.BlockSoundsGroup;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InfiniteNightmare implements ModInitializer {
	public static final String ModID = "infinite-nightmare";
	public static final Logger LOGGER = LoggerFactory.getLogger(ModID);

	public static final RegistryKey<PlacedFeature> BLOCK_GEN_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier("infinite-nightmare","block_gen"));

	@Override
	public void onInitialize() {
		CommonBlocks.registerCommonBlocks();
		BlocksItemGroup.registerItemGroups();
		BlockSounds.registerBlockSounds();
		BlockSoundsGroup.registerBlockSoundsGroup();
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, BLOCK_GEN_PLACED_KEY);
		LOGGER.info("Infinite Nightmare loaded successfully");
	}
}