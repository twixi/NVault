package com.pikycz.nvault;

import cn.nukkit.Server;
import cn.nukkit.permission.Permission;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.plugin.service.ServiceManager;
import cn.nukkit.plugin.service.ServicePriority;
import cn.nukkit.utils.TextFormat;
import com.pikycz.nvault.chat.plugins.Chat;
import com.pikycz.nvault.economy.plugins.Economy;
import com.pikycz.nvault.listener.NVaultListener;
import java.util.logging.Logger;

/**
 * @author PikyCZ
 */
public class NVault extends PluginBase {

    private static Logger log;
    private Permission perms;
    private ServiceManager sm;
    private NVault plugin;

    public void onLoad() {
        getLogger().info(TextFormat.YELLOW + "NVault loading");
    }

    public void onEnable() {
        plugin = this;
        sm = getServer().getServiceManager();

        getLogger().info(TextFormat.GREEN + "NVault enable");

        //TODO make Config
        //Load NVault Addons
        loadEconomy();
        loadPermission();
        loadChat();

        getServer().getPluginManager().registerEvents(new NVaultListener(), this);

        //ToDo Task
    }

    public void loadChat() {

    }

    public void loadEconomy() {

    }

    public void loadPermission() {

    }

    private void hookChat(String name, Class<? extends Chat> hookClass, ServicePriority priority, String... packages) {

    }

    private void hookEconomy(String name, Class<? extends Economy> hookClass, ServicePriority priority, String... packages) {

    }

    private void hookPermission(String name, Class<? extends Permission> hookClass, ServicePriority priority, String... packages) {

    }

    public void onDisable() {
        getLogger().info(TextFormat.RED + "NVault disable");
        // Remove all Service Registrations
        getServer().getServiceManager().cancel(this);
        Server.getInstance().getScheduler().cancelTask(this);
    }

}
