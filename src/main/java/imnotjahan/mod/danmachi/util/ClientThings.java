package imnotjahan.mod.danmachi.util;

import imnotjahan.mod.danmachi.gui.container.GodGui;
import net.minecraft.client.Minecraft;

public class ClientThings
{
    /**
     * For showing the gods interact menu, because having this in a class that
     * is also on the server would crash any dedicated one.
     * @param godName The name of the god
     * @param wantingBlood If the option to ask the god for blood should appear
     */
    public static void showGodGui(String godName, boolean wantingBlood)
    {
        Minecraft.getInstance().setScreen(new GodGui());
    }
}
