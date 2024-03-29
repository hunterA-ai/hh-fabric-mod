package com.hunterhack.networking;

import com.hunterhack.HunterHackMod;
import com.hunterhack.networking.packet.ExampleC2SPacket;

import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.util.Identifier;

public class HunterHackModMessages {
    public static final Identifier EXAMPLE_ID = new Identifier(HunterHackMod.MOD_ID, "example");

    public static void registerC2SPackets() {
        ServerPlayNetworking.registerGlobalReceiver(EXAMPLE_ID, ExampleC2SPacket::receive);
    }

    public static void registerS2CPackets() {

    }

}
