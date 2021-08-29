package imnotjahan.mod.danmachi.entities.models;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import imnotjahan.mod.danmachi.entities.Goblin;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class GoblinModel extends EntityModel<Goblin>
{

    private final ModelRenderer rightArm;
    private final ModelRenderer rightLeg;
    private final ModelRenderer head;
    private final ModelRenderer chest;
    private final ModelRenderer leftArm;
    private final ModelRenderer leftLeg;
    private final ModelRenderer rightHorn;
    private final ModelRenderer leftHorn;

    public GoblinModel()
    {
        texWidth = 64;
        texHeight = 64;

        rightArm = new ModelRenderer(this);
        rightArm.setPos(-5.0F, 3.0F, 0.0F);
        rightArm.texOffs(40, 16).addBox(-3.0F, 5.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

        rightLeg = new ModelRenderer(this);
        rightLeg.setPos(-1.9F, 18.0F, 0.0F);
        rightLeg.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

        head = new ModelRenderer(this);
        head.setPos(0.0F, 0.0F, 0.0F);
        head.texOffs(0, 0).addBox(-4.0F, -2.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

        chest = new ModelRenderer(this);
        chest.setPos(0.0F, 0.0F, 0.0F);
        chest.texOffs(16, 16).addBox(-4.0F, 6.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);

        leftArm = new ModelRenderer(this);
        leftArm.setPos(0.0F, 3.0F, 0.0F);
        leftArm.texOffs(32, 48).addBox(4.0F, 5.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

        leftLeg = new ModelRenderer(this);
        leftLeg.setPos(1.9F, 18.0F, 0.0F);
        leftLeg.texOffs(16, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

        rightHorn = new ModelRenderer(this);
        rightHorn.setPos(0.0F, 0.0F, 0.0F);
        rightHorn.texOffs(0, 0).addBox(-3.0F, -3.0F, -5.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        leftHorn = new ModelRenderer(this);
        leftHorn.setPos(0.0F, 0.0F, 0.0F);
        leftHorn.texOffs(0, 0).addBox(2.0F, -3.0F, -5.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
    }

    @Override
    public void setupAnim(Goblin p_225597_1_, float p_225597_2_, float p_225597_3_, float p_225597_4_, float p_225597_5_, float p_225597_6_)
    {

    }

    @Override
    public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay,
                               float red, float green, float blue, float alpha)
    {
        matrixStack.scale(0.7f, 0.7f, 0.7f);
        rightArm.render(matrixStack, buffer, packedLight, packedOverlay);
        rightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
        head.render(matrixStack, buffer, packedLight, packedOverlay);
        chest.render(matrixStack, buffer, packedLight, packedOverlay);
        leftArm.render(matrixStack, buffer, packedLight, packedOverlay);
        leftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
        rightHorn.render(matrixStack, buffer, packedLight, packedOverlay);
        leftHorn.render(matrixStack, buffer, packedLight, packedOverlay);
    }
}
