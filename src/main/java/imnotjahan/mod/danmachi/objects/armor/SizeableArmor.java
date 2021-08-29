package imnotjahan.mod.danmachi.objects.armor;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.entity.model.PlayerModel;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;

public class SizeableArmor extends ArmorItem
{
    float size = 0.2f;
    public SizeableArmor(IArmorMaterial material, EquipmentSlotType slot, Properties properties)
    {
        super(material, slot, properties);
    }

    public SizeableArmor(IArmorMaterial material, EquipmentSlotType slot, Properties properties, float size)
    {
        super(material, slot, properties);
        this.size = size;
    }

    @Override
    public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlotType armorSlot, A _default)
    {
        return (A) new PlayerModel(size, false);
    }
}
