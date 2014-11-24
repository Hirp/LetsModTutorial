package com.hirp.letsmodtutorial.init;

import com.hirp.letsmodtutorial.item.ItemLMT;
import com.hirp.letsmodtutorial.item.ItemPsiCrystal;
import com.hirp.letsmodtutorial.item.ItemPsiSword;
import com.hirp.letsmodtutorial.item.ItemTransparentTest;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemLMT psiSword = new ItemPsiSword();
    public static final ItemLMT transparentTest = new ItemTransparentTest();
    public static final ItemLMT psiCrystal = new ItemPsiCrystal();

    public static void init()
    {
        GameRegistry.registerItem(psiSword, "psiSword");
        GameRegistry.registerItem(transparentTest, "transparentTest");
        GameRegistry.registerItem(psiCrystal, "psiCrystal");
    }
}
