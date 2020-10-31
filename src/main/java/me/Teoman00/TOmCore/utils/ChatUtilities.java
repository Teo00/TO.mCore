package me.Teoman00.TOmCore.utils;

import org.bukkit.ChatColor;

import java.util.HashMap;

public class ChatUtilities {

    public static HashMap<String, String> AllChatMessages = new HashMap<>();

    /* ---------- [Core Methods] ----------*/

    public static void coreInit(){

        a("core.prefix", "&cTOm Core &f> ");
        a("core.load", coreGM("prefix") + "&bTOm Core is loading...");
        a("core.enable", coreGM("prefix") + "&aTOm Core has been enabled.");
        a("core.disable", coreGM("prefix") + "&cTOm Core has been disabled.");

    }

    public static String coreGM(String key){
        return AllChatMessages.get("core." + key);
    }


    /* ---------- [In-Class Methods] ----------*/

    private static void a(String s1, String s2){
        AllChatMessages.put(s1,ChatColor.translateAlternateColorCodes('&', s2)); }


    /* ---------- [API Methods] ----------*/


}
