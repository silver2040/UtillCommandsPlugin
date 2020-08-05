package com.silver2040.utill_commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class AgilityCommandExecutor implements CommandExecutor {
    private final Main main;

    public AgilityCommandExecutor(Main main){
        this.main = main;
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command cmd, String s, String[] args) {
        if(cmd.getName().equalsIgnoreCase("agility")){
           // if(1 == 1){}
        }
        return false;
    }
}
