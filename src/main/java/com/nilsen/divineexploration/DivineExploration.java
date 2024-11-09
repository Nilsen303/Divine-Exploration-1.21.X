package com.nilsen.divineexploration;

import com.nilsen.divineexploration.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DivineExploration implements ModInitializer {
	public static final String MOD_ID = "divineexploration";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();

		LOGGER.info("loaded fabric mod" + MOD_ID);
	}
}