package imnotjahan.mod.danmachi;

import imnotjahan.mod.danmachi.init.Blocks;
import imnotjahan.mod.danmachi.materials.ArmorMaterials;
import imnotjahan.mod.danmachi.materials.ItemTiers;
import imnotjahan.mod.danmachi.objects.SmithingAnvil;
import imnotjahan.mod.danmachi.objects.armor.HadesHead;
import imnotjahan.mod.danmachi.objects.armor.SalamanderWool;
import imnotjahan.mod.danmachi.objects.armor.SizeableArmor;
import imnotjahan.mod.danmachi.objects.sword.Hakugen;
import imnotjahan.mod.danmachi.objects.sword.SwordAir;
import imnotjahan.mod.danmachi.objects.sword.TooltipSword;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraft.item.SwordItem;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.StringTextComponent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistryEntry;

import static net.minecraft.item.Items.GLASS_BOTTLE;

@Mod.EventBusSubscriber(modid = Reference.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class EventSubscriber
{
    @SubscribeEvent
    public static void onRegisterItems(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(
                // ingots
                setup(new Item(new Item.Properties().tab(Main.MaterialsGroup)), "orichalcum_ingot"),
                setup(new Item(new Item.Properties().tab(Main.MaterialsGroup)), "adamantite_ingot"),
                setup(new Item(new Item.Properties().tab(Main.MaterialsGroup)), "mythril_ingot"),
                setup(new Item(new Item.Properties().tab(Main.MaterialsGroup)), "damascus_steel"),

                // mob drops
                setup(new Item(new Item.Properties().tab(Main.MaterialsGroup)), "goblin_fang"),
                setup(new Item(new Item.Properties().tab(Main.MaterialsGroup)), "kobold_nail"),
                setup(new Item(new Item.Properties().tab(Main.MaterialsGroup)), "almiraj_fur"),
                setup(new Item(new Item.Properties().tab(Main.MaterialsGroup)), "lygerfang_fang"),
                setup(new Item(new Item.Properties().tab(Main.MaterialsGroup)), "lygerfang_fur"),
                setup(new Item(new Item.Properties().tab(Main.MaterialsGroup)), "minotaur_horn"),
                setup(new Item(new Item.Properties().tab(Main.MaterialsGroup)), "bugbear_nail"),
                setup(new Item(new Item.Properties().tab(Main.MaterialsGroup)), "metal_rabbit_fur"),
                setup(new Item(new Item.Properties().tab(Main.MaterialsGroup)), "sword_stag_antler"),
                setup(new Item(new Item.Properties().tab(Main.MaterialsGroup)), "magic_stone"),
                setup(new Item(new Item.Properties().tab(Main.MaterialsGroup)), "special_magic_stone"),

                // other
                setup(new Item(new Item.Properties().tab(Main.MaterialsGroup)), "ichor"),
                setup(new Item(new Item.Properties().tab(Main.MaterialsGroup)), "urga_blade"),
                setup(new Item(new Item.Properties().tab(Main.MaterialsGroup)), "guide_book"),
                setup(new Item(new Item.Properties().tab(Main.MaterialsGroup)), "grimoire"),

                // weapons & tools
                //short
                setup(new SwordItem(ItemTiers.HESTIA_KNIFE, 4, -2F,
                        (new Item.Properties()).tab(Main.ToolGroup)), "hestia_knife"),
                setup(new Hakugen(), "hakugen"),
                setup(new SwordItem(ItemTiers.HAKUGEN, 4, -2.2F,
                        (new Item.Properties()).tab(Main.ToolGroup)), "ushiwakamaru"),
                setup(new SwordAir(), "sword_air"),
                setup(new SwordItem(ItemTiers.DAGGER, 4, -2.8F,
                        (new Item.Properties()).tab(Main.ToolGroup)), "dagger"),

                //long
                setup(new SwordItem(ItemTiers.DESPERATE, 4, -2.4F,
                        (new Item.Properties()).tab(Main.ToolGroup)), "desperate"),
                setup(new SwordItem(ItemTiers.URGA, 4, -0.7F,
                        (new Item.Properties()).tab(Main.ToolGroup)), "urga"),
                setup(new TooltipSword(ItemTiers.MAGIC_SWORD, 4, -1.4F,
                        (new Item.Properties()).tab(Main.ToolGroup),
                        new StringTextComponent("Right click to spray fire")), "fire_magic_sword"),
                setup(new TooltipSword(ItemTiers.MAGIC_SWORD, 4, -1.4F,
                        (new Item.Properties()).tab(Main.ToolGroup),
                        new StringTextComponent("Right click to spread ice")), "ice_magic_sword"),
                setup(new SwordItem(ItemTiers.GREATSWORD, 4, -1.4F,
                        (new Item.Properties()).tab(Main.ToolGroup)), "greatsword"),
                setup(new SwordItem(ItemTiers.KOTETSU, 4, -2.F,
                        (new Item.Properties()).tab(Main.ToolGroup)), "kotetsu"),
                setup(new SwordItem(ItemTier.IRON, 4, -2.4F,
                        (new Item.Properties()).tab(Main.ToolGroup)), "kodachi_futaba"),
                setup(new SwordItem(ItemTiers.GREATSWORD, 4, -2.4F,
                        (new Item.Properties()).tab(Main.ToolGroup)), "great_podao_zaga"),
                setup(new SwordItem(ItemTiers.PROTAGONISTA, 4, -2.4F,
                        (new Item.Properties()).tab(Main.ToolGroup)), "protagonista"),
                setup(new SwordItem(ItemTiers.HAKUGEN, 4, -2.4F,
                        (new Item.Properties()).tab(Main.ToolGroup)), "fortia_spear"),

                //armor
                setup(new SizeableArmor(ArmorMaterials.RABBIT, EquipmentSlotType.CHEST,
                        (new Item.Properties()).tab(Main.ToolGroup)), "rabbit_armor_chestplate"),
                setup(new SizeableArmor(ArmorMaterials.RABBIT, EquipmentSlotType.LEGS,
                        (new Item.Properties()).tab(Main.ToolGroup)), "rabbit_armor_leggings"),
                setup(new SizeableArmor(ArmorMaterials.RABBIT, EquipmentSlotType.FEET,
                        (new Item.Properties()).tab(Main.ToolGroup)), "rabbit_armor_boots"),

                setup(new SizeableArmor(ArmorMaterials.DRESS, EquipmentSlotType.HEAD,
                        (new Item.Properties()).tab(Main.ToolGroup)), "armor_dress_helmet"),
                setup(new SizeableArmor(ArmorMaterials.DRESS, EquipmentSlotType.CHEST,
                        (new Item.Properties()).tab(Main.ToolGroup)), "armor_dress_chest"),
                setup(new SizeableArmor(ArmorMaterials.DRESS, EquipmentSlotType.LEGS,
                        (new Item.Properties()).tab(Main.ToolGroup)), "armor_dress_leggings"),
                setup(new SizeableArmor(ArmorMaterials.DRESS, EquipmentSlotType.FEET,
                        (new Item.Properties()).tab(Main.ToolGroup)), "armor_dress_boots"),

                setup(new SizeableArmor(ArmorMaterials.AMAZON, EquipmentSlotType.CHEST,
                        (new Item.Properties()).tab(Main.ToolGroup)), "amazon_armor_chest"),
                setup(new SizeableArmor(ArmorMaterials.AMAZON, EquipmentSlotType.LEGS,
                        (new Item.Properties()).tab(Main.ToolGroup)), "amazon_armor_leggings"),
                setup(new SizeableArmor(ArmorMaterials.AMAZON, EquipmentSlotType.FEET,
                        (new Item.Properties()).tab(Main.ToolGroup)), "amazon_armor_boots"),

                setup(new HadesHead(ArmorMaterials.HADES, EquipmentSlotType.HEAD,
                        (new Item.Properties()).tab(Main.ToolGroup)), "hades_head"),

                setup(new SalamanderWool(ArmorMaterials.SALAMANDER, EquipmentSlotType.CHEST,
                        (new Item.Properties()).tab(Main.ToolGroup)), "salamander_wool"),

                //food
                setup(new Item((new Item.Properties()).tab(Main.MaterialsGroup)
                                .food(imnotjahan.mod.danmachi.init.Foods.JAGAMARUKUN)), "jagamarukun"),
                setup(new Item((new Item.Properties()).tab(Main.MaterialsGroup)
                                .food(imnotjahan.mod.danmachi.init.Foods.CRYSTAL_DROP)), "crystal_drop"),

                //drinks
                setup(new Item((new Item.Properties())
                        .food(imnotjahan.mod.danmachi.init.Foods.SOMA).tab(Main.MaterialsGroup)
                        .stacksTo(16)), "soma"),
                setup(new Item((new Item.Properties()).craftRemainder(GLASS_BOTTLE)
                        .food(imnotjahan.mod.danmachi.init.Foods.MERMAID_BLOOD).
                                tab(Main.MaterialsGroup).stacksTo(1)), "mermaid_blood"),

                //blocks
                setup(new BlockItem(Blocks.ORICHALCUM_BLOCK,
                        (new Item.Properties()).tab(Main.BlockGroup)), "orichalcum_block"),
                setup(new BlockItem(Blocks.ADAMANTITE_BLOCK,
                        (new Item.Properties()).tab(Main.BlockGroup)), "adamantite_block"),
                setup(new BlockItem(Blocks.MYTHRIL_BLOCK,
                        (new Item.Properties()).tab(Main.BlockGroup)), "mythril_block"),
                setup(new BlockItem(Blocks.ORICHALCUM_ORE,
                        (new Item.Properties()).tab(Main.BlockGroup)), "orichalcum_ore"),
                setup(new BlockItem(Blocks.ADAMANTITE_ORE,
                        (new Item.Properties()).tab(Main.BlockGroup)), "adamantite_ore"),
                setup(new BlockItem(Blocks.MYTHRIL_ORE,
                        (new Item.Properties()).tab(Main.BlockGroup)), "mythril_ore"),
                setup(new BlockItem(Blocks.ORICHALCUM_WALL,
                        (new Item.Properties()).tab(Main.BlockGroup)), "orichalcum_wall"),
                setup(new BlockItem(Blocks.ADAMANTITE_WALL,
                        (new Item.Properties()).tab(Main.BlockGroup)), "adamantite_wall"),
                setup(new BlockItem(Blocks.SMITHING_ANVIL,
                        (new Item.Properties()).tab(Main.BlockGroup)), "smithing_anvil")
            );
    }

    @SubscribeEvent
    public static void onRegisterBlocks(RegistryEvent.Register<Block> event)
    {
        event.getRegistry().registerAll(
                setup(new Block(Block.Properties.of(Material.HEAVY_METAL)
                        .strength(50)), "orichalcum_block"),
                setup(new Block(Block.Properties.of(Material.HEAVY_METAL)
                        .strength(20)), "adamantite_block"),
                setup(new Block(Block.Properties.of(Material.METAL)
                        .strength(5)), "mythril_block"),
                setup(new Block(Block.Properties.of(Material.STONE)
                        .strength(25)), "orichalcum_ore"),
                setup(new Block(Block.Properties.of(Material.STONE)
                        .strength(10)), "adamantite_ore"),
                setup(new Block(Block.Properties.of(Material.STONE)
                        .strength(3)), "mythril_ore"),
                setup(new Block(Block.Properties.of(Material.HEAVY_METAL)
                        .strength(45)), "orichalcum_wall"),
                setup(new Block(Block.Properties.of(Material.HEAVY_METAL)
                        .strength(15)), "adamantite_wall"),
                setup(new SmithingAnvil(AbstractBlock.Properties.of(Material.HEAVY_METAL, MaterialColor.METAL)),
                        "smithing_anvil")
        );
    }

    public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final String name)
    {
        return setup(entry, new ResourceLocation(Reference.MODID, name));
    }

    public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final ResourceLocation registryName)
    {
        entry.setRegistryName(registryName);
        return entry;
    }
}