package dev.ev1dent.commandguard;

import dev.ev1dent.commandguard.commands.CommandAuthorize;
import net.luckperms.api.LuckPerms;
import org.bukkit.plugin.java.JavaPlugin;

public final class CGMain extends JavaPlugin {

    public static CGMain plugin;
    private LuckPerms luckPerms;

    @Override
    public void onEnable() {
        plugin = this;
        this.luckPerms = getServer().getServicesManager().load(LuckPerms.class);
        registerCommands();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public void registerCommands(){
        this.getCommand("authorize").setExecutor(new CommandAuthorize());
    }
}
