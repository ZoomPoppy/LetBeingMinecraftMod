package com.zz.LetMod.client.gui;

import com.zz.LetMod.handler.ConfigurationHandler;
import com.zz.LetMod.reference.Reference;
import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

/**
 * Created by zz on 2015/5/5.
 */

public class ModGuiConfig extends GuiConfig {


    public ModGuiConfig(GuiScreen guiScreen) {
        super(guiScreen,new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                Reference.MOD_ID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString() ));
    }
}
