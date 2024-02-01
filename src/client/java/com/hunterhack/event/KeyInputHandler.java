package com.hunterhack.event;

import com.hunterhack.HunterHackMod;
import org.lwjgl.glfw.GLFW;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.text.Text;
import net.minecraft.text.TextContent;
import net.minecraft.text.TranslatableTextContent;
import net.minecraft.text.MutableText;


// TODO: Test this class
public class KeyInputHandler {
    public static final String KEY_CATEGORY_HunterHack = "key.category.hhmod.keybinds";
    public static final String KEY_GEN_TEXT = "key.hhmod.gentext";


    public static KeyBinding textGenKeyBinding;
    public static String generatedText = "I put the fun in functionality!";

    public static void registerKeyInputs() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if(textGenKeyBinding.wasPressed()) {
                // This happens when our custom key is pressed
                // Text.of("bing_bong");
                // Text.translatable(generatedText)
                // public static client.MessageHandler()
                client.player.sendMessage(Text.of("bing_bong"));
                HunterHackMod.LOGGER.info("Keybind pressed");
            }
        });
    }


    public static void register() {
        textGenKeyBinding = KeyBindingHelper.registerKeyBinding(new KeyBinding(
            KEY_GEN_TEXT,
            InputUtil.Type.KEYSYM,
            GLFW.GLFW_KEY_O,
            KEY_CATEGORY_HunterHack
            ));


        registerKeyInputs();
    }
}
