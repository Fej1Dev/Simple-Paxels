package fej.simplepaxels;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimplePaxels implements ModInitializer {
	
	public static final String MODID = "simple-paxels";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	//Registering Paxel Tag
	public static final TagKey<Block> PAXEL_TAG = TagKey.of(RegistryKeys.BLOCK, new Identifier(MODID, "paxel_tag"));

	//Making Items
	public static ToolItem WOODEN_PAXEL = new MiningToolItem(6.5F, -3.1F,
			ToolMaterials.WOOD, PAXEL_TAG, new Item.Settings());
	public static ToolItem STONE_PAXEL = new MiningToolItem(8.5F, -3.1F,
			ToolMaterials.STONE, PAXEL_TAG, new Item.Settings());
	public static ToolItem IRON_PAXEL = new MiningToolItem(8.5F, -3F,
			ToolMaterials.IRON, PAXEL_TAG, new Item.Settings());
	public static ToolItem GOLDEN_PAXEL = new MiningToolItem(6.5F, -2.9F,
			ToolMaterials.GOLD, PAXEL_TAG, new Item.Settings());
	public static ToolItem DIAMOND_PAXEL = new MiningToolItem(8.5F, -2.9F,
			ToolMaterials.DIAMOND, PAXEL_TAG, new Item.Settings());
	public static ToolItem NETHERITE_PAXEL = new MiningToolItem(9.5F, -2.9F,
			ToolMaterials.NETHERITE, PAXEL_TAG, new Item.Settings());

	@Override
	public void onInitialize() {
		LOGGER.info("Registering Paxels");
		//Adding Custom Items to Item Group
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {
			content.addAfter(Items.WOODEN_HOE, WOODEN_PAXEL);
			content.addAfter(Items.STONE_HOE, STONE_PAXEL);
			content.addAfter(Items.IRON_HOE, IRON_PAXEL);
			content.addAfter(Items.GOLDEN_HOE, GOLDEN_PAXEL);
			content.addAfter(Items.DIAMOND_HOE, DIAMOND_PAXEL);
			content.addAfter(Items.NETHERITE_HOE, NETHERITE_PAXEL);
		});
		//Registering Items
		Registry.register(Registries.ITEM, new Identifier(MODID, "wooden_paxel"), WOODEN_PAXEL);
		Registry.register(Registries.ITEM, new Identifier(MODID, "stone_paxel"), STONE_PAXEL);
		Registry.register(Registries.ITEM, new Identifier(MODID, "iron_paxel"), IRON_PAXEL);
		Registry.register(Registries.ITEM, new Identifier(MODID, "golden_paxel"), GOLDEN_PAXEL);
		Registry.register(Registries.ITEM, new Identifier(MODID, "diamond_paxel"), DIAMOND_PAXEL);
		Registry.register(Registries.ITEM, new Identifier(MODID, "netherite_paxel"), NETHERITE_PAXEL);
		LOGGER.info("Done Registering Paxels");
	}
}