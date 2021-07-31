package me.youhavetrouble.itemvoid;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class VoidInventoryListener implements Listener {

    @EventHandler(priority = EventPriority.HIGH, ignoreCancelled = true)
    public void onVoidInventoryClick(InventoryClickEvent event) {

        // return if clicked outside of inventory
        if (event.getClickedInventory() == null) return;

        //return if holder is not void
        if (!(event.getClickedInventory().getHolder() instanceof VoidHolder)) return;

        // cancel event if item to swap is null or air (when clicked slot is empty) so players can only get items and not deposit them
        if (event.getCurrentItem() == null || event.getCurrentItem().getType().equals(Material.AIR)) {
            event.setCancelled(true);
            return;
        }

        // TODO see if more actions need to be blocked

    }

}
