package org.itsmahir.crack.mixin;

import net.molesthack.client.impl.gui.auth.AuthManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(value = AuthManager.class, remap = false)
public class AuthManagerMixin {
    @Overwrite
    public static boolean isAuthenticated() {
        return true;
    }

    @Overwrite
    public static boolean authenticate(String password) {
        return true;
    }
}
