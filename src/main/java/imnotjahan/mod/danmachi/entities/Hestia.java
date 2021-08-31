package imnotjahan.mod.danmachi.entities;

import imnotjahan.mod.danmachi.entities.templates.GodBase;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.world.World;

public class Hestia extends GodBase
{
    public Hestia(EntityType<? extends CreatureEntity> entity, World world)
    {
        super(entity, world, "hestia");
    }
}
