package imnotjahan.mod.danmachi.entities.models;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import imnotjahan.mod.danmachi.entities.Minotaur;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class MinotaurModel extends EntityModel<Minotaur>
{
    private final ModelRenderer rightArm;
    private final ModelRenderer rightLeg;
    private final ModelRenderer head;
    private final ModelRenderer chest;
    private final ModelRenderer leftArm;
    private final ModelRenderer leftLeg;
    private final ModelRenderer leftHornBase;
    private final ModelRenderer leftHornTip;
    private final ModelRenderer rightHornBase;
    private final ModelRenderer rightHornTip;
    private final ModelRenderer nose;

    public MinotaurModel() {
        texWidth = 64;
        texHeight = 64;

        rightArm = new ModelRenderer(this);
        rightArm.setPos(-5.0F, 2.0F, 0.0F);
        rightArm.texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

        rightLeg = new ModelRenderer(this);
        rightLeg.setPos(-1.9F, 12.0F, 0.0F);
        rightLeg.texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

        head = new ModelRenderer(this);
        head.setPos(0.0F, 0.0F, 0.0F);
        head.texOffs(2, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

        chest = new ModelRenderer(this);
        chest.setPos(0.0F, 0.0F, 0.0F);
        chest.texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);

        leftArm = new ModelRenderer(this);
        leftArm.setPos(5.0F, 2.0F, 0.0F);
        leftArm.texOffs(32, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

        leftLeg = new ModelRenderer(this);
        leftLeg.setPos(1.9F, 12.0F, 0.0F);
        leftLeg.texOffs(16, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

        leftHornBase = new ModelRenderer(this);
        leftHornBase.setPos(0.0F, 0.0F, 0.0F);
        setRotationAngle(leftHornBase, 0.0F, 0.1745F, 0.0F);
        leftHornBase.texOffs(40, 0).addBox(4.0F, -7.0F, -2.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);

        leftHornTip = new ModelRenderer(this);
        leftHornTip.setPos(0.0F, 0.0F, 0.0F);
        setRotationAngle(leftHornTip, 0.0F, 0.1745F, 0.0F);
        leftHornTip.texOffs(0, 0).addBox(7.0F, -7.0F, -5.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);

        rightHornBase = new ModelRenderer(this);
        rightHornBase.setPos(0.0F, 0.0F, 0.0F);
        setRotationAngle(rightHornBase, 0.0F, -0.1745F, 0.0F);
        rightHornBase.texOffs(0, 0).addBox(-8.0F, -7.0F, -2.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);

        rightHornTip = new ModelRenderer(this);
        rightHornTip.setPos(0.0F, 0.0F, 0.0F);
        setRotationAngle(rightHornTip, 0.0F, -0.1745F, 0.0F);
        rightHornTip.texOffs(0, 0).addBox(-8.0F, -7.0F, -5.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);

        nose = new ModelRenderer(this);
        nose.setPos(0.0F, 0.0F, 0.0F);
        nose.texOffs(56, 0).addBox(-2.0F, -4.0F, -6.0F, 4.0F, 4.0F, 2.0F, 0.0F, false);
    }

    @Override
    public void setupAnim(Minotaur p_225597_1_, float p_225597_2_, float p_225597_3_, float p_225597_4_, float p_225597_5_, float p_225597_6_)
    {

    }

    @Override
    public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay,
                               float red, float green, float blue, float alpha){
        rightArm.render(matrixStack, buffer, packedLight, packedOverlay);
        rightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
        head.render(matrixStack, buffer, packedLight, packedOverlay);
        chest.render(matrixStack, buffer, packedLight, packedOverlay);
        leftArm.render(matrixStack, buffer, packedLight, packedOverlay);
        leftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
        leftHornBase.render(matrixStack, buffer, packedLight, packedOverlay);
        leftHornTip.render(matrixStack, buffer, packedLight, packedOverlay);
        rightHornBase.render(matrixStack, buffer, packedLight, packedOverlay);
        rightHornTip.render(matrixStack, buffer, packedLight, packedOverlay);
        nose.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.xRot = x;
        modelRenderer.yRot = y;
        modelRenderer.zRot = z;
    }
}
