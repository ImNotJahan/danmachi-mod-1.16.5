package imnotjahan.mod.danmachi;

import imnotjahan.mod.danmachi.init.Entities;
import imnotjahan.mod.danmachi.init.Items;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

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
            new MenuGroup(Reference.MODID + "_eggs", () -> new ItemStack(Items.GOBLIN_SPAWN_EGG));

    public Main()
    {
        final IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        eventBus.addListener(this::SetupClient);

        registerDeferredRegistries(eventBus);
    }

    public void SetupClient(final FMLClientSetupEvent event)
    {
        ClientEventSubscriber.init();
    }

    public static void registerDeferredRegistries(IEventBus modBus)
    {
        Entities.ENTITY_DEFERRED.register(modBus);
    }
}
