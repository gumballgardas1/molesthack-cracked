package org.itsmahir.crack.mixin;

import net.molesthack.client.impl.module.client.HUDModule;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(value = HUDModule.class, remap = false)
public class HUDModuleMixin {
    @ModifyArg(
        method = "onRenderOverlayPost",
        at = @At(
            value = "INVOKE",
            target = "Ljava/lang/String;format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;"
        ),
        index = 0
    )
    private String modifyUidFormat(String format) {
        if ("UID %s".equals(format)) {
            return "UID -1";
        }
        return format;
    }
}
