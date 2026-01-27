package com.hackwacky.giftwrap.item.custom;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.world.World;

import java.util.Map;

public class GiftWand extends Item {
    private static final Map<Block, Block> WAND_MAP =
            Map.of(
                    Blocks.OAK_LOG, Blocks.AMETHYST_BLOCK,
                    Blocks.COAL_ORE, Blocks.DIAMOND_BLOCK,
                    Blocks.NETHER_GOLD_ORE, Blocks.GOLD_BLOCK

            );
    public GiftWand(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        Block clickedBlock = world.getBlockState(context.getBlockPos()).getBlock();

        return super.useOnBlock(context);
    }
}
