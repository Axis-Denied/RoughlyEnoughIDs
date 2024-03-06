package org.dimdev.jeid.mixin.modsupport.biomesoplenty;

import biomesoplenty.common.init.ModBiomes;
import net.minecraft.world.biome.Biome;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

import java.util.Set;

@Mixin(value = ModBiomes.class, remap = false)
public abstract class MixinModBiomes {
    @ModifyConstant(method = "getNextFreeBiomeId", constant = @Constant(intValue = 256))
    private static int reid$getLoopUpperLimit(int oldValue) {
        return Integer.MAX_VALUE;
    }

    @ModifyConstant(method = "getNextFreeBiomeId", constant = @Constant(intValue = 255))
    private static int reid$getMaxBiomeId(int oldValue) {
        return Integer.MAX_VALUE - 1;
    }
}
