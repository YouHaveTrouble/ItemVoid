package me.youhavetrouble.itemvoid;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;

public class VoidHolder implements InventoryHolder {

    private final Inventory inventory;

    protected VoidHolder() {
        inventory = Bukkit.createInventory(this, 6*9, Component.text("Void").color(NamedTextColor.BLACK).decoration(TextDecoration.BOLD, true));
    }

    @Override
    public @NotNull Inventory getInventory() {
        return inventory;
    }

    public void addItemToVoid(ItemStack itemStack) {
        HashMap<Integer,ItemStack> cantAdd = inventory.addItem(itemStack);
        if (cantAdd.isEmpty()) return;
        // TODO figure out what to do with overflow
    }

}
