package com.hirp.letsmodtutorial;

import com.hirp.letsmodtutorial.proxy.IProxy;
import com.hirp.letsmodtutorial.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)

public class LetsModTutorial
{
    @Mod.Instance(Reference.MOD_ID)
    public static LetsModTutorial instance;

    @SidedProxy(clientSide = "com.hirp.letsmodtutorial.proxy.ClientProxy", serverSide = "com.hirp.letsmodtutorial.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public  void post(FMLPostInitializationEvent event)
    {

    }
}