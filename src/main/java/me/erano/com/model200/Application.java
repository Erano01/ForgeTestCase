package me.erano.com.model200;

import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = Application.MODID, version = Application.VERSION)
public class Application {

    @Mod.Instance
    public static Application instance;

    public static final String MODID = "model200";

    public static final String VERSION = "1.0";

    public Application() {
        instance = this;
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        ModelResourceLocation sheepModelLocation = new ModelResourceLocation("assets/model200/models/sheep.obj");

        OBJLoader.instance.addDomain(MODID);
        OBJLoader.instance.accepts(sheepModelLocation);
    }








}
