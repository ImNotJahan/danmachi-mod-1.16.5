package imnotjahan.mod.danmachi;

import imnotjahan.mod.danmachi.init.Items;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;

@Mod(Reference.MODID)
public class Main
{
    public static final ItemGroup ToolGroup =
            new MenuGroup(Reference.MODID + "_tools", () -> new ItemStack(Items.DESPERATE));

    public static final ItemGroup MaterialsGroup =
            new MenuGroup(Reference.MODID + "_materials", () -> new ItemStack(Items.MINOTAUR_HORN));

    public static final ItemGroup BlockGroup =
            new MenuGroup(Reference.MODID + "_blocks", () -> new ItemStack(Items.ADAMANTITE_ORE));

    public static final ItemGroup EggGroup =
            new MenuGroup(Reference.MODID + "_eggs", () -> new ItemStack(Items.ADAMANTITE_ORE));
}
