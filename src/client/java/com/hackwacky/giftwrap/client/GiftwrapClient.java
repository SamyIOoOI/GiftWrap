package com.hackwacky.giftwrap.client;

import com.hackwacky.giftwrap.block.ModBlocks;
import net.fabricmc.api.ClientModInitializer;

public class GiftwrapClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ModBlocks.registerModBlocks();
    }
}
