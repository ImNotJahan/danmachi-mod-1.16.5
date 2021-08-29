package imnotjahan.mod;

import imnotjahan.mod.danmachi.Reference;
import imnotjahan.mod.danmachi.gui.container.Status;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import org.lwjgl.glfw.GLFW;

@Mod.EventBusSubscriber(modid = Reference.MODID, value = Dist.CLIENT)
public final class ClientEventSubscriber
{
    public static final KeyBinding STATUS = new KeyBinding("key.status", GLFW.GLFW_KEY_V,
            "key.categories.danmachi");
    public static final KeyBinding ARMOR_DRESS = new KeyBinding("key.armor_dress", GLFW.GLFW_KEY_U,
            "key.categories.danmachi");

    static
    {
        ClientRegistry.registerKeyBinding(STATUS);
        ClientRegistry.registerKeyBinding(ARMOR_DRESS);
    }

    @SubscribeEvent
    public void onClientTickEvent(TickEvent.ClientTickEvent event)
    {
        if(STATUS.isDown())
        {
            Minecraft.getInstance().setScreen(new Status());
        }

        System.out.println(0);
    }
}
