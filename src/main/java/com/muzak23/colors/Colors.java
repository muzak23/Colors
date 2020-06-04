package com.muzak23.colors;

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
                player.sendMessage("Sender is a player");
                if (args.length > 0) {
                    player.sendMessage("Usage: /color <valid color code>");
                }
                if (sender.hasPermission("colors.e"))
            } else {
                System.out.println("You must be a player to use this command!");
            }
        }
        return true;
        /*

        - '$Script$%if%$primarygroup==moderator<and>$arg1==e'
        - '/nick $player &$arg1$player'
        - '$Script$%elseif%$primarygroup==admin'
        - '/nick $player &$arg1$player'
        - '$Script$%elseif%$arg1==e<and>$primarygroup!=moderator'
        - '$text$&c&oThe mod color cannot be picked!'
        - '$Script$%elseif%$arg1==c<and>$primarygroup!=admin'
        - '$text$&c&oThe admin color cannot be picked!'
        - '$Script$%elseif%$arg1==1<or>$arg1==2<or>$arg1==3<or>$arg1==4<or>$arg1==5<or>$arg1==6<or>$arg1==7<or>$arg1==8<or>$arg1==9<or>$arg1==0<or>$arg1==a<or>$arg1==b<or>$arg1==d<or>$arg1==f'
        - '/nick $player &$arg1$player'
        required_args: 1
        permission-required: true
        permission-node: mycommand.color
        permission-error: "Donate $10 or more to change name color."
        error-message: "/color <valid color code>"

        return super.onCommand(sender, command, label, args);
        */
    }
}
