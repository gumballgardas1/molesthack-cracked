package org.itsmahir.crack.mixin;

import net.molesthack.client.util.BuildExpiry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(value = BuildExpiry.class, remap = false)
public class BuildExpiryMixin {
    @Overwrite
    public static boolean isExpired() {
        return false;
    }

    @Overwrite
    public static String getExpiryText() {
        return "Cracked by itsmahir";
    }

    @Overwrite
    public static String getExpiredMessage() {
        return "Molesthack Cracked by itsmahir";
    }
}
