package me.youhavetrouble.itemvoid;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ItemDespawnEvent;

public class ItemDisappearListener implements Listener {

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onItemDespawn(ItemDespawnEvent event) {
        ItemVoid.getInstance().getVoidHolder().addItemToVoid(event.getEntity().getItemStack());
    }

}
