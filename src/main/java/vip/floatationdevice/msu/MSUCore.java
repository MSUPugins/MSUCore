package vip.floatationdevice.msu;

import org.bukkit.plugin.java.JavaPlugin;

public final class MSUCore extends JavaPlugin
{
    @Override
    public void onEnable()
    {
        getLogger().info("MSUCore loaded");
    }

    @Override
    public void onDisable()
    {
        getLogger().info("MSUCore is being disabled");
    }
}
