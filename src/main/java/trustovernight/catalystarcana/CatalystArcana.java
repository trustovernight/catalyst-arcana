package trustovernight.catalystarcana;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import trustovernight.catalystarcana.common.registry.ModBlocks;
import trustovernight.catalystarcana.common.registry.ModItems;
import trustovernight.catalystarcana.common.setup.CommonSetup;

@Mod(CatalystArcana.MODID)
public class CatalystArcana {
    public static final String MODID = "catalyst_arcana";

    public CatalystArcana() {
        FMLJavaModLoadingContext context = FMLJavaModLoadingContext.get();

        ModBlocks.register();
        ModItems.register();

        context.getModEventBus().addListener(CommonSetup::init);

        MinecraftForge.EVENT_BUS.register(this);

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }
}
