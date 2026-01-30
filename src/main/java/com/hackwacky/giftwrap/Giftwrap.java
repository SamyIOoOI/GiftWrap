package com.hackwacky.giftwrap;

import com.hackwacky.giftwrap.block.ModBlocks;
import com.hackwacky.giftwrap.items.ModItems;
import com.hackwacky.giftwrap.world.gen.feature.ScrapGiftFeature;
import com.hackwacky.giftwrap.world.gen.feature.ScrapGiftFeatureConfig;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Giftwrap implements ModInitializer {
    public static final String MOD_ID = "giftwrap";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static final Identifier SCRAP_GIFT_FEATURE = Identifier.of("giftwrap", "scrap_gift");
    public static final ScrapGiftFeature SCRAP_GIFT = new ScrapGiftFeature(ScrapGiftFeatureConfig.CODEC);
    @Override
    public void onInitialize() {
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
        Registry.register(Registries.FEATURE,SCRAP_GIFT_FEATURE, SCRAP_GIFT);
        BiomeModifications.addFeature(
                BiomeSelectors.includeByKey(
                        BiomeKeys.FLOWER_FOREST
                ),
                GenerationStep.Feature.VEGETAL_DECORATION,
                RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(MOD_ID, "scrap_gift"))
        );
    }
}
