package org.dimdev.jeid.mixin.core.world;

import net.minecraft.world.storage.WorldInfo;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(WorldInfo.class)
public class MixinWorldInfo {
    @ModifyConstant(method = "updateTagCompound", constant = @Constant(stringValue = "1.12.2", ordinal = 0))
    private String reid$versionName(String currentValue) {
        return "1.13-JEID";
    }

    @ModifyConstant(method = "updateTagCompound", constant = @Constant(intValue = 1343, ordinal = 0))
    private int reid$versionId(int currentValue) {
        return Integer.MAX_VALUE / 2;
    }
}
