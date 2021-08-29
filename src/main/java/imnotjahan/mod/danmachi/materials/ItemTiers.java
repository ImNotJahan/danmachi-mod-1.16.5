package imnotjahan.mod.danmachi.materials;

import imnotjahan.mod.danmachi.init.Items;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

import java.util.function.Supplier;

public enum ItemTiers implements IItemTier
{
    HESTIA_KNIFE(3, 100, 12.0F, 2.0F, 30, () -> {
        return Ingredient.of(Items.MYTHRIL_INGOT);
    }),
    DESPERATE(3, 300, 6.0F, 4.0F, 10, () -> {
        return Ingredient.of(Items.ORICHALCUM_INGOT);
    }),
    HAKUGEN(3, 180, 8.0F, 1.0F, 15, () -> {
        return Ingredient.of(Items.UNICORN_HORN);
    }),
    DAGGER(2, 100, 6.0F, 1.0F, 1, () -> {
        return Ingredient.of(net.minecraft.item.Items.IRON_INGOT);
    }),
    SWORD_AIR(3, 180, 7.0F, 2.0F, 10, () -> {
        return Ingredient.of(Items.DAMASCUS_STEEL);
    }),
    MAGIC_SWORD(2, 3, 3.0F, 3.0F, 30, () -> {
        return Ingredient.of(Items.ADAMANTITE_INGOT);
    }),
    GREATSWORD(2, 180, 3.0F, 3.0F, 10, () -> {
        return Ingredient.of(net.minecraft.item.Items.IRON_INGOT);
    }),
    KOTETSU(2, 140, 5.0F, 2.0F, 20, () -> {
        return Ingredient.of(Items.LYGERFANG_FANG);
    }),
    URGA(2, 200, 2.0F, 6.0F, 5, () -> {
        return Ingredient.of(Items.URGA_BLADE);
    }),
    PROTAGONISTA(2, 200, 6.0F, 3.0F, 5, () -> {
        return Ingredient.of(net.minecraft.item.Items.GOLD_INGOT);
    });

    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final LazyValue<Ingredient> repairIngredient;

    ItemTiers(int level, int uses, float speed, float damage, int enchantmentValue, Supplier<Ingredient> repairIngredient) {
        this.level = level;
        this.uses = uses;
        this.speed = speed;
        this.damage = damage;
        this.enchantmentValue = enchantmentValue;
        this.repairIngredient = new LazyValue<>(repairIngredient);
    }

    public int getUses() {
        return this.uses;
    }

    public float getSpeed() {
        return this.speed;
    }

    public float getAttackDamageBonus() {
        return this.damage;
    }

    public int getLevel() {
        return this.level;
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}