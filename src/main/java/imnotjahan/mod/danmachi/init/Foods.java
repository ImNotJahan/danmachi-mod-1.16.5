package imnotjahan.mod.danmachi.init;

import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class Foods
{
    public static final Food JAGAMARUKUN = (new Food.Builder()).nutrition(3).saturationMod(0.3F).build();
    public static final Food CRYSTAL_DROP = (new Food.Builder()).nutrition(4).saturationMod(0.3F).build();

    public static final Food SOMA = (new Food.Builder()).nutrition(2).saturationMod(0.3F).alwaysEat()
            .effect(new EffectInstance(Effects.CONFUSION, 600, 4), 1)
            .effect(new EffectInstance(Effects.BLINDNESS, 600, 0), 0.9f)
            .effect(new EffectInstance(Effects.WEAKNESS, 600, 1), 0.8f)
            .effect(new EffectInstance(Effects.HEALTH_BOOST, 600, 4), 1).build();
    public static final Food MERMAID_BLOOD = (new Food.Builder()).nutrition(2).saturationMod(0.3F).alwaysEat()
            .effect(new EffectInstance(Effects.HEAL, 600, 2), 1).build();
}
