package imnotjahan.mod.danmachi.init;

import imnotjahan.mod.danmachi.Reference;
import net.minecraft.entity.item.PaintingType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Paintings
{
    public static DeferredRegister<PaintingType> PAINTING_TYPES =
            DeferredRegister.create(ForgeRegistries.PAINTING_TYPES, Reference.MODID);

    public static RegistryObject<PaintingType> THE_SCREEM =
            PAINTING_TYPES.register("painting_name", ()-> new PaintingType(16,32));
}
