package me.droreo002.oreomod.manager;

import me.droreo002.oreomod.OreoMod;
import me.droreo002.oreomod.interfaces.IHasModel;
import me.droreo002.oreomod.tabs.OreoTabs;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class OreoItem extends Item implements IHasModel {

    OreoItem(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);

        ModItems.ITEMS_LIST.add(this);
    }

    @Override
    public void registerModel() {
        OreoMod.proxy.registerItemRenderer(this, 0, "inventory");
    }

}
