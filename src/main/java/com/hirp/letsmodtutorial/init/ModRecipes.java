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
        ItemStack psiCrsytalBlockStack = new ItemStack(ModBlocks.psiCrystalBlock);
        ItemStack psiCrsytalStack = new ItemStack(ModItems.psiCrystal);
        ItemStack stickStack = new ItemStack(Items.stick);
        ItemStack netherQuartzStack = new ItemStack(Items.quartz);

        GameRegistry.addRecipe(new ItemStack(ModItems.psiSword), " x ", " x ", " y ", 'x', psiCrsytalBlockStack, 'y', stickStack);
        GameRegistry.addSmelting(ModBlocks.psiCrystalBlock, psiCrsytalStack, 5);
    }
}
