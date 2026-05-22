package org.itsmahir.crack;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class LoaderMod implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        System.out.println("[MolesthackLoader] Cracked by ItsMahir");
    }
}
