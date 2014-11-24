package com.hirp.letsmodtutorial;

import com.hirp.letsmodtutorial.handler.ConfigurationHandler;
import com.hirp.letsmodtutorial.init.ModBlocks;
import com.hirp.letsmodtutorial.init.ModItems;
import com.hirp.letsmodtutorial.proxy.IProxy;
import com.hirp.letsmodtutorial.reference.Reference;
import com.hirp.letsmodtutorial.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)

public class LetsModTutorial
{
    @Mod.Instance(Reference.MOD_ID)
    public static LetsModTutorial instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        LogHelper.info("Pre initialization Complete");

        ModItems.init();
        ModBlocks.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        LogHelper.info("Initialization Complete");
    }

    @Mod.EventHandler
    public  void post(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initialization Complete");
    }
}