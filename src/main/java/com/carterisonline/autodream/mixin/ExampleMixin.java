package com.carterisonline.autodream.mixin;

import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.apache.logging.log4j.Logger;
import static org.apache.logging.log4j.LogManager.getLogger;

@Mixin(TitleScreen.class)
// Mixins HAVE to be written in java due to constraints in the mixin system.
public class ExampleMixin {
    private static final Logger log = getLogger(ExampleMixin.class.getName());

    @Inject(at = @At("HEAD"), method = "init()V")
    private void init(CallbackInfo info) {
        log.info("This line is printed by an example mod mixin!");
    }
}
