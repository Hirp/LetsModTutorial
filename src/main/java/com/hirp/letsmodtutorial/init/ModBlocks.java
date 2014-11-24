package com.hirp.letsmodtutorial.init;

import com.hirp.letsmodtutorial.block.BlockLMT;
import com.hirp.letsmodtutorial.block.BlockPsiCrystal;
import com.hirp.letsmodtutorial.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockLMT psiCrystalBlock = new BlockPsiCrystal();

    public static void init()
    {
        GameRegistry.registerBlock(psiCrystalBlock, "psiCrystalBlock");
    }
}
