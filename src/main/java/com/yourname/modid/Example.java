package com.yourname.modid;

import lombok.Getter;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Example.MOD_ID)
public class Example {
    public static final String MOD_ID = "example";

    @Mod.EventHandler
    public void onPreInit(FMLPreInitializationEvent event) {
        System.out.println("Hello world!");
    }

    // lombok example
    // see com.yourname.modid.mixin.client.MixinMinecraft:13
    @Getter private static final String displayTitle = "Example Mod";
}
