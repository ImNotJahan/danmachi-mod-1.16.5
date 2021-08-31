package imnotjahan.mod.danmachi.init;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import imnotjahan.mod.danmachi.Main;
import imnotjahan.mod.danmachi.Reference;
import imnotjahan.mod.danmachi.entities.Goblin;
import imnotjahan.mod.danmachi.entities.Hestia;
import imnotjahan.mod.danmachi.entities.Minotaur;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntitySpawnPlacementRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.gen.Heightmap;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.List;

@Mod.EventBusSubscriber(modid = Reference.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Entities
{
    public static final DeferredRegister<EntityType<?>> ENTITY_DEFERRED = DeferredRegister.create(ForgeRegistries.ENTITIES, Reference.MODID);
    private static final List<Item> SPAWN_EGGS = Lists.newArrayList();

    public static final RegistryObject<EntityType<Goblin>> GOBLIN = createEntity("goblin", Goblin::new,
            1F, 1.7F, 0x000000, 0xFFFFFF);
    public static final RegistryObject<EntityType<Minotaur>> MINOTAUR = createEntity("minotaur", Minotaur::new,
            1F, 2.2F, 0x000000, 0xFFFFFF);
    public static final RegistryObject<EntityType<Hestia>> HESTIA = createEntity("hestia", Hestia::new,
            1F, 2F, 0x000000, 0xFFFFFF);

    private static <T extends Entity> RegistryObject<EntityType<T>>
    createEntity(String name, EntityType.IFactory<T> factory, float width, float height, int eggPrimary, int eggSecondary)
    {
        ResourceLocation location = new ResourceLocation(Reference.MODID, name);
        EntityType<T> entity = EntityType.Builder.of(factory, EntityClassification.MONSTER).sized(width, height)
                .setTrackingRange(64).setUpdateInterval(1).build(location.toString());
        Item spawnEgg = new SpawnEggItem(entity, eggPrimary, eggSecondary, (new Item.Properties()).tab(Main.EggGroup));
        spawnEgg.setRegistryName(new ResourceLocation(Reference.MODID, name + "_spawn_egg"));
        SPAWN_EGGS.add(spawnEgg);

        return ENTITY_DEFERRED.register(name, () -> entity);
    }

    @SubscribeEvent
    public static void registerEntities(RegistryEvent.Register<EntityType<?>> event)
    {
        EntitySpawnPlacementRegistry.register(GOBLIN.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND,
                Heightmap.Type.WORLD_SURFACE, Goblin::checkMobSpawnRules);
        EntitySpawnPlacementRegistry.register(MINOTAUR.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND,
                Heightmap.Type.WORLD_SURFACE, Minotaur::checkMobSpawnRules);
        EntitySpawnPlacementRegistry.register(HESTIA.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND,
                Heightmap.Type.WORLD_SURFACE, Hestia::checkMobSpawnRules);
    }

    @SubscribeEvent
    public static void addEntityAttributes(EntityAttributeCreationEvent event)
    {
        event.put(GOBLIN.get(), Goblin.createAttributes().build());
        event.put(MINOTAUR.get(), Minotaur.createAttributes().build());
        event.put(HESTIA.get(), Hestia.createGodAttributes().build());
    }

    @SubscribeEvent
    public static void registerSpawnEggs(RegistryEvent.Register<Item> event)
    {
        for (Item spawnEgg : SPAWN_EGGS)
        {
            Preconditions.checkNotNull(spawnEgg.getRegistryName(), "registryName");
            event.getRegistry().register(spawnEgg);
        }
    }
}
