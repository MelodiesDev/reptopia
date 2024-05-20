package dev.melodies.reptopia.item;

import dev.melodies.reptopia.Reptopia;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
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
    public static final Item HEAT_LAMP = registerItem("heat_lamp", new Item(new FabricItemSettings()));
    public static final Item REPTOPIA_BOOK = registerItem("reptopia_book", new Item(new FabricItemSettings()));
    public static final Item CALCIUM_POWDER = registerItem("calcium_powder", new Item(new FabricItemSettings()));
    public static final Item MULCH = registerItem("mulch", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(MEALWORM);
        entries.add(HORNWORM);
        entries.add(SNAIL);
        entries.add(SNAIL_BUCKET);
        entries.add(SNAIL_SPAWN_EGG);
        entries.add(CRICKET);
        entries.add(GRASSHOPPER);
        entries.add(ISOPOD);
        entries.add(ISOPOD_BUCKET);
        entries.add(ISOPOD_SPAWN_EGG);
        entries.add(SPRINGTAIL);
        entries.add(HEAT_LAMP);
        entries.add(REPTOPIA_BOOK);
        entries.add(CALCIUM_POWDER);
        entries.add(MULCH);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Reptopia.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Reptopia.LOGGER.info("Registering Mod Items for" + Reptopia.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}
