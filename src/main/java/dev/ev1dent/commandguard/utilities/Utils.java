package dev.ev1dent.commandguard.utilities;

import dev.ev1dent.commandguard.CGMain;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;

public class Utils {

    // Allows me to be lazy, and use colors cleanly. :)
    public Component Color(String s) {
        return MiniMessage.miniMessage().deserialize(s);
    }

    // Logging
    public void LogInfo(String log) {
        Bukkit.getLogger().info(log);
    }

    public void LogWarn(String log) {
        Bukkit.getLogger().warning(log);
    }

    public void LogSevere(String log) {
        Bukkit.getLogger().severe(log);
    }

    public FileConfiguration Config() {
        return CGMain.plugin.getConfig();
    }

}
