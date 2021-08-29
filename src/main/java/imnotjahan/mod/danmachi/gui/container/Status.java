package imnotjahan.mod.danmachi.gui.container;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public final class Status extends Screen
{
    public Status() {
        super(new StringTextComponent("Status"));
    }

    @Override
    public void render(MatrixStack stack, int mouseX, int mouseY, float tick)
    {
        this.renderBackground(stack);
        font.draw(stack, new TranslationTextComponent("gui.status.level") + ": 1",
                width / 2, 10, 8);
        font.draw(stack, new TranslationTextComponent("gui.status.strength") + ": 1",
                width / 2, 40, 8);
        font.draw(stack, new TranslationTextComponent("gui.status.endurance") + ": 1",
                width / 2, 70, 8);
        font.draw(stack, new TranslationTextComponent("gui.status.dexterity") + ": 1",
                width / 2, 100, 8);
        font.draw(stack, new TranslationTextComponent("gui.status.agility") + ": 1",
                width / 2, 150, 8);
        font.draw(stack, new TranslationTextComponent("gui.status.magic") + ": 1",
                width / 2, 200, 8);

        super.render(stack, mouseX, mouseY, tick);
    }
}