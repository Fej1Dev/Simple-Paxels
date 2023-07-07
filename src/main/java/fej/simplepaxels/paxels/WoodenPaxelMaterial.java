package fej.simplepaxels.paxels;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class WoodenPaxelMaterial implements ToolMaterial {

    public static final WoodenPaxelMaterial INSTANCE = new WoodenPaxelMaterial();

    @Override
    public int getDurability() {
        return 170;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 2;
    }

    @Override
    public float getAttackDamage() {
        return -1;
    }

    @Override
    public int getMiningLevel() {
        return 0;
    }

    @Override
    public int getEnchantability() {
        return 15;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.ACACIA_PLANKS,Items.OAK_PLANKS,Items.BAMBOO_PLANKS,Items.BIRCH_PLANKS,Items.CHERRY_PLANKS,Items.CRIMSON_PLANKS
                ,Items.DARK_OAK_PLANKS,Items.JUNGLE_PLANKS,Items.MANGROVE_PLANKS,Items.SPRUCE_PLANKS,Items.WARPED_PLANKS);
    }
}