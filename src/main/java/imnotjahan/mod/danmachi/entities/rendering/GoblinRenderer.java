package imnotjahan.mod.danmachi.entities.rendering;

import imnotjahan.mod.danmachi.Reference;
import imnotjahan.mod.danmachi.entities.Goblin;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.model.ZombieModel;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class GoblinRenderer extends MobRenderer<Goblin, ZombieModel<Goblin>>
{
    public GoblinRenderer(EntityRendererManager context)
    {
        super(context, new ZombieModel<>(0, true), 1);
    }

    @Override
    public ResourceLocation getTextureLocation(Goblin p_110775_1_)
    {
        return new ResourceLocation(Reference.MODID, "textures/entity/goblin.png");
    }
}