package fej.simplepaxels.paxels;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class StonePaxelMaterial implements ToolMaterial {
    public static final StonePaxelMaterial INSTANCE = new StonePaxelMaterial();
    @Override
    public int getDurability() {
        return 390;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 4;
    }

    @Override
    public float getAttackDamage() {
        return -1;
    }

    @Override
    public int getMiningLevel() {
        return 1;
    }

    @Override
    public int getEnchantability() {
        return 5;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.COBBLESTONE,Items.COBBLED_DEEPSLATE,Items.BLACKSTONE);
    }
}