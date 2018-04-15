package me.droreo002.oreomod.manager;


import me.droreo002.oreomod.tabs.OreoTabs;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ModItems {

    public static final List<Item> ITEMS_LIST = new ArrayList<>();

    public static final Item SUPER_SWORD = new OreoItem("Super_Sword").setCreativeTab(OreoTabs.OREO_TAB);
    public static final Item RUBY = new OreoItem("Ruby").setCreativeTab(OreoTabs.OREO_TAB);
}
