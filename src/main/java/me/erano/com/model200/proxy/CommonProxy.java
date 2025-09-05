package me.erano.com.model200.proxy;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.INetHandler;
import net.minecraft.network.NetHandlerPlayServer;
import net.minecraft.server.MinecraftServer;

public class CommonProxy implements Proxy {

    @Override
    public void init() {

    }

    @Override
    public void preInit() {

    }

    @Override
    public void postInit() {

    }

    @Override
    public boolean isSinglePlayer() {
        return Minecraft.getMinecraft().isSingleplayer();
    }

    @Override
    public boolean isDedicatedServer() {
        return MinecraftServer.getServer().isDedicatedServer();
    }

    @Override
    public void registerRenderInformation() {

    }

    @Override
    public EntityPlayer getPlayerFromHandler(INetHandler handler) {
        if(handler instanceof NetHandlerPlayServer) return ((NetHandlerPlayServer)handler).playerEntity;
        return null;
    }

    public void registerRenders() {

    }
}
