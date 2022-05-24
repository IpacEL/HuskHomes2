package net.william278.huskhomes.listener;

import net.william278.huskhomes.HuskHomes;
import net.william278.huskhomes.player.BukkitPlayer;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.jetbrains.annotations.NotNull;

public class BukkitEventProcessor extends EventProcessor implements Listener {

    public BukkitEventProcessor(@NotNull HuskHomes implementor) {
        super(implementor);
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        super.onPlayerJoin(BukkitPlayer.adapt(event.getPlayer()));
    }

}