package com.silver2040.utill_commands;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("UtillCommands functioning");
        getCommand("agility").setExecutor(new AgilityCommandExecutor(this));
    }

    @Override
    public void onDisable() {
        getLogger().info("Server and/or plugin shutting down");
    }
}
