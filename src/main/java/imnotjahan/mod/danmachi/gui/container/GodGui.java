package imnotjahan.mod.danmachi.gui.container;

import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.gui.screen.AddServerScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.Widget;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import java.util.ArrayList;
import java.util.List;

public final class GodGui extends Screen
{
    public GodGui() {
        super(new StringTextComponent("Hestia"));
    }

    String currentGodResponse = "What do you want";
    List<Button> buttons = new ArrayList<>();

    @Override
    protected void init()
    {
        buttons.add(
                new Button(this.width / 2 + 4 + 50, this.height - 52, 100,
                20, new StringTextComponent("Could I join your familia"), (p_214288_1_) ->
                {
                    currentGodResponse = "Well I don't seem to have any at the moment, so why not\n" +
                    "Give me a moment, and I'll give you a falna";
                    buttons.clear();
                    buttons.add(
                        new Button(this.width / 2 + 4 + 50, this.height - 52, 100,
                        20, new StringTextComponent("Okay"), (p_214288_2_) ->
                        {
                            buttons.clear();
                            currentGodResponse = "Anddddd done";
                        }));
                }
        ));

        buttons.add(
                new Button(this.width / 2 + 4 + 50, this.height - 52 * 2, 100,
                        20, new StringTextComponent("Nothing"), (p_214288_1_) ->
                {
                    minecraft.setScreen(null);
                }
                ));
    }

    @Override
    public void render(MatrixStack stack, int mouseX, int mouseY, float tick)
    {
        this.renderBackground(stack);


        font.draw(stack, currentGodResponse, width / 2, 20, 8);

        buttons.forEach(button ->
        {
            addButton(button);
        });

        super.render(stack, mouseX, mouseY, tick);
    }
}