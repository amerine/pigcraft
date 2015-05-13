package com.adore.pigcraft.items;

import net.minecraft.item.Item;

/**
 * Created by amerine on 5/9/2015.
 */
public final class PigCraftItems {

    public static Item pigSword;

    public static void init() {
        pigSword = new PigSword();
    }
}
