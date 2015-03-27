package com.hirp.letsmodtutorial.item;

import com.hirp.letsmodtutorial.ability.Teleport;
import com.hirp.letsmodtutorial.creativetab.CreativeTabLMT;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemPsiSword extends ItemLMT
{
    public ItemPsiSword()
    {
        super();
        this.setUnlocalizedName("psiSword");
        this.maxStackSize = 1;
    }

    public ItemStack onItemRightClick(ItemStack psiSwordItemStack, World par2World, EntityPlayer selfPlayer)
    {
        if (!par2World.isRemote)
        {
            Teleport.teleport(selfPlayer);
            return psiSwordItemStack;
        }

        else
        {
            Teleport.teleport(selfPlayer);
            return psiSwordItemStack;
        }
    }
}
