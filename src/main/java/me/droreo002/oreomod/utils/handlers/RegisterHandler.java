package me.droreo002.oreomod.utils.handlers;

import me.droreo002.oreomod.interfaces.IHasModel;
import me.droreo002.oreomod.manager.ModItems;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class RegisterHandler {

    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> e) {
       for (Item item : ModItems.ITEMS_LIST) {
           e.getRegistry().register(item);
       }
    }

    @SubscribeEvent
    public static void onItemRegisterModel(ModelRegistryEvent e) {
        for (Item item : ModItems.ITEMS_LIST) {
            if (item instanceof IHasModel) {
                ((IHasModel)item).registerModel();
            }
        }
    }
}
