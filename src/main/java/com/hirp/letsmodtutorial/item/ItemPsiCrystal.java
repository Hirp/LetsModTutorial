package com.hirp.letsmodtutorial.item;

import com.hirp.letsmodtutorial.creativetab.CreativeTabLMT;
import com.hirp.letsmodtutorial.reference.Reference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.List;

public class ItemPsiCrystal extends ItemLMT
{
    public ItemPsiCrystal()
    {
        super();
        this.setUnlocalizedName("psiCrystal");
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4)
    {
        list.add(String.valueOf(Reference.HEALTH));
    }

    public ItemStack onItemRightClick(ItemStack psicrystItemStack, World par2World, EntityPlayer selfPlayer)
    {
        if (selfPlayer.getHealth() > 0)
        {
            Reference.HEALTH = selfPlayer.getHealth();
            return  psicrystItemStack;
        }
        else
        {
            return psicrystItemStack;
        }
    }
}
