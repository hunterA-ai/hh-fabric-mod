package com.hunterhack.networking.packet;

import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayNetworkHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

public class StripMineC2SPacket {


    public static void receive(
    MinecraftServer server,
    ServerPlayerEntity player, 
    ServerPlayNetworkHandler handler, 
    PacketByteBuf buf, 
    PacketSender responseSender
    ) {
        // Everything here happens ONLY on the Server!
        // Define packet to send
        ServerWorld world = (ServerWorld) player.getWorld();
        // get facing direction
        // get block in front y=1
        // get block in front y=0
        // get block in front y=-1
        // place block?
        // move forward
        boolean isAroundStone = BlockPos.stream(player.getBoundingBox().expand(2))
            .map(world::getBlockState).filter(state -> state.isOf(Blocks.STONE)).toArray().length > 0;


        // 


    }
}
