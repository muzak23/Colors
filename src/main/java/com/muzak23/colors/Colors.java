package com.muzak23.colors;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.PluginCommand;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import static org.bukkit.ChatColor.ITALIC;

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
        String debugPrefix = "[" + ChatColor.BLUE + "D" + ChatColor.RESET + "] ";
        if (command.getName().equals("color")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                if (sender.hasPermission("colors.base")) {
                    if (args.length > 0) {
                        if (args[0].equalsIgnoreCase("0") || args[0].equalsIgnoreCase("1") || args[0].equalsIgnoreCase("2") || args[0].equalsIgnoreCase("3") || args[0].equalsIgnoreCase("4") || args[0].equalsIgnoreCase("5") || args[0].equalsIgnoreCase("6") || args[0].equalsIgnoreCase("7") || args[0].equalsIgnoreCase("8") || args[0].equalsIgnoreCase("9") || args[0].equalsIgnoreCase("a") || args[0].equalsIgnoreCase("b") || args[0].equalsIgnoreCase("d") || args[0].equalsIgnoreCase("f")) {
                            String colorCommand = "nick " + player.getName() + " &" + args[0] + player.getName();
                            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), colorCommand );
                        } else if (args[0].equalsIgnoreCase("c")) {
                            if (sender.hasPermission("colors.c")) {
                                String colorCommand = "nick " + player.getName() + " &" + args[0] + player.getName();
                                Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), colorCommand );
                            } else {
                                player.sendMessage(ChatColor.RED + "The administrator color cannot be picked!");
                            }
                        } else if (args[0].equalsIgnoreCase("e")) {
                            if (sender.hasPermission("colors.e")) {
                                String colorCommand = "nick " + player.getName() + " &" + args[0] + player.getName();
                                Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), colorCommand );
                            } else {
                                player.sendMessage(ChatColor.RED + "The moderator color cannot be picked!");
                            }
                        } else if (args[0].equalsIgnoreCase("rainbow")) {
                            if (sender.hasPermission("colors.rainbow")) {
                                int nameLength = player.getName().length();
                                sender.sendMessage(debugPrefix + "Current length of name: " + nameLength);
                                char[] name = sender.getName().toCharArray();
                                String colorCommand;
                                switch (nameLength) {
                                    case 2:
                                        colorCommand = "nick " + player.getName() + " &c" + name[0] + "&9" + name[1];
                                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), colorCommand );
                                        break;
                                    case 3:
                                        colorCommand = "nick " + player.getName() + " &c" + name[0] + "&a" + name[1] + "&9" + name[2];
                                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), colorCommand );
                                        break;
                                    case 4:
                                        colorCommand = "nick " + player.getName() + " &c" + name[0] + "&e" + name[1] + "&6" + name[2] + "&9" + name[3];
                                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), colorCommand );
                                        break;
                                    case 5:
                                        colorCommand = "nick " + player.getName() + " &c" + name[0] + "&6" + name[1] + "&e" + name[2] + "&6" + name[3] + "&9" + name[4];
                                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), colorCommand );
                                        break;
                                    case 6:
                                        colorCommand = "nick " + player.getName() + " &c" + name[0] + "&6" + name[1] + "&e" + name[2] + "&6" + name[3] + "&9" + name[4] + "&d" + name[5];
                                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), colorCommand );
                                        break;
                                    case 7:
                                        colorCommand = "nick " + player.getName() + " &c" + name[0] + "&6" + name[1] + "&e" + name[2] + "&a" + name[3] + "&b" + name[4] + "&9" + name[5] + "&d" + name[6];
                                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), colorCommand );
                                        break;
                                    default:
                                        String errorSwitch = ChatColor.RED + "A problem has occurred, please contact the developer.";
                                        player.sendMessage(ChatColor.RED + "A problem has occurred, please contact the developer.");
                                }
                            } else {
                                player.sendMessage(ChatColor.DARK_RED + "No permission for rainbow color.");  // colors.rainbow perm fail
                            }
                        } else {
                            player.sendMessage("Usage: /color <valid color code.");  // not 0-9 or a-f or rainbow
                        }
                    } else {
                        player.sendMessage("Usage: /color <valid color code>");  // more than one arg fail
                    }
                } else {
                    player.sendMessage("Donate $10 or more to change name color.");  // colors.base perm fail
                }
            } else {
                System.out.println("You must be a player to use this command!");  // sender not a player
            }
        }
        return true;
    }
}
