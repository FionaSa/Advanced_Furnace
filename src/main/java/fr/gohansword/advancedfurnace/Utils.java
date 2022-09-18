package fr.gohansword.advancedfurnace;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Utils {


    public static boolean isValidMaterial(ItemStack stack) {
        return (getSmeltedItemStack(stack) != null);
    }

    public static ItemStack getSmeltedItemStack(ItemStack itemStack) {
        switch (itemStack.getType()) {
            case PORKCHOP:
                return new ItemStack(Material.COOKED_PORKCHOP, itemStack.getAmount());
            case BEEF:
                return new ItemStack(Material.COOKED_BEEF, itemStack.getAmount());
            case CHICKEN:
                return new ItemStack(Material.COOKED_CHICKEN, itemStack.getAmount());
            case COD:
                return new ItemStack(Material.COOKED_COD, itemStack.getAmount());
            case SALMON:
                return new ItemStack(Material.COOKED_SALMON, itemStack.getAmount());
            case MUTTON:
                return new ItemStack(Material.COOKED_MUTTON, itemStack.getAmount());
            case POTATO:
                return new ItemStack(Material.BAKED_POTATO, itemStack.getAmount());
            case SANDSTONE:
                return new ItemStack(Material.SMOOTH_SANDSTONE, itemStack.getAmount());
            case RED_SANDSTONE:
                return new ItemStack(Material.SMOOTH_RED_SANDSTONE, itemStack.getAmount());
            case KELP:
                return new ItemStack(Material.DRIED_KELP, itemStack.getAmount());
            case IRON_ORE:
            case RAW_IRON:
            case DEEPSLATE_IRON_ORE:
                return new ItemStack(Material.IRON_INGOT, itemStack.getAmount());
            case GOLD_ORE:
            case RAW_GOLD:
            case DEEPSLATE_GOLD_ORE:
                return new ItemStack(Material.GOLD_INGOT, itemStack.getAmount());
            case RAW_COPPER:
            case COPPER_ORE:
            case DEEPSLATE_COPPER_ORE:
                return new ItemStack(Material.COPPER_INGOT, itemStack.getAmount());
            case SAND:
                return new ItemStack(Material.GLASS, itemStack.getAmount());
            case RED_SAND:
                return new ItemStack(Material.GLASS, itemStack.getAmount());
            case COBBLESTONE:
                return new ItemStack(Material.STONE, itemStack.getAmount());
            case CLAY_BALL:
                return new ItemStack(Material.BRICK, itemStack.getAmount());
            case NETHERRACK:
                return new ItemStack(Material.NETHER_BRICK, itemStack.getAmount());
            case CLAY:
                return new ItemStack(Material.TERRACOTTA, itemStack.getAmount());
            case STONE_BRICKS:
                return new ItemStack(Material.CRACKED_STONE_BRICKS, itemStack.getAmount());
            case BLACK_TERRACOTTA:
                return new ItemStack(Material.BLACK_GLAZED_TERRACOTTA, itemStack.getAmount());
            case BLUE_TERRACOTTA:
                return new ItemStack(Material.BLUE_GLAZED_TERRACOTTA, itemStack.getAmount());
            case BROWN_TERRACOTTA:
                return new ItemStack(Material.BROWN_GLAZED_TERRACOTTA, itemStack.getAmount());
            case CYAN_TERRACOTTA:
                return new ItemStack(Material.CYAN_GLAZED_TERRACOTTA, itemStack.getAmount());
            case GRAY_TERRACOTTA:
                return new ItemStack(Material.GRAY_GLAZED_TERRACOTTA, itemStack.getAmount());
            case GREEN_TERRACOTTA:
                return new ItemStack(Material.GREEN_GLAZED_TERRACOTTA, itemStack.getAmount());
            case LIGHT_BLUE_TERRACOTTA:
                return new ItemStack(Material.LIGHT_BLUE_GLAZED_TERRACOTTA, itemStack.getAmount());
            case LIGHT_GRAY_TERRACOTTA:
                return new ItemStack(Material.LIGHT_GRAY_GLAZED_TERRACOTTA, itemStack.getAmount());
            case LIME_TERRACOTTA:
                return new ItemStack(Material.LIME_GLAZED_TERRACOTTA, itemStack.getAmount());
            case MAGENTA_TERRACOTTA:
                return new ItemStack(Material.MAGENTA_GLAZED_TERRACOTTA, itemStack.getAmount());
            case ORANGE_TERRACOTTA:
                return new ItemStack(Material.ORANGE_GLAZED_TERRACOTTA, itemStack.getAmount());
            case PINK_TERRACOTTA:
                return new ItemStack(Material.PINK_GLAZED_TERRACOTTA, itemStack.getAmount());
            case PURPLE_TERRACOTTA:
                return new ItemStack(Material.PURPLE_GLAZED_TERRACOTTA, itemStack.getAmount());
            case RED_TERRACOTTA:
                return new ItemStack(Material.RED_GLAZED_TERRACOTTA, itemStack.getAmount());
            case WHITE_TERRACOTTA:
                return new ItemStack(Material.WHITE_GLAZED_TERRACOTTA, itemStack.getAmount());
            case YELLOW_TERRACOTTA:
                return new ItemStack(Material.YELLOW_GLAZED_TERRACOTTA, itemStack.getAmount());
            case DIAMOND_ORE:
                return new ItemStack(Material.DIAMOND, itemStack.getAmount());
            case LAPIS_ORE:
                return new ItemStack(Material.LAPIS_LAZULI, itemStack.getAmount());
            case REDSTONE_ORE:
                return new ItemStack(Material.REDSTONE, itemStack.getAmount());
            case COAL_ORE:
                return new ItemStack(Material.COAL, itemStack.getAmount());
            case EMERALD_ORE:
                return new ItemStack(Material.EMERALD, itemStack.getAmount());
            case NETHER_QUARTZ_ORE:
                return new ItemStack(Material.QUARTZ, itemStack.getAmount());
            case IRON_SWORD:
            case IRON_PICKAXE:
            case IRON_AXE:
            case IRON_SHOVEL:
            case IRON_HOE:
            case IRON_HORSE_ARMOR:
                return new ItemStack(Material.IRON_NUGGET, itemStack.getAmount());
            case GOLDEN_SWORD:
            case GOLDEN_PICKAXE:
            case GOLDEN_AXE:
            case GOLDEN_SHOVEL:
            case GOLDEN_HOE:
            case GOLDEN_HORSE_ARMOR:
                return new ItemStack(Material.GOLD_NUGGET, itemStack.getAmount());
            case CACTUS:
                return new ItemStack(Material.GREEN_DYE, itemStack.getAmount());
            case BIRCH_LOG:
            case SPRUCE_LOG:
            case OAK_LOG:
            case JUNGLE_LOG:
            case ACACIA_LOG:
            case DARK_OAK_LOG:
            case STRIPPED_ACACIA_LOG:
            case STRIPPED_ACACIA_WOOD:
            case STRIPPED_BIRCH_LOG:
            case STRIPPED_BIRCH_WOOD:
            case STRIPPED_DARK_OAK_LOG:
            case STRIPPED_DARK_OAK_WOOD:
            case STRIPPED_JUNGLE_WOOD:
            case STRIPPED_JUNGLE_LOG:
            case STRIPPED_OAK_WOOD:
            case STRIPPED_OAK_LOG:
            case STRIPPED_SPRUCE_LOG:
            case STRIPPED_SPRUCE_WOOD:
            case DARK_OAK_WOOD:
            case OAK_WOOD:
            case BIRCH_WOOD:
            case SPRUCE_WOOD:
            case JUNGLE_WOOD:
            case CRIMSON_STEM:
            case WARPED_STEM:
            case STRIPPED_CRIMSON_STEM:
            case STRIPPED_WARPED_STEM:
            case STRIPPED_CRIMSON_HYPHAE:
            case STRIPPED_WARPED_HYPHAE:
            case ACACIA_WOOD:
                return new ItemStack(Material.CHARCOAL, itemStack.getAmount());
            case CHORUS_FRUIT:
                return new ItemStack(Material.POPPED_CHORUS_FRUIT, itemStack.getAmount());
            case WET_SPONGE:
                return new ItemStack(Material.SPONGE, itemStack.getAmount());
            case NETHER_GOLD_ORE:
                return new ItemStack(Material.GOLD_INGOT, itemStack.getAmount());
            case POLISHED_BLACKSTONE_BRICKS:
                return new ItemStack(Material.CRACKED_POLISHED_BLACKSTONE_BRICKS, itemStack.getAmount());
            case SEA_PICKLE:
                return new ItemStack(Material.LIME_DYE, itemStack.getAmount());
            case STONE:
                return new ItemStack(Material.SMOOTH_STONE, itemStack.getAmount());
            case QUARTZ_BLOCK:
                return new ItemStack(Material.SMOOTH_QUARTZ, itemStack.getAmount());
            case NETHER_BRICK:
                return new ItemStack(Material.CRACKED_NETHER_BRICKS, itemStack.getAmount());
            case ANCIENT_DEBRIS:
                return new ItemStack(Material.NETHERITE_SCRAP, itemStack.getAmount());
            case RABBIT:
                return new ItemStack(Material.COOKED_RABBIT, itemStack.getAmount());
            case DEEPSLATE_COAL_ORE:
                return new ItemStack(Material.COAL, itemStack.getAmount());
            case DEEPSLATE_REDSTONE_ORE:
                return new ItemStack(Material.REDSTONE, itemStack.getAmount());
            case DEEPSLATE_EMERALD_ORE:
                return new ItemStack(Material.EMERALD, itemStack.getAmount());
            case DEEPSLATE_LAPIS_ORE:
                return new ItemStack(Material.LAPIS_LAZULI, itemStack.getAmount());
            case DEEPSLATE_DIAMOND_ORE:
                return new ItemStack(Material.DIAMOND, itemStack.getAmount());
            case DEEPSLATE_TILES:
                return new ItemStack(Material.CRACKED_DEEPSLATE_TILES, itemStack.getAmount());
            case COBBLED_DEEPSLATE:
                return new ItemStack(Material.DEEPSLATE, itemStack.getAmount());
        }
        return null;


    }
}
