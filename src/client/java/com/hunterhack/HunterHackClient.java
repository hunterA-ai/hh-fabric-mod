package com.hunterhack;


import net.fabricmc.api.ClientModInitializer;

public class HunterHackClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.

		com.hunterhack.event.KeyInputHandler.register();
		com.hunterhack.networking.HunterHackModMessages.registerS2CPackets();
	}
}