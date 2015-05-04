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

    public static boolean configValue = false;

    public static void init(File configFile){
        if (configuration == null){
            configuration = new Configuration(configFile);

        }

    }

    @Subscribe
    public void onConfigurationChangeEvent(ConfigChangedEvent.OnConfigChangedEvent event){
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID)){
             loadConfiguaration();
        }
    }
    public void loadConfiguaration(){
        configValue = configuration.getBoolean("configVaule",Configuration.CATEGORY_GENERAL,false,"this is an example configuration value");
        if (configuration.hasChanged()){
            configuration.save();
        }
    }
}
