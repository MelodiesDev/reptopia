package dev.melodies.reptopia;

import dev.melodies.reptopia.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Reptopia implements ModInitializer {
	public static final String MOD_ID = "reptopia";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();


		LOGGER.info("Hello Fabric world!");
	}
}