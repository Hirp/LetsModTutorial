package com.hirp.letsmodtutorial.init;

import com.hirp.letsmodtutorial.item.ItemLMT;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ModRecipes
{
    public static void init()
    {
        ItemStack psiCrsytalStack = new ItemStack(ModBlocks.psiCrystalBlock);
        ItemStack stickStack = new ItemStack(Items.stick);

        GameRegistry.addRecipe(new ItemStack(ModItems.psiSword), " x ", " x ", " y ", 'x', psiCrsytalStack, 'y', stickStack);
    }
}
