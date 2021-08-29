package imnotjahan.mod.danmachi.objects.armor;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;

public class SalamanderWool extends SizeableArmor
{
    public SalamanderWool(IArmorMaterial material, EquipmentSlotType slot, Properties properties)
    {
        super(material, slot, properties);
    }

    @Override
    public void onArmorTick(ItemStack stack, World world, PlayerEntity player)
    {
        player.addEffect(new EffectInstance(Effects.FIRE_RESISTANCE, 2, 1, false,
                false, false));

        super.onArmorTick(stack, world, player);
    }
}
