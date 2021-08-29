package imnotjahan.mod.danmachi.objects;

import imnotjahan.mod.danmachi.Main;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.AnvilBlock;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.inventory.container.RepairContainer;
import net.minecraft.inventory.container.SimpleNamedContainerProvider;
import net.minecraft.stats.Stats;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.IWorldPosCallable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

public class SmithingAnvil extends AnvilBlock
{
    public SmithingAnvil(AbstractBlock.Properties properties)
    {
        super(properties);
    }

    @Override
    public ActionResultType use(BlockState state, World world, BlockPos pos, PlayerEntity entity,
                                Hand hand, BlockRayTraceResult result) {
        if (world.isClientSide) {
            return ActionResultType.SUCCESS;
        } else {
            entity.openMenu(state.getMenuProvider(world, pos));
            return ActionResultType.CONSUME;
        }
    }
    
    @Override
    public INamedContainerProvider getMenuProvider(BlockState state, World world, BlockPos pos) {
        return new SimpleNamedContainerProvider((a, b, c) ->
                new RepairContainer(a, b, IWorldPosCallable.create(world, pos)),
                new TranslationTextComponent("block.danmachi.smithing_anvil"));
    }
}
