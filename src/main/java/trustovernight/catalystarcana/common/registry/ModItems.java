package trustovernight.catalystarcana.common.registry;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import trustovernight.catalystarcana.CatalystArcana;
import trustovernight.catalystarcana.helpers.Logger;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CatalystArcana.MODID);

    public static final RegistryObject<Item> ASTRAL_CORE =
            ITEMS.register("astral_core", () ->
            new BlockItem(ModBlocks.ASTRAL_CORE.get(),
                        new Item.Properties()));

    public static void register() {
        Logger.LOGGER.debug("Registering mod items");
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
