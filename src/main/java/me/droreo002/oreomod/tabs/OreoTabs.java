package me.droreo002.oreomod.tabs;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.versioning.ComparableVersion;

public class OreoTabs {

    public static final CreativeTabs OREO_TAB = new CreativeTabs("Oreo Tab") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(Items.IRON_AXE);
        }
    };
}
