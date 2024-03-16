package dev.destinysoul.infinitenightmare;

import dev.destinysoul.infinitenightmare.blocks.CommonBlocks;
import dev.destinysoul.infinitenightmare.itemGroups.BlocksItemGroup;
import dev.destinysoul.infinitenightmare.sounds.BlockSounds;
import dev.destinysoul.infinitenightmare.sounds.BlockSoundsGroup;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InfiniteNightmare implements ModInitializer {
	public static final String ModID = "infinite-nightmare";
	public static final Logger LOGGER = LoggerFactory.getLogger(ModID);

	@Override
	public void onInitialize() {
		CommonBlocks.registerCommonBlocks();
		BlocksItemGroup.registerItemGroups();
		BlockSounds.registerBlockSounds();
		BlockSoundsGroup.registerBlockSoundsGroup();
		LOGGER.info("Infinite Nightmare loaded successfully");
	}
}