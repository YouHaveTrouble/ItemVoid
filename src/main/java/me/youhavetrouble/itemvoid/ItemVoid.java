package me.youhavetrouble.itemvoid;

import org.bukkit.plugin.java.JavaPlugin;

public final class ItemVoid extends JavaPlugin {

    private static ItemVoid plugin;
    private VoidHolder voidHolder;

    @Override
    public void onEnable() {
        plugin = this;
        this.voidHolder = new VoidHolder();
        getCommand("void").setExecutor(new VoidCommand());
    }

    public static ItemVoid getInstance() {
        return plugin;
    }

    public VoidHolder getVoidHolder() {
        return voidHolder;
    }
}
