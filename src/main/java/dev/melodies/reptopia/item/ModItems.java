package dev.melodies.reptopia.item;

import dev.melodies.reptopia.Reptopia;
import dev.melodies.reptopia.item.custom.LizardLureItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item MORTAR_AND_PESTLE = registerItem("mortar_and_pestle", new Item(new FabricItemSettings()));
    public static final Item MEALWORM = registerItem("mealworm", new Item(new FabricItemSettings()));
    public static final Item HORNWORM = registerItem("hornworm", new Item(new FabricItemSettings()));
    public static final Item SNAIL = registerItem("snail", new Item(new FabricItemSettings()));
    public static final Item SNAIL_BUCKET = registerItem("snail_bucket", new Item(new FabricItemSettings()));
    public static final Item SNAIL_SPAWN_EGG = registerItem("snail_spawn_egg", new Item(new FabricItemSettings()));
    public static final Item CRICKET = registerItem("cricket", new Item(new FabricItemSettings()));
    public static final Item GRASSHOPPER = registerItem("grasshopper", new Item(new FabricItemSettings()));
    public static final Item ISOPOD = registerItem("isopod", new Item(new FabricItemSettings()));
    public static final Item ISOPOD_BUCKET = registerItem("isopod_bucket", new Item(new FabricItemSettings()));
    public static final Item ISOPOD_SPAWN_EGG = registerItem("isopod_spawn_egg", new Item(new FabricItemSettings()));
    public static final Item SPRINGTAIL = registerItem("springtail", new Item(new FabricItemSettings()));
    public static final Item REPTOPIA_BOOK = registerItem("reptopia_book", new Item(new FabricItemSettings()));
    public static final Item CALCIUM_POWDER = registerItem("calcium_powder", new Item(new FabricItemSettings()));
    public static final Item MULCH = registerItem("mulch", new Item(new FabricItemSettings()));

    public static final Item RAW_REPTONIUM = registerItem("raw_reptonium", new Item(new FabricItemSettings()));
    public static final Item REPTONIUM_INGOT = registerItem("reptonium_ingot", new Item(new FabricItemSettings()));
    public static final Item REPTONIUM_NUGGET = registerItem("reptonium_nugget", new Item(new FabricItemSettings()));

    public static final Item RAW_REPTILLIUM = registerItem("raw_reptillium", new Item(new FabricItemSettings()));
    public static final Item REPTILLIUM_INGOT = registerItem("reptillium_ingot", new Item(new FabricItemSettings()));
    public static final Item REPTILLIUM_NUGGET = registerItem("reptillium_nugget", new Item(new FabricItemSettings()));

    public static final Item LIZARD_LURE = registerItem("lizard_lure", new LizardLureItem(new FabricItemSettings()));

    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(GRASSHOPPER);
        entries.add(REPTOPIA_BOOK);
        entries.add(CALCIUM_POWDER);
        entries.add(MULCH);
        entries.add(RAW_REPTONIUM);
        entries.add(REPTONIUM_INGOT);
        entries.add(REPTONIUM_NUGGET);
        entries.add(RAW_REPTILLIUM);
        entries.add(REPTILLIUM_INGOT);
        entries.add(REPTILLIUM_NUGGET);
    }

    private static void addItemsToFoodTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(MEALWORM);
        entries.add(HORNWORM);
        entries.add(CRICKET);
        entries.add(ISOPOD);
        entries.add(SNAIL);
        entries.add(SPRINGTAIL);
    }

    private static void addItemsToToolsTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(MORTAR_AND_PESTLE);
        entries.add(ISOPOD_BUCKET);
        entries.add(SNAIL_BUCKET);
        entries.add(LIZARD_LURE);
    }

    private static void addItemsToSpawnEggTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(SNAIL_SPAWN_EGG);
        entries.add(ISOPOD_SPAWN_EGG);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Reptopia.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Reptopia.LOGGER.info("Registering Mod Items for" + Reptopia.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToFoodTabItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToToolsTabItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SPAWN_EGGS).register(ModItems::addItemsToSpawnEggTabItemGroup);
    }
}
