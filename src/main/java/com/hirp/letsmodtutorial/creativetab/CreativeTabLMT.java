package com.hirp.letsmodtutorial.creativetab;

import com.hirp.letsmodtutorial.init.ModItems;
import com.hirp.letsmodtutorial.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabLMT
{
    public static final CreativeTabs LMT_TAB = new CreativeTabs(Reference.MOD_ID) {
        @Override
        public Item getTabIconItem() {
            return ModItems.psiCrystal;
        }

        @Override
    public String getTranslatedTabLabel()
        {
            return ("Psionic");
        }
    };
}
