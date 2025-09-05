package me.erano.com.model200;

import me.erano.com.model200.proxy.CommonProxy;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Application.MODID, version = Application.VERSION)
public class Application {

    @Mod.Instance
    public static Application instance;

    public static final String MODID = "model200";

    public static final String VERSION = "1.0";

    @SidedProxy(modId = MODID, clientSide = "me.erano.com.model200.proxy.ClientProxy", serverSide = "me.erano.com.model200.proxy.CommonProxy")
    public static CommonProxy commonProxy;

    public Application() {
        instance = this;
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        commonProxy.init();

        ModelResourceLocation sheepModelLocation = new ModelResourceLocation("assets/model200/models/sheep.obj");

        OBJLoader.instance.addDomain(MODID);
        OBJLoader.instance.accepts(sheepModelLocation);
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        commonProxy.preInit();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        commonProxy.postInit();
    }







}
