package com.zz.LetMod;

import com.zz.LetMod.Proxy.IProxy;
import com.zz.LetMod.handler.ConfigurationHandler;
import com.zz.LetMod.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by zz on 2015/5/2.
 */

@Mod(modid = Reference.MOD_ID,name = Reference.MOD_NAME,version = Reference.MOD_VERSION)
public class InitLetMod {
    @Mod.Instance
    public static InitLetMod instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS,serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
    }
    @Mod.EventHandler
    public void Init(FMLInitializationEvent event){

    }
    @Mod.EventHandler
    public void posetInit(FMLPostInitializationEvent event){

    }
}
