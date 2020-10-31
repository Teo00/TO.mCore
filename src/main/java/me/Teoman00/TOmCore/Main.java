package me.Teoman00.TOmCore;

import me.Teoman00.TOmCore.utils.ChatUtilities;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public static Main pl;
    public static PluginManager pm;
    public static ConsoleCommandSender cs;

    @Override
    public void onLoad() {
        ChatUtilities.coreInit();
        getServer().getConsoleSender().sendMessage(ChatUtilities.coreGM("load"));
    }

    @Override
    public void onEnable() {
        pl = this;
        pm = getServer().getPluginManager();
        cs = getServer().getConsoleSender();


        cs.sendMessage(ChatUtilities.coreGM("enable"));
    }

    @Override
    public void onDisable() {

        cs.sendMessage(ChatUtilities.coreGM("disable"));
    }
}
