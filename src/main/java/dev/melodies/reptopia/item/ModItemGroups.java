package dev.melodies.reptopia.item;

import dev.melodies.reptopia.Reptopia;
import dev.melodies.reptopia.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup MULCH_GROUP = Registry.register(Registries.ITEM_GROUP,
        new Identifier(Reptopia.MOD_ID,"mulch"),
        FabricItemGroup.builder().displayName(Text.translatable("itemGroup.mulch"))
        .icon(() -> new ItemStack(ModItems.MULCH)).entries((displayContext, entries) -> {
            entries.add(ModItems.MULCH);
            entries.add(ModBlocks.MULCH_BLOCK);
            entries.add(ModBlocks.HARDENED_MULCH_BLOCK);
        }).build());

    public static void registerItemGroups() {
        Reptopia.LOGGER.info("Registering item groups" + Reptopia.MOD_ID);
    }
}
