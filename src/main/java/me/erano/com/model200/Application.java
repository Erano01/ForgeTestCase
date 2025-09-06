package me.erano.com.model200;

import me.erano.com.model200.entity.EntityManager;
import me.erano.com.model200.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

//gradlew runClient --rerun-tasks
@Mod(modid = Application.MODID, version = Application.VERSION)
public class Application {

    @Mod.Instance
    public static Application instance;

    public static final String MODID = "model200";

    public static final String VERSION = "1.0";

    @SidedProxy(
            modId = MODID,
            clientSide = "me.erano.com.model200.proxy.ClientProxy",
            serverSide = "me.erano.com.model200.proxy.ServerProxy"
    )
    public static CommonProxy commonProxy;

    public Application() {
        instance = this;
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        EntityManager.registerEntities();
        commonProxy.registerEntityRenderers();
        commonProxy.preInit();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        commonProxy.init();
        commonProxy.registerRenders();
        commonProxy.registerEntityRenderers();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        commonProxy.postInit();
    }

}
