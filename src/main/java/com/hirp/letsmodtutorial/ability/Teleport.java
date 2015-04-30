package com.hirp.letsmodtutorial.ability;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MathHelper;

public class Teleport
{
    public static void teleport(EntityPlayer player)
    {
//        float distance = 5;
//        double x, y, z;
//
//        x = distance * MathHelper.sin(player.cameraPitch)*MathHelper.sin(player.cameraYaw);
//        y = distance * MathHelper.cos(player.cameraPitch);
//        z = distance * MathHelper.sin(player.cameraPitch)*MathHelper.sin(player.cameraYaw);
//
//        player.moveEntity(x, y, z);
        int distance = 5;
        float f1 = MathHelper.cos(-player.rotationYaw * 0.017453292F - (float)Math.PI);
        float f2 = MathHelper.sin(-player.rotationYaw * 0.017453292F - (float)Math.PI);
        float f3 = -MathHelper.cos(-player.rotationPitch * 0.017453292F);
        float f4 = MathHelper.sin(-player.rotationPitch * 0.017453292F);
        double i = player.posX;
        double j = player.posY;
        double k = player.posZ;
        player.moveEntity(distance * f2 * f3,
                distance * f4,
                distance * f1 * f3);
    }
}
