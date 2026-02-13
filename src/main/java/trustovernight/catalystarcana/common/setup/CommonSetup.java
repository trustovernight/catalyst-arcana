package trustovernight.catalystarcana.common.setup;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import trustovernight.catalystarcana.common.registry.ModBlocks;
import trustovernight.catalystarcana.common.registry.ModItems;

public class CommonSetup {

    public static void init(final FMLCommonSetupEvent event) {
        ModBlocks.register();
        ModItems.register();
    }
}
