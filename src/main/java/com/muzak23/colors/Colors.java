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
        System.out.println(ChatColor.GREEN + "Color plugin enabled!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println(ChatColor.RED + "Color plugin disabled.");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        //String debugPrefix = "[" + ChatColor.BLUE + "D" + ChatColor.RESET + "] ";  // For debug messages so they stand out
        if (command.getName().equals("color")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                if (sender.hasPermission("colors.base")) {
                    if (args.length == 1) {
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
                                //sender.sendMessage(debugPrefix + "Current length of name: " + nameLength);  // Used to make sure the username length was correct.
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
                                        colorCommand = "nick " + player.getName() + " &c" + name[0] + "&6" + name[1] + "&e" + name[2] + "&a" + name[3] + "&9" + name[4] + "&d" + name[5];
                                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), colorCommand );
                                        break;
                                    case 7:
                                        colorCommand = "nick " + player.getName() + " &c" + name[0] + "&6" + name[1] + "&e" + name[2] + "&a" + name[3] + "&b" + name[4] + "&9" + name[5] + "&d" + name[6];
                                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), colorCommand );
                                        break;
                                    case 8:
                                        colorCommand = "nick " + player.getName() + " &c" + name[0] + "&6" + name[1] + "&e" + name[2] + "&a" + name[3] + "&b" + name[4] + "&9" + name[5] + "&5" + name[6] + "&d" + name[7];
                                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), colorCommand );
                                        break;
                                    case 9:
                                        colorCommand = "nick " + player.getName() + " &c" + name[0] + "&6" + name[1] + "&e" + name[2] + "&a" + name[3] + "&b" + name[4] + "&9" + name[5] + "&5" + name[6] + "&d" + name[7] + "&c" +name[8];
                                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), colorCommand );
                                        break;
                                    case 10:
                                        colorCommand = "nick " + player.getName() + " &c" + name[0] + "&6" + name[1] + "&e" + name[2] + "&a" + name[3] + "&b" + name[4] + "&9" + name[5] + "&5" + name[6] + "&d" + name[7] + "&c" + name[8] + "&6" + name[9];
                                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), colorCommand );
                                        break;
                                    case 11:
                                        colorCommand = "nick " + player.getName() + " &c" + name[0] + "&6" + name[1] + "&e" + name[2] + "&a" + name[3] + "&b" + name[4] + "&9" + name[5] + "&5" + name[6] + "&d" + name[7] + "&c" + name[8] + "&6" + name[9] + "&e" + name[10];
                                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), colorCommand );
                                        break;
                                    case 12:
                                        colorCommand = "nick " + player.getName() + " &c" + name[0] + "&6" + name[1] + "&e" + name[2] + "&a" + name[3] + "&b" + name[4] + "&9" + name[5] + "&5" + name[6] + "&d" + name[7] + "&c" + name[8] + "&6" + name[9] + "&e" + name[10] + "&a" + name[11];
                                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), colorCommand );
                                        break;
                                    case 13:
                                        colorCommand = "nick " + player.getName() + " &c" + name[0] + "&6" + name[1] + "&e" + name[2] + "&a" + name[3] + "&b" + name[4] + "&9" + name[5] + "&5" + name[6] + "&d" + name[7] + "&c" + name[8] + "&6" + name[9] + "&e" + name[10] + "&a" + name[11] + "&b" + name[12];
                                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), colorCommand );
                                        break;
                                    case 14:
                                        colorCommand = "nick " + player.getName() + " &c" + name[0] + "&6" + name[1] + "&e" + name[2] + "&a" + name[3] + "&b" + name[4] + "&9" + name[5] + "&5" + name[6] + "&d" + name[7] + "&c" + name[8] + "&6" + name[9] + "&e" + name[10] + "&a" + name[11] + "&b" + name[12] + "&9" + name[13];
                                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), colorCommand );
                                        break;
                                    case 15:
                                        colorCommand = "nick " + player.getName() + " &c" + name[0] + "&6" + name[1] + "&e" + name[2] + "&a" + name[3] + "&b" + name[4] + "&9" + name[5] + "&5" + name[6] + "&d" + name[7] + "&c" + name[8] + "&6" + name[9] + "&e" + name[10] + "&a" + name[11] + "&b" + name[12] + "&9" + name[13] + "&d" + name[14];
                                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), colorCommand );
                                        break;
                                    case 16:
                                        colorCommand = "nick " + player.getName() + " &c" + name[0] + "&6" + name[1] + "&e" + name[2] + "&a" + name[3] + "&b" + name[4] + "&9" + name[5] + "&5" + name[6] + "&d" + name[7] + "&c" + name[8] + "&6" + name[9] + "&e" + name[10] + "&a" + name[11] + "&b" + name[12] + "&9" + name[13] + "&5" + name[14] + "&d" + name[15];
                                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), colorCommand );
                                        break;
                                    default:
                                        player.sendMessage(ChatColor.RED + "A problem has occurred, please contact the developer.");
                                }
                            } else {
                                player.sendMessage(ChatColor.DARK_RED + "No permission for rainbow color.");  // colors.rainbow perm fail
                            }
                        } else {
                            player.sendMessage("Usage: /color <valid color code>");  // not 0-9 or a-f or rainbow
                        }
                    } else if (args.length == 2) {
                        if (sender.hasPermission("colors.others")) {
                            Player target = Bukkit.getPlayerExact(args[0]);
                            if (target instanceof Player) {
                                if (args[1].equalsIgnoreCase("0") || args[1].equalsIgnoreCase("1") || args[1].equalsIgnoreCase("2") || args[1].equalsIgnoreCase("3") || args[1].equalsIgnoreCase("4") || args[1].equalsIgnoreCase("5") || args[1].equalsIgnoreCase("6") || args[1].equalsIgnoreCase("7") || args[1].equalsIgnoreCase("8") || args[1].equalsIgnoreCase("9") || args[1].equalsIgnoreCase("a") || args[1].equalsIgnoreCase("b") || args[1].equalsIgnoreCase("d") || args[1].equalsIgnoreCase("f")) {
                                    String colorCommand = "nick " + target.getName() + " &" + args[1] + target.getName();
                                    Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), colorCommand);
                                    player.sendMessage(ChatColor.GOLD + "Changed " + target.getDisplayName() + ChatColor.GOLD + "'s color.");
                                } else if (args[1].equalsIgnoreCase("c")) {
                                    if (sender.hasPermission("colors.others.c")) {
                                        String colorCommand = "nick " + target.getName() + " &" + args[1] + target.getName();
                                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), colorCommand);
                                        player.sendMessage(ChatColor.GOLD + "Changed " + target.getDisplayName() + ChatColor.GOLD + "'s color.");
                                    } else {
                                        player.sendMessage(ChatColor.RED + "The administrator color cannot be picked!");
                                    }
                                } else if (args[1].equalsIgnoreCase("e")) {
                                    if (sender.hasPermission("colors.others.e")) {
                                        String colorCommand = "nick " + target.getName() + " &" + args[1] + target.getName();
                                        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), colorCommand);
                                        player.sendMessage(ChatColor.GOLD + "Changed " + target.getDisplayName() + ChatColor.GOLD + "'s color.");
                                    } else {
                                        player.sendMessage(ChatColor.RED + "The moderator color cannot be picked!");
                                    }
                                } else if (args[1].equalsIgnoreCase("rainbow")) {
                                    if (sender.hasPermission("colors.others.rainbow")) {
                                        int nameLength = target.getName().length();
                                        //sender.sendMessage(debugPrefix + "Current length of name: " + nameLength);  // Used to make sure the username length was correct.
                                        char[] name = target.getName().toCharArray();
                                        String colorCommand;
                                        switch (nameLength) {
                                            case 2:
                                                colorCommand = "nick " + target.getName() + " &c" + name[0] + "&9" + name[1];
                                                Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), colorCommand);
                                                player.sendMessage(ChatColor.GOLD + "Changed " + target.getDisplayName() + ChatColor.GOLD + "'s color.");
                                                break;
                                            case 3:
                                                colorCommand = "nick " + target.getName() + " &c" + name[0] + "&a" + name[1] + "&9" + name[2];
                                                Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), colorCommand);
                                                player.sendMessage(ChatColor.GOLD + "Changed " + target.getDisplayName() + ChatColor.GOLD + "'s color.");
                                                break;
                                            case 4:
                                                colorCommand = "nick " + target.getName() + " &c" + name[0] + "&e" + name[1] + "&6" + name[2] + "&9" + name[3];
                                                Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), colorCommand);
                                                player.sendMessage(ChatColor.GOLD + "Changed " + target.getDisplayName() + ChatColor.GOLD + "'s color.");
                                                break;
                                            case 5:
                                                colorCommand = "nick " + target.getName() + " &c" + name[0] + "&6" + name[1] + "&e" + name[2] + "&6" + name[3] + "&9" + name[4];
                                                Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), colorCommand);
                                                player.sendMessage(ChatColor.GOLD + "Changed " + target.getDisplayName() + ChatColor.GOLD + "'s color.");
                                                break;
                                            case 6:
                                                colorCommand = "nick " + target.getName() + " &c" + name[0] + "&6" + name[1] + "&e" + name[2] + "&a" + name[3] + "&9" + name[4] + "&d" + name[5];
                                                Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), colorCommand);
                                                player.sendMessage(ChatColor.GOLD + "Changed " + target.getDisplayName() + ChatColor.GOLD + "'s color.");
                                                break;
                                            case 7:
                                                colorCommand = "nick " + target.getName() + " &c" + name[0] + "&6" + name[1] + "&e" + name[2] + "&a" + name[3] + "&b" + name[4] + "&9" + name[5] + "&d" + name[6];
                                                Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), colorCommand);
                                                player.sendMessage(ChatColor.GOLD + "Changed " + target.getDisplayName() + ChatColor.GOLD + "'s color.");
                                                break;
                                            case 8:
                                                colorCommand = "nick " + target.getName() + " &c" + name[0] + "&6" + name[1] + "&e" + name[2] + "&a" + name[3] + "&b" + name[4] + "&9" + name[5] + "&5" + name[6] + "&d" + name[7];
                                                Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), colorCommand);
                                                player.sendMessage(ChatColor.GOLD + "Changed " + target.getDisplayName() + ChatColor.GOLD + "'s color.");
                                                break;
                                            case 9:
                                                colorCommand = "nick " + target.getName() + " &c" + name[0] + "&6" + name[1] + "&e" + name[2] + "&a" + name[3] + "&b" + name[4] + "&9" + name[5] + "&5" + name[6] + "&d" + name[7] + "&c" + name[8];
                                                Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), colorCommand);
                                                player.sendMessage(ChatColor.GOLD + "Changed " + target.getDisplayName() + ChatColor.GOLD + "'s color.");
                                                break;
                                            case 10:
                                                colorCommand = "nick " + target.getName() + " &c" + name[0] + "&6" + name[1] + "&e" + name[2] + "&a" + name[3] + "&b" + name[4] + "&9" + name[5] + "&5" + name[6] + "&d" + name[7] + "&c" + name[8] + "&6" + name[9];
                                                Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), colorCommand);
                                                player.sendMessage(ChatColor.GOLD + "Changed " + target.getDisplayName() + ChatColor.GOLD + "'s color.");
                                                break;
                                            case 11:
                                                colorCommand = "nick " + target.getName() + " &c" + name[0] + "&6" + name[1] + "&e" + name[2] + "&a" + name[3] + "&b" + name[4] + "&9" + name[5] + "&5" + name[6] + "&d" + name[7] + "&c" + name[8] + "&6" + name[9] + "&e" + name[10];
                                                Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), colorCommand);
                                                player.sendMessage(ChatColor.GOLD + "Changed " + target.getDisplayName() + ChatColor.GOLD + "'s color.");
                                                break;
                                            case 12:
                                                colorCommand = "nick " + target.getName() + " &c" + name[0] + "&6" + name[1] + "&e" + name[2] + "&a" + name[3] + "&b" + name[4] + "&9" + name[5] + "&5" + name[6] + "&d" + name[7] + "&c" + name[8] + "&6" + name[9] + "&e" + name[10] + "&a" + name[11];
                                                Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), colorCommand);
                                                player.sendMessage(ChatColor.GOLD + "Changed " + target.getDisplayName() + ChatColor.GOLD + "'s color.");
                                                break;
                                            case 13:
                                                colorCommand = "nick " + target.getName() + " &c" + name[0] + "&6" + name[1] + "&e" + name[2] + "&a" + name[3] + "&b" + name[4] + "&9" + name[5] + "&5" + name[6] + "&d" + name[7] + "&c" + name[8] + "&6" + name[9] + "&e" + name[10] + "&a" + name[11] + "&b" + name[12];
                                                Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), colorCommand);
                                                player.sendMessage(ChatColor.GOLD + "Changed " + target.getDisplayName() + ChatColor.GOLD + "'s color.");
                                                break;
                                            case 14:
                                                colorCommand = "nick " + target.getName() + " &c" + name[0] + "&6" + name[1] + "&e" + name[2] + "&a" + name[3] + "&b" + name[4] + "&9" + name[5] + "&5" + name[6] + "&d" + name[7] + "&c" + name[8] + "&6" + name[9] + "&e" + name[10] + "&a" + name[11] + "&b" + name[12] + "&9" + name[13];
                                                Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), colorCommand);
                                                player.sendMessage(ChatColor.GOLD + "Changed " + target.getDisplayName() + ChatColor.GOLD + "'s color.");
                                                break;
                                            case 15:
                                                colorCommand = "nick " + target.getName() + " &c" + name[0] + "&6" + name[1] + "&e" + name[2] + "&a" + name[3] + "&b" + name[4] + "&9" + name[5] + "&5" + name[6] + "&d" + name[7] + "&c" + name[8] + "&6" + name[9] + "&e" + name[10] + "&a" + name[11] + "&b" + name[12] + "&9" + name[13] + "&d" + name[14];
                                                Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), colorCommand);
                                                player.sendMessage(ChatColor.GOLD + "Changed " + target.getDisplayName() + ChatColor.GOLD + "'s color.");
                                                break;
                                            case 16:
                                                colorCommand = "nick " + target.getName() + " &c" + name[0] + "&6" + name[1] + "&e" + name[2] + "&a" + name[3] + "&b" + name[4] + "&9" + name[5] + "&5" + name[6] + "&d" + name[7] + "&c" + name[8] + "&6" + name[9] + "&e" + name[10] + "&a" + name[11] + "&b" + name[12] + "&9" + name[13] + "&5" + name[14] + "&d" + name[15];
                                                Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), colorCommand);
                                                player.sendMessage(ChatColor.GOLD + "Changed " + target.getDisplayName() + ChatColor.GOLD + "'s color.");
                                                break;
                                            default:
                                                player.sendMessage(ChatColor.RED + "A problem has occurred, please contact the developer.");
                                        }  // end of switch
                                    } else {
                                        player.sendMessage(ChatColor.DARK_RED + "No permission for rainbow color.");  // colors.other.rainbow perm fail
                                    }
                                } else {
                                    player.sendMessage("Usage: /color [player] <valid color code>");  // not 0-9 or a-f or rainbow
                                }
                            } else {
                                player.sendMessage(ChatColor.RED + "Invalid player!");  // Target is not a player
                            }
                        } else {
                            player.sendMessage("You cannot change other's colors!");  // colors.other perm fail
                        }
                    } else {
                        player.sendMessage("Usage: /color <valid color code>");  // not one or two args fail
                    }
                } else {
                    player.sendMessage("Donate $10 or more to change name color.");  // colors.base perm fail
                }
            } else {
                System.out.println("You must be a player to use this command!");  // sender not a player
            }
        }  // end of if command is /color
        return true;
    } // end of commands
}
