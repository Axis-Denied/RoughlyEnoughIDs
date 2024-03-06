package org.dimdev.jeid.mixin.modsupport.biomesoplenty;

import biomesoplenty.common.command.BOPCommand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(value = BOPCommand.class, remap = false)
public abstract class MixinBOPCommand {
    @ModifyConstant(method = "teleportFoundBiome", constant = @Constant(intValue = 255))
    private int reid$getMaxBiomeId(int oldValue) {
        return Integer.MAX_VALUE - 1;
    }
}
