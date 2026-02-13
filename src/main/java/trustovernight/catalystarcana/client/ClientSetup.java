package trustovernight.catalystarcana.client;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import trustovernight.catalystarcana.CatalystArcana;
import trustovernight.catalystarcana.client.registry.ModRenderers;

@Mod.EventBusSubscriber(modid = CatalystArcana.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientSetup {
    public static void init(final FMLClientSetupEvent event) {
        ModRenderers.register();
    }
}
