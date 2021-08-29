package imnotjahan.mod.danmachi.objects.sword;

import imnotjahan.mod.danmachi.Main;
import imnotjahan.mod.danmachi.materials.ItemTiers;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.ModifiableAttributeInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.item.SwordItem;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import java.util.List;
import java.util.function.Predicate;

public class SwordAir extends SwordItem
{
    private static final Predicate<LivingEntity> LIVING_ENTITY_SELECTOR = (entity) ->
    {
        return entity.attackable();
    };

    private static final EntityPredicate TARGETING_CONDITIONS = (new EntityPredicate()).range(4).selector(LIVING_ENTITY_SELECTOR);

    public SwordAir()
    {
        super(ItemTiers.SWORD_AIR, 3, -2.4F,
                (new Properties()).tab(Main.ToolGroup));
    }

    @Override
    public void appendHoverText(ItemStack stack, World world, List<ITextComponent> tooltip, ITooltipFlag flag)
    {
        tooltip.add(new TranslationTextComponent("tooltips.sword_air"));
        super.appendHoverText(stack, world, tooltip, flag);
    }

    @Override
    public ActionResultType onItemUseFirst(ItemStack stack, ItemUseContext context)
    {
        if(context.getPlayer() != null)
        {
            if(context.getPlayer().isOnGround())
            {
                context.getPlayer().addEffect(new EffectInstance(Effects.JUMP, 10, 5));
                context.getPlayer().jumpFromGround();
                context.getPlayer().removeEffect(Effects.JUMP);

                ModifiableAttributeInstance gravity = context.getPlayer().getAttribute(
                        net.minecraftforge.common.ForgeMod.ENTITY_GRAVITY.get());
                gravity.setBaseValue(gravity.getValue() * 3);

                context.getPlayer().playSound(SoundEvents.ANCIENT_DEBRIS_BREAK, 5, 5);

                PlayerEntity player = context.getPlayer();
                List<LivingEntity> entities = context.getPlayer().getCommandSenderWorld()
                        .getNearbyEntities(LivingEntity.class, TARGETING_CONDITIONS, player,
                                player.getBoundingBox().inflate(4.0D, 4.0D, 4.0D));

                entities.forEach((entity) ->
                        entity.hurt(DamageSource.playerAttack(player), 20));

                damageItem(context.getItemInHand(), 10, player, (something) -> {
                    something.broadcastBreakEvent(context.getHand());
                });

                context.getPlayer().getCommandSenderWorld().addParticle(ParticleTypes.ASH,
                        player.getX() - 2, player.getY(), player.getZ() - 2,
                        player.getX() + 2, player.getY() + 1, player.getZ() + 2);

                return ActionResultType.SUCCESS;
            }
        }

        return ActionResultType.FAIL;
    }
}
