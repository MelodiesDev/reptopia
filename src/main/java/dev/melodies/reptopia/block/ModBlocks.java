package dev.melodies.reptopia.block;

import dev.melodies.reptopia.Reptopia;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {


    public static final Block MULCH_BLOCK = registerBlock("mulch_block", new Block(FabricBlockSettings.copyOf(Blocks.CLAY)));
    public static final Block HARDENED_MULCH_BLOCK = registerBlock("hardened_mulch_block", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Reptopia.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, new Identifier(Reptopia.MOD_ID, name),
            new BlockItem(block, new FabricItemSettings()));
    }


    private static void addItemsToBlockTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(MULCH_BLOCK);
        entries.add(HARDENED_MULCH_BLOCK);
    }

    public static void registerModBlocks() {
        Reptopia.LOGGER.info("Registering mod blocks" + Reptopia.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(ModBlocks::addItemsToBlockTabItemGroup);
    }
}
