package com.hackwacky.giftwrap.world.gen.feature;

import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Heightmap;
import net.minecraft.world.StructureWorldAccess;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.util.FeatureContext;
import net.minecraft.util.math.random.Random;

public class ScrapGiftFeature extends Feature<ScrapGiftFeatureConfig> {
    public ScrapGiftFeature(Codec<ScrapGiftFeatureConfig> configCodec) {
        super(configCodec);
    }

    @Override
    public boolean generate(FeatureContext<ScrapGiftFeatureConfig> context) {
        StructureWorldAccess world;
        world = context.getWorld();
        BlockPos origin = context.getOrigin();
        Random random = context.getRandom();
        ScrapGiftFeatureConfig config;
        config = context.getConfig();

        int number = config.number();
        Identifier blockId = config.blockId();

        BlockState blockState = Registries.BLOCK.get(blockId).getDefaultState();
        if (blockState == null) throw new IllegalStateException(blockId + " could not be parsed to a valid block identifier!");

        BlockPos surfacePos = world.getTopPosition(
                Heightmap.Type.WORLD_SURFACE_WG,
                origin
        );
        if (world.isAir(surfacePos)){
            world.setBlockState(surfacePos, blockState, 0x10);
            return true;
        }
        return false;
    }
}