package com.hackwacky.giftwrap.world.gen.feature;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.Identifier;
import net.minecraft.util.dynamic.Codecs;
import net.minecraft.world.gen.feature.FeatureConfig;

public record ScrapGiftFeatureConfig(int number, Identifier blockId) implements FeatureConfig {
    public static final Codec<ScrapGiftFeatureConfig> CODEC = RecordCodecBuilder.create(
            instance -> instance.group(
                            Codecs.POSITIVE_INT.fieldOf("number").forGetter(ScrapGiftFeatureConfig::number),
                            Identifier.CODEC.fieldOf("blockID").forGetter(ScrapGiftFeatureConfig::blockId))
                    .apply(instance, ScrapGiftFeatureConfig::new));
}