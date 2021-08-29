package imnotjahan.mod.danmachi.objects.sword;

import imnotjahan.mod.danmachi.Main;
import imnotjahan.mod.danmachi.materials.ItemTiers;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.item.SwordItem;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.DamageSource;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import java.util.List;

public class Hakugen extends SwordItem
{
    public Hakugen()
    {
        super(ItemTiers.HAKUGEN, 1, -2.4F,
                (new Item.Properties()).tab(Main.ToolGroup));
    }

    @Override
    public void appendHoverText(ItemStack stack, World world, List<ITextComponent> tooltip, ITooltipFlag flag)
    {
        tooltip.add(new TranslationTextComponent("tooltips.hakugen"));
        super.appendHoverText(stack, world, tooltip, flag);
    }

    @Override
    public ActionResultType onItemUseFirst(ItemStack stack, ItemUseContext context)
    {
        if(context.getPlayer() != null)
        {
            context.getPlayer().hurt(DamageSource.GENERIC, 5);

            context.getPlayer().removeEffect(Effects.POISON);
            context.getPlayer().removeEffect(Effects.WITHER);
            context.getPlayer().removeEffect(Effects.HARM);
            context.getPlayer().removeEffect(Effects.WEAKNESS);

            return ActionResultType.SUCCESS;
        }

        return ActionResultType.FAIL;
    }
}
