package com.hei.pubg_hei;

import com.hei.pubg_hei.common.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = PubgMain.MODID, name = PubgMain.NAME, version = PubgMain.VERSION, acceptedMinecraftVersions = "1.8.9")
public class PubgMain {

    @SidedProxy(clientSide = "com.hei.pubg_hei.client.ClientProxy",
            serverSide = "com.hei.pubg_hei.common.CommonProxy")
    public static CommonProxy proxy;

    public static final String MODID = "pubg_hei";
    public static final String NAME = "Pubg";
    public static final String VERSION = "1.0.0";

    @Instance(PubgMain.MODID)
    public static PubgMain instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
       proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }
}
