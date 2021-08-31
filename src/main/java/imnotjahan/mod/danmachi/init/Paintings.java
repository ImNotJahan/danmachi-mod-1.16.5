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


    public static RegistryObject<PaintingType> THE_RESOLUTION =
            PAINTING_TYPES.register("the_resolution", ()-> new PaintingType(16,32));

    public static RegistryObject<PaintingType> RYE_BREAD =
            PAINTING_TYPES.register("rye_bread", ()-> new PaintingType(16,32));
}
