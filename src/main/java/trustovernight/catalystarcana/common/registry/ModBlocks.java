package trustovernight.catalystarcana.common.registry;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import trustovernight.catalystarcana.CatalystArcana;
import trustovernight.catalystarcana.helpers.Logger;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
        DeferredRegister.create(ForgeRegistries.BLOCKS, CatalystArcana.MODID);

    public static final RegistryObject<Block> ASTRAL_CORE =
        BLOCKS.register("astral_core", () ->
            new Block(BlockBehaviour.Properties
                .of(Material.STONE)
                .strength(3f, 1200f)
                .requiresCorrectToolForDrops()
                .sound(SoundType.STONE)
            ));

    public static void register() {
        Logger.LOGGER.debug("Registering mod blocks");
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
