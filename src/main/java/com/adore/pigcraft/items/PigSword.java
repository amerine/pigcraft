package com.adore.pigcraft.items;

import com.adore.pigcraft.lib.Constants;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by amerine on 5/9/2015.
 */
public class PigSword extends ItemSword {

    public String name = "pigsword";
    public static ToolMaterial PigSwordMaterial = EnumHelper.addToolMaterial("PigSwordMaterial", 0, 99999, 1.0F, 1000.0F, 100);
    public static ModelResourceLocation PigSwordResourceLocation = new ModelResourceLocation("pigcraft:pigsword", "inventory");

    public PigSword() {
        super(PigSwordMaterial);
        setUnlocalizedName(Constants.MODID + "_" + name);
        GameRegistry.registerItem(this, name);
        setCreativeTab(CreativeTabs.tabCombat);
        final int DEFAULT_ITEM_SUBTYPE = 0;
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(this, DEFAULT_ITEM_SUBTYPE, PigSwordResourceLocation);
    }
}
