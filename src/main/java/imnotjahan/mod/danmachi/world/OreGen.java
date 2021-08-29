package imnotjahan.mod.danmachi.world;

import imnotjahan.mod.danmachi.Reference;
import imnotjahan.mod.danmachi.init.Blocks;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.BlockMatchRuleTest;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;

@Mod.EventBusSubscriber
public class OreGen
{
    private static final ArrayList<ConfiguredFeature<?, ?>> overworldOres = new ArrayList<ConfiguredFeature<?, ?>>();

    public static void registerOres()
    {
        overworldOres.add(register("adamantite_ore", Feature.ORE.configured(new OreFeatureConfig(
                OreFeatureConfig.FillerBlockType.NATURAL_STONE, Blocks.ADAMANTITE_ORE.getBlock().defaultBlockState(), 4)) //Vein Size
                .range(64).squared()
                .countRandom(64)));

        overworldOres.add(register("orichalcum_ore", Feature.ORE.configured(new OreFeatureConfig(
                OreFeatureConfig.FillerBlockType.NATURAL_STONE, Blocks.ADAMANTITE_ORE.getBlock().defaultBlockState(), 4)) //Vein Size
                .range(64).squared()
                .countRandom(64)));

        overworldOres.add(register("mythril_ore", Feature.ORE.configured(new OreFeatureConfig(
                OreFeatureConfig.FillerBlockType.NATURAL_STONE, Blocks.ADAMANTITE_ORE.getBlock().defaultBlockState(), 4)) //Vein Size
                .range(64).squared()
                .countRandom(64)));
    }

    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void gen(BiomeLoadingEvent event)
    {
        BiomeGenerationSettingsBuilder generation = event.getGeneration();

        for(ConfiguredFeature<?, ?> ore : overworldOres)
        {
            if (ore != null) generation.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ore);
        }
    }

    private static <FC extends IFeatureConfig> ConfiguredFeature<FC, ?> register(String name, ConfiguredFeature<FC, ?> configuredFeature) {
        return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, Reference.MODID + ":" + name, configuredFeature);
    }

}
