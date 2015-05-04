package com.zz.LetMod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by zz on 2015/5/2.
 */

@Mod(modid = "LetMod",name = "let mod",version = "1.7.10-1.0")
public class InitLetMod {
    @Mod.Instance
    public static InitLetMod instance;
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){

    }
    @Mod.EventHandler
    public void Init(FMLInitializationEvent event){

    }
    @Mod.EventHandler
    public void posetInit(FMLPostInitializationEvent event){

    }
}
