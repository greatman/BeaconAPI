/* The MIT License (MIT)
 *
 * Copyright (c) 2015 BeaconPowered
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */

package com.beaconpowered.api.item;

/**
 * Represents available item types
 */
public enum ItemType {
    STONE,
    GRASS,
    DIRT,
    COBBLESTONE,
    PLANKS,
    SAPLING,
    BEDROCK,
    SAND,
    GRAVEL,
    GOLD_ORE,
    IRON_ORE,
    COAL_ORE,
    LOG,
    LOG2,
    LEAVES,
    LEAVES2,
    SPONGE,
    GLASS,
    LAPIS_ORE,
    LAPIS_BLOCK,
    DISPENSER,
    SANDSTONE,
    NOTEBLOCK,
    GOLDEN_RAIL,
    DETECTOR_RAIL,
    STICKY_PISTON,
    WEB,
    TALLGRASS,
    DEADBUSH,
    PISTON,
    WOOL,
    YELLOW_FLOWER,
    RED_FLOWER,
    BROWN_MUSHROOM,
    RED_MUSHROOM,
    GOLD_BLOCK,
    IRON_BLOCK,
    STONE_SLAB,
    BRICK_BLOCK,
    TNT,
    BOOKSHELF,
    MOSSY_COBBLESTONE,
    OBSIDIAN,
    TORCH,
    MOB_SPAWNER,
    OAK_STAIRS,
    CHEST,
    DIAMOND_ORE,
    DIAMOND_BLOCK,
    CRAFTING_TABLE,
    FARMLAND,
    FURNACE,
    LIT_FURNACE,
    LADDER,
    RAIL,
    STONE_STAIRS,
    LEVER,
    STONE_PRESSURE_PLATE,
    WOODEN_PRESSURE_PLATE,
    REDSTONE_ORE,
    REDSTONE_TORCH,
    STONE_BUTTON,
    SNOW_LAYER,
    ICE,
    SNOW,
    CACTUS,
    CLAY,
    JUKEBOX,
    FENCE,
    SPRUCE_FENCE,
    BIRCH_FENCE,
    JUNGLE_FENCE,
    DARK_OAK_FENCE,
    ACACIA_FENCE,
    PUMPKIN,
    NETHERRACK,
    SOUL_SAND,
    GLOWSTONE,
    LIT_PUMPKIN,
    TRAPDOOR,
    MONSTER_EGG,
    STONEBRICK,
    BROWN_MUSHROOM_BLOCK,
    RED_MUSHROOM_BLOCK,
    IRON_BARS,
    GLASS_PANE,
    MELON_BLOCK,
    VINE,
    FENCE_GATE,
    SPRUCE_FENCE_GATE,
    BIRCH_FENCE_GATE,
    JUNGLE_FENCE_GATE,
    DARK_OAK_FENCE_GATE,
    ACACIA_FENCE_GATE,
    BRICK_STAIRS,
    STONE_BRICK_STAIRS,
    MYCELIUM,
    WATERLILY,
    NETHER_BRICK,
    NETHER_BRICK_FENCE,
    NETHER_BRICK_STAIRS,
    ENCHANTING_TABLE,
    END_PORTAL_FRAME,
    END_STONE,
    DRAGON_EGG,
    REDSTONE_LAMP,
    WOODEN_SLAB,
    SANDSTONE_STAIRS,
    EMERALD_ORE,
    ENDER_CHEST,
    TRIPWIRE_HOOK,
    EMERALD_BLOCK,
    SPRUCE_STAIRS,
    BIRCH_STAIRS,
    JUNGLE_STAIRS,
    COMMAND_BLOCK,
    BEACON,
    COBBLESTONE_WALL,
    WOODEN_BUTTON,
    ANVIL,
    TRAPPED_CHEST,
    LIGHT_WEIGHTED_PRESSURE_PLATE,
    HEAVY_WEIGHTED_PRESSURE_PLATE,
    DAYLIGHT_DETECTOR,
    REDSTONE_BLOCK,
    QUARTZ_ORE,
    HOPPER,
    QUARTZ_BLOCK,
    QUARTZ_STAIRS,
    ACTIVATOR_RAIL,
    DROPPER,
    STAINED_HARDENED_CLAY,
    BARRIER,
    IRON_TRAPDOOR,
    HAY_BLOCK,
    CARPET,
    HARDENED_CLAY,
    COAL_BLOCK,
    PACKED_ICE,
    ACACIA_STAIRS,
    DARK_OAK_STAIRS,
    SLIME,
    DOUBLE_PLANT,
    STAINED_GLASS,
    STAINED_GLASS_PANE,
    PRISMARINE,
    SEA_LANTERN,
    RED_SANDSTONE,
    RED_SANDSTONE_STAIRS,
    STONE_SLAB2,
    IRON_SHOVEL,
    IRON_PICKAXE,
    IRON_AXE,
    FLINT_AND_STEEL,
    APPLE,
    BOW,
    ARROW,
    COAL,
    DIAMOND,
    IRON_INGOT,
    GOLD_INGOT,
    IRON_SWORD,
    WOODEN_SWORD,
    WOODEN_SHOVEL,
    WOODEN_PICKAXE,
    WOODEN_AXE,
    STONE_SWORD,
    STONE_SHOVEL,
    STONE_PICKAXE,
    STONE_AXE,
    DIAMOND_SWORD,
    DIAMOND_SHOVEL,
    DIAMOND_PICKAXE,
    DIAMOND_AXE,
    STICK,
    BOWL,
    MUSHROOM_STEW,
    GOLDEN_SWORD,
    GOLDEN_SHOVEL,
    GOLDEN_PICKAXE,
    GOLDEN_AXE,
    STRING,
    FEATHER,
    GUNPOWDER,
    WOODEN_HOE,
    STONE_HOE,
    IRON_HOE,
    DIAMOND_HOE,
    GOLDEN_HOE,
    WHEAT_SEEDS,
    WHEAT,
    BREAD,
    LEATHER_HELMET,
    LEATHER_CHESTPLATE,
    LEATHER_LEGGINGS,
    LEATHER_BOOTS,
    CHAINMAIL_HELMET,
    CHAINMAIL_CHESTPLATE,
    CHAINMAIL_LEGGINGS,
    CHAINMAIL_BOOTS,
    IRON_HELMET,
    IRON_CHESTPLATE,
    IRON_LEGGINGS,
    IRON_BOOTS,
    DIAMOND_HELMET,
    DIAMOND_CHESTPLATE,
    DIAMOND_LEGGINGS,
    DIAMOND_BOOTS,
    GOLDEN_HELMET,
    GOLDEN_CHESTPLATE,
    GOLDEN_LEGGINGS,
    GOLDEN_BOOTS,
    FLINT,
    PORKCHOP,
    COOKED_PORKCHOP,
    PAINTING,
    GOLDEN_APPLE,
    SIGN,
    WOODEN_DOOR,
    BUCKET,
    WATER_BUCKET,
    LAVA_BUCKET,
    MINECART,
    SADDLE,
    IRON_DOOR,
    REDSTONE,
    SNOWBALL,
    BOAT,
    LEATHER,
    MILK_BUCKET,
    BRICK,
    CLAY_BALL,
    REEDS,
    PAPER,
    BOOK,
    SLIME_BALL,
    CHEST_MINECART,
    FURNACE_MINECART,
    EGG,
    COMPASS,
    FISHING_ROD,
    CLOCK,
    GLOWSTONE_DUST,
    FISH,
    COOKED_FISH,
    DYE,
    BONE,
    SUGAR,
    CAKE,
    BED,
    REPEATER,
    COOKIE,
    FILLED_MAP,
    SHEARS,
    MELON,
    PUMPKIN_SEEDS,
    MELON_SEEDS,
    BEEF,
    COOKED_BEEF,
    CHICKEN,
    COOKED_CHICKEN,
    ROTTEN_FLESH,
    ENDER_PEARL,
    BLAZE_ROD,
    GHAST_TEAR,
    GOLD_NUGGET,
    NETHER_WART,
    POTION,
    GLASS_BOTTLE,
    SPIDER_EYE,
    FERMENTED_SPIDER_EYE,
    BLAZE_POWDER,
    MAGMA_CREAM,
    BREWING_STAND,
    CAULDRON,
    ENDER_EYE,
    SPECKLED_MELON,
    SPAWN_EGG,
    EXPERIENCE_BOTTLE,
    FIRE_CHARGE,
    WRITABLE_BOOK,
    WRITTEN_BOOK,
    EMERALD,
    ITEM_FRAME,
    FLOWER_POT,
    CARROT,
    POTATO,
    BAKED_POTATO,
    POISONOUS_POTATO,
    MAP,
    GOLDEN_CARROT,
    SKULL,
    CARROT_ON_A_STICK,
    NETHER_STAR,
    PUMPKIN_PIE,
    FIREWORKS,
    FIREWORK_CHARGE,
    ENCHANTED_BOOK,
    COMPARATOR,
    NETHERBRICK,
    QUARTZ,
    TNT_MINECART,
    HOPPER_MINECART,
    PRISMARINE_SHARD,
    PRISMARINE_CRYSTALS,
    RABBIT,
    COOKED_RABBIT,
    RABBIT_STEW,
    RABBIT_FOOT,
    RABBIT_HIDE,
    ARMOR_STAND,
    IRON_HORSE_ARMOR,
    GOLDEN_HORSE_ARMOR,
    DIAMOND_HORSE_ARMOR,
    LEAD,
    NAME_TAG,
    COMMAND_BLOCK_MINECART,
    MUTTON,
    COOKED_MUTTON,
    BANNER,
    SPRUCE_DOOR,
    BIRCH_DOOR,
    JUNGLE_DOOR,
    ACACIA_DOOR,
    DARK_OAK_DOOR,
    RECORD_13,
    RECORD_CAT,
    RECORD_BLOCKS,
    RECORD_CHIRP,
    RECORD_FAR,
    RECORD_MALL,
    RECORD_MELLOHI,
    RECORD_STAL,
    RECORD_STRAD,
    RECORD_WARD,
    RECORD_11,
    RECORD_WAIT,
}
