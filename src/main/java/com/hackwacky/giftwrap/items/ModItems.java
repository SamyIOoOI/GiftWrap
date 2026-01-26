package com.hackwacky.giftwrap.items;
import com.hackwacky.giftwrap.Giftwrap;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item GIFT_BUNDLE = registerItem("gift_bundle", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Giftwrap.MOD_ID, "gift_bundle")))));
    public static final Item GIFT_BLOCK = registerItem("gift_block", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Giftwrap.MOD_ID, "gift_block")))));
    public static final Item GIFT_WRAP = registerItem("gift_wrap", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Giftwrap.MOD_ID, "gift_wrap")))));
    public static final Item SMALL_GIFT = registerItem("small_gift", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Giftwrap.MOD_ID, "small_gift")))));
    public static final Item MEDIUM_GIFT = registerItem("medium_gift", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Giftwrap.MOD_ID, "medium_gift")))));
    public static final Item LARGE_GIFT = registerItem("large_gift", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Giftwrap.MOD_ID, "large_gift")))));
    public static final Item WRAPPED_DIAMOND_SWORD = registerItem("wrapped_diamond_sword", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Giftwrap.MOD_ID, "wrapped_diamond_sword")))));
    public static final Item WRAPPED_DIAMOND_AXE = registerItem("wrapped_diamond_axe", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Giftwrap.MOD_ID, "wrapped_diamond_axe")))));
    public static final Item WRAPPED_DIAMOND_PICKAXE = registerItem("wrapped_diamond_pickaxe", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Giftwrap.MOD_ID, "wrapped_diamond_pickaxe")))));
    public static final Item WRAPPED_DIAMOND_SHOVEL = registerItem("wrapped_diamond_shovel", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Giftwrap.MOD_ID, "wrapped_diamond_shovel")))));
    public static final Item WRAPPED_GOLDEN_SWORD = registerItem("wrapped_golden_sword", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Giftwrap.MOD_ID, "wrapped_golden_sword")))));
    public static final Item WRAPPED_GOLDEN_AXE = registerItem("wrapped_golden_axe", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Giftwrap.MOD_ID, "wrapped_golden_axe")))));
    public static final Item WRAPPED_GOLDEN_PICKAXE = registerItem("wrapped_golden_pickaxe", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Giftwrap.MOD_ID, "wrapped_golden_pickaxe")))));
    public static final Item WRAPPED_GOLDEN_SHOVEL = registerItem("wrapped_golden_shovel", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Giftwrap.MOD_ID, "wrapped_golden_shovel")))));
    public static final Item WRAPPED_IRON_SWORD = registerItem("wrapped_iron_sword", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Giftwrap.MOD_ID, "wrapped_iron_sword")))));
    public static final Item WRAPPED_IRON_AXE = registerItem("wrapped_iron_axe", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Giftwrap.MOD_ID, "wrapped_iron_axe")))));
    public static final Item WRAPPED_IRON_PICKAXE = registerItem("wrapped_iron_pickaxe", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Giftwrap.MOD_ID, "wrapped_iron_pickaxe")))));
    public static final Item WRAPPED_IRON_SHOVEL = registerItem("wrapped_iron_shovel", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Giftwrap.MOD_ID, "wrapped_iron_shovel")))));
    public static final Item WRAPPED_STONE_SWORD = registerItem("wrapped_stone_sword", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Giftwrap.MOD_ID, "wrapped_stone_sword")))));
    public static final Item WRAPPED_STONE_AXE = registerItem("wrapped_stone_axe", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Giftwrap.MOD_ID, "wrapped_stone_axe")))));
    public static final Item WRAPPED_STONE_PICKAXE = registerItem("wrapped_stone_pickaxe", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Giftwrap.MOD_ID, "wrapped_stone_pickaxe")))));
    public static final Item WRAPPED_STONE_SHOVEL = registerItem("wrapped_stone_shovel", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Giftwrap.MOD_ID, "wrapped_stone_shovel")))));
    public static final Item WRAPPED_WOODEN_SWORD = registerItem("wrapped_wooden_sword", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Giftwrap.MOD_ID, "wrapped_wooden_sword")))));
    public static final Item WRAPPED_WOODEN_AXE = registerItem("wrapped_wooden_axe", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Giftwrap.MOD_ID, "wrapped_wooden_axe")))));
    public static final Item WRAPPED_WOODEN_PICKAXE = registerItem("wrapped_wooden_pickaxe", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Giftwrap.MOD_ID, "wrapped_wooden_pickaxe")))));
    public static final Item WRAPPED_WOODEN_SHOVEL = registerItem("wrapped_wooden_shovel", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Giftwrap.MOD_ID, "wrapped_wooden_shovel")))));
    public static final Item WRAPPED_WAND = registerItem("wrapped_wand", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Giftwrap.MOD_ID, "wrapped_wand")))));
    public static final Item WRAPPED_DIAMOND_HOE = registerItem("wrapped_diamond_hoe", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Giftwrap.MOD_ID, "wrapped_diamond_hoe")))));
    public static final Item WRAPPED_GOLDEN_HOE = registerItem("wrapped_golden_hoe", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Giftwrap.MOD_ID, "wrapped_golden_hoe")))));
    public static final Item WRAPPED_IRON_HOE = registerItem("wrapped_iron_hoe", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Giftwrap.MOD_ID, "wrapped_iron_hoe")))));
    public static final Item WRAPPED_STONE_HOE = registerItem("wrapped_stone_hoe", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Giftwrap.MOD_ID, "wrapped_stone_hoe")))));
    public static final Item WRAPPED_WOODEN_HOE = registerItem("wrapped_wooden_hoe", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Giftwrap.MOD_ID, "wrapped_wooden_hoe")))));
    public static final Item WRAPPED_NETHERITE_SWORD = registerItem("wrapped_netherite_sword", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Giftwrap.MOD_ID, "wrapped_netherite_sword")))));
    public static final Item WRAPPED_NETHERITE_AXE = registerItem("wrapped_netherite_axe", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Giftwrap.MOD_ID, "wrapped_netherite_axe")))));
    public static final Item WRAPPED_NETHERITE_PICKAXE = registerItem("wrapped_netherite_pickaxe", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Giftwrap.MOD_ID, "wrapped_netherite_pickaxe")))));
    public static final Item WRAPPED_NETHERITE_SHOVEL = registerItem("wrapped_netherite_shovel", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Giftwrap.MOD_ID, "wrapped_netherite_shovel")))));
    public static final Item WRAPPED_NETHERITE_HOE = registerItem("wrapped_netherite_hoe", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Giftwrap.MOD_ID, "wrapped_netherite_hoe")))));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Giftwrap.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(GIFT_BUNDLE);
            entries.add(GIFT_WRAP);
            entries.add(GIFT_BLOCK);
            entries.add(SMALL_GIFT);
            entries.add(MEDIUM_GIFT);
            entries.add(LARGE_GIFT);
            entries.add(WRAPPED_WAND);
            entries.add(WRAPPED_DIAMOND_SWORD);
            entries.add(WRAPPED_DIAMOND_AXE);
            entries.add(WRAPPED_DIAMOND_PICKAXE);
            entries.add(WRAPPED_DIAMOND_SHOVEL);
            entries.add(WRAPPED_GOLDEN_SWORD);
            entries.add(WRAPPED_GOLDEN_AXE);
            entries.add(WRAPPED_GOLDEN_PICKAXE);
            entries.add(WRAPPED_GOLDEN_SHOVEL);
            entries.add(WRAPPED_IRON_SWORD);
            entries.add(WRAPPED_IRON_AXE);
            entries.add(WRAPPED_IRON_PICKAXE);
            entries.add(WRAPPED_IRON_SHOVEL);
            entries.add(WRAPPED_STONE_SWORD);
            entries.add(WRAPPED_STONE_AXE);
            entries.add(WRAPPED_STONE_PICKAXE);
            entries.add(WRAPPED_STONE_SHOVEL);
            entries.add(WRAPPED_WOODEN_SWORD);
            entries.add(WRAPPED_WOODEN_AXE);
            entries.add(WRAPPED_WOODEN_PICKAXE);
            entries.add(WRAPPED_WOODEN_SHOVEL);
            entries.add(WRAPPED_DIAMOND_HOE);
            entries.add(WRAPPED_GOLDEN_HOE);
            entries.add(WRAPPED_IRON_HOE);
            entries.add(WRAPPED_STONE_HOE);
            entries.add(WRAPPED_WOODEN_HOE);
            entries.add(WRAPPED_NETHERITE_SWORD);
            entries.add(WRAPPED_NETHERITE_AXE);
            entries.add(WRAPPED_NETHERITE_PICKAXE);
            entries.add(WRAPPED_NETHERITE_SHOVEL);
            entries.add(WRAPPED_NETHERITE_HOE);
        });
    }
}
