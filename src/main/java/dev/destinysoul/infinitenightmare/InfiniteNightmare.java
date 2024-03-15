package dev.destinysoul.infinitenightmare;

import dev.destinysoul.infinitenightmare.blocks.CommonBlocks;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InfiniteNightmare implements ModInitializer {
	public static final String ModID = "infinite-nightmare";
	public static final Logger LOGGER = LoggerFactory.getLogger(ModID);

	@Override
	public void onInitialize() {
		CommonBlocks.registerCommonBlocks();
		LOGGER.info("Infinite Nightmare loaded successfully");
	}
}