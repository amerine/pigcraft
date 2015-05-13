package com.adore.pigcraft;

import com.adore.pigcraft.items.PigCraftItems;
import com.adore.pigcraft.lib.Constants;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;


/**
 * Created by amerine on 5/9/2015.
 */
@Mod(modid = Constants.MODID, name = Constants.MODNAME, version = Constants.VERSION)
public class PigCraft {

    @Mod.EventHandler
    public void preInit(FMLInitializationEvent event) {
        PigCraftItems.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
    }

    @Mod.EventHandler
    public void postInit(FMLInitializationEvent event) {
    }
}
