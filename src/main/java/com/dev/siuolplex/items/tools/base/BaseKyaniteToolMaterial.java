package com.dev.siuolplex.items.tools.base;

import net.minecraft.item.ToolMaterial;

public interface BaseKyaniteToolMaterial extends ToolMaterial {
    float getMaxHealth();

    float getArmor();

    float getAttackBoost();

    float getMovementSpeed();
}
