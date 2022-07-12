package com.github.brunoleitec.iloveteddy;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class Iloveteddy extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        Player p = null;
        p.spigot();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
