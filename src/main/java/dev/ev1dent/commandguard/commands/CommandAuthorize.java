package dev.ev1dent.commandguard.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;


public class CommandAuthorize implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command commandLabel, @NotNull String s, String[] args) {
        String value = args[0];
        switch (value){
            case "add":
                break;
            case "remove":
                break;
            case "list":
                break;
            default:
//                send unknown input message
                break;
        }
        return false;
    }
}
