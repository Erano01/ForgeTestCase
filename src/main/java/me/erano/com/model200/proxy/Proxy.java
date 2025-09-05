package me.erano.com.model200.proxy;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.INetHandler;

public interface Proxy {

    void init();

    void preInit();

    boolean isSinglePlayer();

    boolean isDedicatedServer();

    void registerRenderInformation();

    EntityPlayer getPlayerFromHandler(INetHandler handler);
}
