package com.adore.pigcraft.recipes;

import com.adore.pigcraft.items.PigSword;
import com.adore.pigcraft.lib.Constants;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by amerine on 5/12/2015.
 */
public class PigCraftRecipes {

    public static void init() {
        GameRegistry.addRecipe(new ItemStack(GameRegistry.findItem(Constants.MODID, PigSword.name), 1),
                "A",
                "A",
                "B",
                'A', Items.porkchop,
                'B', Items.stick
        );
    }
}
