package dev.destinysoul.infinitenightmare;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InfiniteNightmare implements ModInitializer {
	public static final String ModID = "infinite-nightmare";
	public static final Logger LOGGER = LoggerFactory.getLogger(ModID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Infinite Nightmare loaded successfully");
	}
}