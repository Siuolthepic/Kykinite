package com.dev.siuolplex.items.armor.materials;
import com.dev.siuolplex.items.Items;
import com.dev.siuolplex.items.armor.base.BaseKykiniteArmorMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class QuartzKykiniteArmorMaterials implements BaseKykiniteArmorMaterial {

    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private static final int[] PROTECTION_VALUES = new int[]{2, 5, 6, 2};

    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * 24;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return PROTECTION_VALUES[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 10;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.QUARTZ_ASCENSION_KYKINITE);
    }

    @Override
    public String getName() {
        return "quartz_kykinite";
    }

    @Override
    public float getToughness() {
        return 1.0F;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.0F;
    }

    @Override
    public float getMaxHealth(){return 0.0F;}

    @Override
    public float getAttackDamage(){return 0.125F;}

    @Override
    public float getMovementSpeed(){return 0.0F;}

}

