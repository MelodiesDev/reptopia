package dev.melodies.reptopia.item.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

import java.util.List;

public class LizardLureItem extends Item {
    public LizardLureItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if (context.getWorld().isClient()) return ActionResult.SUCCESS;
        if (context.getSide() != Direction.UP) return ActionResult.FAIL;
        BlockPos posClicked = context.getBlockPos();
        BlockState state = context.getWorld().getBlockState(posClicked);
            // If the block isn't air, then place a candle on the block.
            if(state.getBlock() != Blocks.AIR) {
                context.getWorld().setBlockState(posClicked.up(), Blocks.CANDLE.getDefaultState());
                context.getStack().decrement(1);
            }
        return ActionResult.SUCCESS;
    }
    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tooltip.reptopia.lizard_lure.tooltip"));
        super.appendTooltip(stack, world, tooltip, context);

    }
}
