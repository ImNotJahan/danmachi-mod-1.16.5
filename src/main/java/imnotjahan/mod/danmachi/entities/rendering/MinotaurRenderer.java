package imnotjahan.mod.danmachi.entities.rendering;

import imnotjahan.mod.danmachi.Reference;
import imnotjahan.mod.danmachi.entities.Goblin;
import imnotjahan.mod.danmachi.entities.Minotaur;
import imnotjahan.mod.danmachi.entities.models.GoblinModel;
import imnotjahan.mod.danmachi.entities.models.MinotaurModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class MinotaurRenderer extends MobRenderer<Minotaur, MinotaurModel>
{
    public MinotaurRenderer(EntityRendererManager context)
    {
        super(context, new MinotaurModel(), 1.2f);
    }

    @Override
    public ResourceLocation getTextureLocation(Minotaur p_110775_1_)
    {
        return new ResourceLocation(Reference.MODID, "textures/entity/minotaur.png");
    }
}