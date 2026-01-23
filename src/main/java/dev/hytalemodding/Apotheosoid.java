package dev.hytalemodding;

import javax.annotation.Nonnull;

import com.hypixel.hytale.server.core.event.events.player.PlayerReadyEvent;
import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;

import dev.hytalemodding.commands.ExampleCommand;
import dev.hytalemodding.commands.ShowUiPage;
import dev.hytalemodding.events.ExampleEvent;

public class Apotheosoid extends JavaPlugin {

    public Apotheosoid(@Nonnull JavaPluginInit init) {
        super(init);
    }

    @Override
    protected void setup() {
        this.getCommandRegistry().registerCommand(new ExampleCommand("example", "An example command"));
        this.getCommandRegistry().registerCommand(new ShowUiPage("showuipage", "Displays a specified UI Page for the player"));
        this.getEventRegistry().registerGlobal(PlayerReadyEvent.class, ExampleEvent::onPlayerReady);
    }
}