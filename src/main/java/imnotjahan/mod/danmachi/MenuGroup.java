package imnotjahan.mod.danmachi;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import java.util.function.Supplier;

public class MenuGroup extends ItemGroup
{
    private final Supplier<ItemStack> iconSupplier;

    public MenuGroup(final String name, final Supplier<ItemStack> iconSupplier)
    {
        super(name);
        this.iconSupplier = iconSupplier;
    }

    @Override
    public ItemStack makeIcon()
    {
        return iconSupplier.get();
    }
}
