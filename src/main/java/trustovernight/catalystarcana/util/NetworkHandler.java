package trustovernight.catalystarcana.util;

import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.simple.SimpleChannel;
import net.minecraftforge.network.NetworkEvent;
import net.minecraft.resources.ResourceLocation;
import trustovernight.catalystarcana.CatalystArcana;

import java.util.function.Supplier;

public class NetworkHandler {
    private static final String PROTOCOL_VERSION = "1";

    public static final SimpleChannel CHANNEL = NetworkRegistry.newSimpleChannel(
            new ResourceLocation(CatalystArcana.MODID, "main"),
            () -> PROTOCOL_VERSION,
            PROTOCOL_VERSION::equals,
            PROTOCOL_VERSION::equals
    );

    public static <T> void registerPacket(int id, Class<T> clazz, NetworkPacketEncoder<T> encoder,
        NetworkPacketDecoder<T> decoder, NetworkPacketHandler<T> handler) {
        CHANNEL.registerMessage(id, clazz, encoder::encode, decoder::decode, handler::handle);
    }

    public interface NetworkPacketEncoder<T> {
        void encode(T msg, net.minecraft.network.FriendlyByteBuf buf);
    }
    public interface NetworkPacketDecoder<T> {
        T decode(net.minecraft.network.FriendlyByteBuf buf);
    }
    public interface NetworkPacketHandler<T> {
        void handle(T msg, Supplier<NetworkEvent.Context> ctx);
    }
}
