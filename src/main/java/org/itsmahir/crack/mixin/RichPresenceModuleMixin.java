package org.itsmahir.crack.mixin;

import meteordevelopment.discordipc.RichPresence;
import net.molesthack.client.impl.module.client.RichPresenceModule;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value = RichPresenceModule.class, remap = false)
public class RichPresenceModuleMixin {
    @Redirect(
        method = "updateDetails",
        at = @At(
            value = "INVOKE",
            target = "Lmeteordevelopment/discordipc/RichPresence;setState(Ljava/lang/String;)V"
        )
    )
    private void redirectSetState(RichPresence presence, String state) {
        presence.setState(state.replace("Molesthack 3.1", "cracked by itsmahir"));
    }

    @Redirect(
        method = "updateDetails",
        at = @At(
            value = "INVOKE",
            target = "Lmeteordevelopment/discordipc/RichPresence;setDetails(Ljava/lang/String;)V"
        )
    )
    private void redirectSetDetails(RichPresence presence, String details) {
        presence.setDetails(details.replace("Molesthack 3.1", "cracked by itsmahir"));
    }

    @Redirect(
        method = "updateLogo",
        at = @At(
            value = "INVOKE",
            target = "Lmeteordevelopment/discordipc/RichPresence;setLargeImage(Ljava/lang/String;Ljava/lang/String;)V"
        )
    )
    private void redirectSetLargeImage(RichPresence presence, String key, String text) {
        presence.setLargeImage(key, text.replace("Molesthack 3.1", "cracked by itsmahir"));
    }
}
