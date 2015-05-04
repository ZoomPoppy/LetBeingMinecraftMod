package com.zz.LetMod.handler;

import com.google.common.eventbus.Subscribe;
import com.zz.LetMod.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by zz on 2015/5/4.
 */
public class ConfigurationHandler {

    public static Configuration configuration;


    public static void init(File configFile){

        configuration = new Configuration(configFile);

        boolean configValue = false;
        try {
            //load
            configuration.load();
             configValue = configuration.get(configuration.CATEGORY_GENERAL,
                    "comfigValue",true,"this is an example config value").getBoolean(true);
        }catch(Exception e){
            //log the exception
        }
        finally {
            //save the handler file
            if (configuration.hasChanged()){
                configuration.save();

            }
        }
    }
    @Subscribe
    public void onConfigurationChangeEvent(ConfigChangedEvent.OnConfigChangedEvent event){
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID)){
            //resync configs
        }
    }
}
