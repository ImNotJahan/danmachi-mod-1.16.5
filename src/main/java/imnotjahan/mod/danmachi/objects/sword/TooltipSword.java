package imnotjahan.mod.danmachi.objects.sword;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

import java.util.List;

public class TooltipSword extends SwordItem
{
    ITextComponent tooltip;

    public TooltipSword(IItemTier p_i48460_1_, int p_i48460_2_, float p_i48460_3_, Properties p_i48460_4_,
                        ITextComponent tooltip)
    {
        super(p_i48460_1_, p_i48460_2_, p_i48460_3_, p_i48460_4_);

        this.tooltip = tooltip;
    }

    @Override
    public void appendHoverText(ItemStack stack, World world, List<ITextComponent> tooltips, ITooltipFlag flag)
    {
        tooltips.add(tooltip);
        super.appendHoverText(stack, world, tooltips, flag);
    }
}
