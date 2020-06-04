package com.muzak23.colors;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class Colors extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Color plugin enabled!");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Color plugin disabled.");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equals("color")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                if (sender.hasPermission("colors.base")) {
                    if (args.length > 0) {
                        if (args[0].equalsIgnoreCase("0") || args[0].equalsIgnoreCase("1") || args[0].equalsIgnoreCase("2") || args[0].equalsIgnoreCase("3") || args[0].equalsIgnoreCase("4") || args[0].equalsIgnoreCase("5") || args[0].equalsIgnoreCase("6") || args[0].equalsIgnoreCase("7") || args[0].equalsIgnoreCase("8") || args[0].equalsIgnoreCase("9") || args[0].equalsIgnoreCase("a") || args[0].equalsIgnoreCase("b") || args[0].equalsIgnoreCase("d") || args[0].equalsIgnoreCase("f")) {
                            String colorCommand = "nick " + player.getName() + " &" + args[0] + player.getName();
                            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), colorCommand );
                        }
                        else if (args[0].equalsIgnoreCase("c")) {
                            if (sender.hasPermission("colors.c")) {
                                String colorCommand = "nick " + player.getName() + " &" + args[0] + player.getName();
                                Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), colorCommand );
                            } else {
                                player.sendMessage(ChatColor.RED + "The administrator color cannot be picked!");
                            }
                        }
                        else if (args[0].equalsIgnoreCase("e")) {
                            if (sender.hasPermission("colors.e")) {
                                String colorCommand = "nick " + player.getName() + " &" + args[0] + player.getName();
                                Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), colorCommand );
                            } else {
                                player.sendMessage(ChatColor.RED + "The moderator color cannot be picked!");
                            }
                        }
                        else {
                            player.sendMessage("Usage: /color <valid color code>");
                        }
                    } else {
                        player.sendMessage("Usage: /color <valid color code>");

                    }
                }
            } else {
                System.out.println("You must be a player to use this command!");
            }
        }
        return true;
    }
}
